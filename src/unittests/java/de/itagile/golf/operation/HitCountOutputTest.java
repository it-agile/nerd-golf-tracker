package de.itagile.golf.operation;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;

import de.itagile.golf.Operation;
import de.itagile.golf.Scorecard;

class HitCountOutputTest {

	private Scorecard scorecard = mock(Scorecard.class);
	private Operation postOperation = mock(Operation.class);
	private Operation hitCountOutput = new HitCountOutput(postOperation);
	
	@Test
	void oneHitOutput() {
		when(scorecard.hitCount()).thenReturn(1);
		assertThat(hitCountOutput.execute(scorecard), containsString("1 hit"));
	}
	
	@Test
	void integratesOutputOfPostOperation() {
		when(postOperation.execute(scorecard)).thenReturn("postOperation");
		assertThat(hitCountOutput.execute(scorecard), containsString("postOperation"));
	}

}
