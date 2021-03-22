package de.itagile.golf.operation;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;

import de.itagile.golf.Operation;
import de.itagile.golf.ScoreCardCamelCaseProblem;


public class NextHoleTest {
	
	private ScoreCardCamelCaseProblem scoreCard;
	private NextHole nextHole;
	private Operation followUpOperation;

	@Before
	public void setup() {
		scoreCard = mock(ScoreCardCamelCaseProblem.class);
		followUpOperation = mock(Operation.class);
		nextHole = new NextHole(followUpOperation);
	}
	
	@Test
	public void completesCurrentHole() throws Exception {
		nextHole.run(scoreCard);
		verify(scoreCard).completeCurrentHole();
	}
	
	@Test
	public void displaysAlsoTheDisplayOfFollowUpOperation() throws Exception {
		when(followUpOperation.run(any(ScoreCardCamelCaseProblem.class))).thenReturn("follow-up operation display");
		
		assertThat(nextHole.run(scoreCard), is("follow-up operation display"));
	}
}
