package de.itagile.golf.console;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class ConsoleEncodingTest {
	
	@Test
	void replacesCp1252ByCp850ForWindowsConsole() {
		assertThat(ConsoleEncoding.forSystemEncoding("Cp1252"), is("Cp850"));
	}
	
	@Test
	void choosesUtf8InAllOtherCases() {
		assertThat(ConsoleEncoding.forSystemEncoding("foo"), is("UTF-8"));
	}

}
