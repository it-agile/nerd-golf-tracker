package de.itagile.golf.konsole;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class KonsoleEncodingTest {
	
	@Test
	void ersetztCp1252DurchCp850FuerWindowsKonsolen() throws Exception {
		assertThat(KonsoleEncoding.fuerSystemEncoding("Cp1252"), is("Cp850"));
	}
	
	@Test
	void waehltUtf8Andernfalls() throws Exception {
		assertThat(KonsoleEncoding.fuerSystemEncoding("foo"), is("UTF-8"));
	}

}
