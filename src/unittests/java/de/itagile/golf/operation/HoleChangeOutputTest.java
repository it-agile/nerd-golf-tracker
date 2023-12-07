package de.itagile.golf.operation;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;

import de.itagile.golf.Operation;
import de.itagile.golf.Scorecard;

class HoleChangeOutputTest {
	
	private Scorecard scorecard = mock(Scorecard.class);
	private Operation postOperation = mock(Operation.class);
	private HoleChangeOutput holeChangeOutput = new HoleChangeOutput(postOperation);	

	@Test
	void outputsHitReset() {
		assertThat(holeChangeOutput.execute(scorecard), containsString("Your hit count got reset"));
	}
	
	@Test
	void returnsResultOfPostOperation() {
		when(postOperation.execute(any(Scorecard.class))).thenReturn("postOperationOutput");
		
		assertThat(holeChangeOutput.execute(scorecard), containsString("postOperationOutput"));	
	}

}
