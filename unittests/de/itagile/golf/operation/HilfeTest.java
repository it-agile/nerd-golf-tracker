package de.itagile.golf.operation;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

import org.junit.Test;


public class HilfeTest {

	
	@Test
	public void zeigtIntroAn() throws Exception {
		assertThat(new Hilfe().fuehreAus(null), is("Ich reagiere auf:"));
	}
}
