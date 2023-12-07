package de.itagile.golf.operation;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;

import de.itagile.golf.Operation;
import de.itagile.golf.Scorecard;

class HoleChangeTest {
	
	private Scorecard scorecard = mock(Scorecard.class);
	private Operation postOperation = mock(Operation.class);
	private HoleChange holeChangeTest = new HoleChange(postOperation);

	@Test
	void resetHitCount() {
		holeChangeTest.execute(scorecard);
		verify(scorecard).finishHole();
	}
	
	@Test
	void returnsResultOfPostOperation() {
		when(postOperation.execute(any(Scorecard.class))).thenReturn("postOperationOutput");
		
		assertThat(holeChangeTest.execute(scorecard), is("postOperationOutput"));	
	}

}
