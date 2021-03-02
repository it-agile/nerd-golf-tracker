package de.itagile.golf;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;


public class SimpleScoreCardTest {

	private ScoreCard scoreCard = new SimpleScoreCard();
	
	@Test
	public void incrementsScoreOnce() throws Exception {
		scoreCard.increaseScore();
		assertThat(scoreCard.score(), is(1));
	}
	
	@Test
	public void incrementsScoreMultipleTimes() throws Exception {
		scoreCard.increaseScore();
		scoreCard.increaseScore();
		assertThat(scoreCard.score(), is(2));
	}
	
	@Test
	public void resetsScore() throws Exception {
		scoreCard.increaseScore();
		scoreCard.completeCurrentHole();
	}
	
	@Test
	public void hasFirstHoleInitially() throws Exception {
		assertThat(scoreCard.currentHole(), is(1));
	}
	
	@Test
	public void countsCurrentHole() throws Exception {
		scoreCard.completeCurrentHole();
		assertThat(scoreCard.currentHole(), is(2));
	}
}
