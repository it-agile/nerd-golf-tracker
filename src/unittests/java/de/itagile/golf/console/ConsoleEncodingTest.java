package de.itagile.golf.console;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

public class ConsoleEncodingTest {
	
	@Test
	public void replacesCp1252WithCp850ForWindowsConsoles() throws Exception {
		assertThat(ConsoleEncoding.forSystemEncoding("Cp1252"), is("Cp850"));
	}
	
	@Test
	public void chooseUtf8Otherwise() throws Exception {
		assertThat(ConsoleEncoding.forSystemEncoding("foo"), is("UTF-8"));
	}
}
