package de.itagile.golf.operation;

import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Test;

import de.itagile.golf.Operation;
import de.itagile.golf.ScoreCard;

public class ScoreDisplayTest {

	private ScoreCard scoreCard = mock(ScoreCard.class);
	private Operation followUpOperation = mock(Operation.class);
	private Operation scoreDisplay = new ScoreDisplay(followUpOperation);
	
	@Test
	public void displaysOneStroke() throws Exception {
		when(scoreCard.score()).thenReturn(1);
		assertThat(scoreDisplay.run(scoreCard), containsString("1 Schlag"));
	}
	
	@Test
	public void integratesDisplayOfFollowUpOperation() throws Exception {
		when(followUpOperation.run(scoreCard)).thenReturn("folgeausgabe");
		assertThat(scoreDisplay.run(scoreCard), containsString("folgeausgabe"));
	}
}
