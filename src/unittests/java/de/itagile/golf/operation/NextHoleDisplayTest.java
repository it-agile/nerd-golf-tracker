package de.itagile.golf.operation;

import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Test;

import de.itagile.golf.Operation;
import de.itagile.golf.ScoreCard;

public class NextHoleDisplayTest {
	
	private ScoreCard scoreCard = mock(ScoreCard.class);
	private Operation followUpOperation = mock(Operation.class);
	private NextHoleDisplay nextHoleDisplay = new NextHoleDisplay(followUpOperation);

	@Test
	public void displaysScoreReset() throws Exception {
		assertThat(nextHoleDisplay.run(scoreCard), containsString("Your score has been reset"));
	}
	
	@Test
	public void displaysDisplayOfFollowUpOperation() throws Exception {
		when(followUpOperation.run(any(ScoreCard.class))).thenReturn("follow-up operation display");
		
		assertThat(nextHoleDisplay.run(scoreCard), containsString("follow-up operation display"));
	}
}
