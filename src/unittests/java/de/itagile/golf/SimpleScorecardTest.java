package de.itagile.golf;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Test;

class SimpleScorecardTest {

	private Scorecard scorecard = new SimpleScorecard();
	
	@Test
	void incrementHitOnce() {
		scorecard.increaseHitCount();

		assertThat(scorecard.hitCount(), is(1));
	}
	
	@Test
	void incrementHitsMultipleTimes() {
		scorecard.increaseHitCount();
		scorecard.increaseHitCount();
		assertThat(scorecard.hitCount(), is(2));
	}
	
	@Test
	void resetHitCount() {
		scorecard.increaseHitCount();
		scorecard.finishHole();
	}
	
	@Test
	void initiallyOnFirstHole() {
		assertThat(scorecard.currentHole(), is(1));
	}
	
	@Test
	void countsHoles() {
		scorecard.finishHole();
		assertThat(scorecard.currentHole(), is(2));
	}

}
