package de.itagile.golf;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;


public class EinfacheScorecardTest {

	private Scorecard scorecard = new EinfacheScorecard();
	
	@Test
	public void inkrementiertSchlagzahlEinmal() throws Exception {
		scorecard.erhoeheAnzahlSchlaege();
		assertThat(scorecard.anzahlSchlaege(), is(1));
	}
	
	@Test
	public void inkrementiertSchlagzahlMehrmals() throws Exception {
		scorecard.erhoeheAnzahlSchlaege();
		scorecard.erhoeheAnzahlSchlaege();
		assertThat(scorecard.anzahlSchlaege(), is(2));
	}
	
	@Test
	public void setztSchlagzahlZurueck() throws Exception {
		scorecard.erhoeheAnzahlSchlaege();
		scorecard.schliesseLochAb();
		assertThat(scorecard.anzahlSchlaege(), is(0));
	}
	
	@Test
	public void hatInitialErstesLoch() throws Exception {
		assertThat(scorecard.aktuellesLoch(), is(1));
	}
	
	@Test
	public void zaehltAktuellesLoch() throws Exception {
		scorecard.schliesseLochAb();
		assertThat(scorecard.aktuellesLoch(), is(2));
	}
}
