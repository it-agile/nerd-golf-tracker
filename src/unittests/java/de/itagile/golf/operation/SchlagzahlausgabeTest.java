package de.itagile.golf.operation;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;

import de.itagile.golf.Operation;
import de.itagile.golf.Scorecard;

class SchlagzahlausgabeTest {

	private Scorecard scorecard = mock(Scorecard.class);
	private Operation folgeoperation = mock(Operation.class);
	private Operation schlagzahlausgabe = new Schlagzahlausgabe(folgeoperation);
	
	@Test
	void meldetEinenSchlag() throws Exception {
		when(scorecard.anzahlSchlaege()).thenReturn(1);
		assertThat(schlagzahlausgabe.fuehreAus(scorecard), containsString("1 Schlag"));
	}
	
	@Test
	void integriertAusgabeDerFolgeoperation() throws Exception {
		when(folgeoperation.fuehreAus(scorecard)).thenReturn("folgeausgabe");
		assertThat(schlagzahlausgabe.fuehreAus(scorecard), containsString("folgeausgabe"));
	}

}
