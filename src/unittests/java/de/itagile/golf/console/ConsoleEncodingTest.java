package de.itagile.golf.console;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

import de.itagile.golf.console.ConsoleEncoding;

class ConsoleEncodingTest {
	
	@Test
	void ersetztCp1252DurchCp850FuerWindowsKonsolen() {
		assertThat(ConsoleEncoding.fuerSystemEncoding("Cp1252"), is("Cp850"));
	}
	
	@Test
	void waehltUtf8Andernfalls() {
		assertThat(ConsoleEncoding.fuerSystemEncoding("foo"), is("UTF-8"));
	}

}
