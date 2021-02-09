package de.itagile.golf.operation;

import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import de.itagile.golf.EinfacheScorecard;
import org.junit.Test;

import de.itagile.golf.Operation;
import de.itagile.golf.Scorecard;

public class SchlagzahlausgabeTest {

	private Scorecard scorecard = mock(Scorecard.class);
	private Operation folgeoperation = mock(Operation.class);
	private Operation schlagzahlausgabe = new Schlagzahlausgabe(folgeoperation);

	@Test
	public void keinSchlag() throws Exception {
		Scorecard scorecard = new EinfacheScorecard();
		Operation schlagzahlausgabe = new Schlagzahlausgabe(new Lochausgabe());
		assertThat(schlagzahlausgabe.fuehreAus(scorecard), containsString("Du hast noch keinen Schlag"));
	}

	@Test
	public void meldetEinenSchlag() throws Exception {
		when(scorecard.anzahlSchlaege()).thenReturn(1);
		assertThat(schlagzahlausgabe.fuehreAus(scorecard), containsString("Du hast 1 Schlag"));
	}

	@Test
	public void meldetEinenZweitenSchlag() throws Exception {
		//scorecard.erhoeheAnzahlSchlaege();
		when(scorecard.anzahlSchlaege()).thenReturn(2);
		assertThat(schlagzahlausgabe.fuehreAus(scorecard), containsString("Du hast 2 Schläge"));
	}


	@Test
	public void meldetEinenErstenSchlagNachLochwechsel() throws Exception {
		Scorecard scorecard = new EinfacheScorecard();
		scorecard.erhoeheAnzahlSchlaege();
		scorecard.erhoeheAnzahlSchlaege();
		scorecard.schliesseLochAb();
		scorecard.erhoeheAnzahlSchlaege();
		Operation schlagzahlausgabe = new Schlagzahlausgabe(new Lochausgabe());
		assertThat(schlagzahlausgabe.fuehreAus(scorecard), containsString("Du hast 1 Schlag"));
	}
	
	@Test
	public void integriertAusgabeDerFolgeoperation() throws Exception {
		when(folgeoperation.fuehreAus(scorecard)).thenReturn("folgeausgabe");
		assertThat(schlagzahlausgabe.fuehreAus(scorecard), containsString("folgeausgabe"));
	}

}
