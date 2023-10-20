package de.itagile.golf;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Test;

class EinfacheScorecardTest {

	private Scorecard scorecard = new EinfacheScorecard();
	
	@Test
	void inkrementiertSchlagzahlEinmal() {
		scorecard.erhoeheAnzahlSchlaege();

		assertThat(scorecard.anzahlSchlaege(), is(1));
	}
	
	@Test
	void inkrementiertSchlagzahlMehrmals() {
		scorecard.erhoeheAnzahlSchlaege();
		scorecard.erhoeheAnzahlSchlaege();
		assertThat(scorecard.anzahlSchlaege(), is(2));
	}
	
	@Test
	void setztSchlagzahlZurueck() {
		scorecard.erhoeheAnzahlSchlaege();
		scorecard.schliesseLochAb();
	}
	
	@Test
	void hatInitialErstesLoch() {
		assertThat(scorecard.aktuellesLoch(), is(1));
	}
	
	@Test
	void zaehltAktuellesLoch() {
		scorecard.schliesseLochAb();
		assertThat(scorecard.aktuellesLoch(), is(2));
	}

}
