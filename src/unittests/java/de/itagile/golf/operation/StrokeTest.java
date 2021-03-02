package de.itagile.golf.operation;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Test;

import de.itagile.golf.Operation;
import de.itagile.golf.ScoreCard;


public class StrokeTest {

	private ScoreCard scoreCard = mock(ScoreCard.class);
	private Operation followUpOperation = mock(Operation.class);
	private Stroke stroke = new Stroke(followUpOperation);

	@Test
	public void increasesScoreInScoreCard() throws Exception {
		stroke.run(scoreCard);
		verify(scoreCard).increaseScore();
	}

	@Test
	public void returnsResultOfFollowUpOperation() throws Exception {
		when(followUpOperation.run(scoreCard)).thenReturn("foo");
		assertThat(stroke.run(scoreCard), is("foo"));
	}
}
