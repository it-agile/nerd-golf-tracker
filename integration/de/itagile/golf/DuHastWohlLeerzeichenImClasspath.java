package de.itagile.golf;

import static org.hamcrest.CoreMatchers.not;
import static org.junit.Assert.assertThat;
import static org.junit.matchers.JUnitMatchers.containsString;

import org.junit.Test;

public class DuHastWohlLeerzeichenImClasspath {

	@Test
	public void undDasIstBoese() throws Exception {
		String classpath = System.getProperty("java.class.path");
		assertThat(classpath, not(containsString(" ")));
	}
}
