package de.itagile.golf.operation;

import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Test;

import de.itagile.golf.Operation;
import de.itagile.golf.Scorecard;

public class SchlagzahlausgabeTest {

	private Scorecard scorecard = mock(Scorecard.class);
	private Operation folgeoperation = mock(Operation.class);
	private Operation schlagzahlausgabe = new Schlagzahlausgabe(folgeoperation);
	
	@Test
	public void meldetEinenSchlag() throws Exception {
		when(scorecard.anzahlSchlaege()).thenReturn(1);
		assertThat(schlagzahlausgabe.fuehreAus(scorecard), containsString("1 Schlag"));
	}
	
	@Test
	public void integriertAusgabeDerFolgeoperation() throws Exception {
		when(folgeoperation.fuehreAus(scorecard)).thenReturn("folgeausgabe");
		assertThat(schlagzahlausgabe.fuehreAus(scorecard), containsString("folgeausgabe"));
	}

}
