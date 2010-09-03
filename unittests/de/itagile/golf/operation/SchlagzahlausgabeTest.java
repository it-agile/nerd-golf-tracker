package de.itagile.golf.operation;

import static org.hamcrest.Matchers.containsString;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Test;

import de.itagile.golf.Operation;
import de.itagile.golf.Scorecard;

public class SchlagzahlausgabeTest {

	private Scorecard scorecard = mock(Scorecard.class);
	private Operation schlagzahlausgabe = new Schlagzahlausgabe();
	
	@Test
	public void meldetEinenSchlag() throws Exception {
		when(scorecard.anzahlSchlaege()).thenReturn(1);
		assertThat(schlagzahlausgabe.fuehreAus(scorecard), containsString("1 Schlag"));
	}
	
	@Test
	public void meldetMehrereSchlaege() throws Exception {
		when(scorecard.anzahlSchlaege()).thenReturn(2);
		assertThat(schlagzahlausgabe.fuehreAus(scorecard), containsString("2 Schläge"));
	}
	
	@Test
	public void meldetAktuellesLoch() throws Exception {
		when(scorecard.aktuellesLoch()).thenReturn(42);
		assertThat(schlagzahlausgabe.fuehreAus(scorecard), containsString("42. Loch"));
	}

}
