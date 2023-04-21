package de.itagile.golf.konsole;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

import de.itagile.golf.konsole.KonsoleEncoding;

public class KonsoleEncodingTest {
	
	@Test
	public void ersetztCp1252DurchCp850FuerWindowsKonsolen() throws Exception {
		assertThat(KonsoleEncoding.fuerSystemEncoding("Cp1252"), is("Cp850"));
	}
	
	@Test
	public void waehltUtf8Andernfalls() throws Exception {
		assertThat(KonsoleEncoding.fuerSystemEncoding("foo"), is("UTF-8"));
	}
}
