package de.itagile.golf.operation;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;

import de.itagile.golf.Operation;
import de.itagile.golf.Scorecard;

class HitTest {

	private Scorecard scorecard = mock(Scorecard.class);
	private Operation postOperation = mock(Operation.class);
	private Hit hit = new Hit(postOperation);

	@Test
	void increasesHitCountOnScorecard() {
		hit.execute(scorecard);
		verify(scorecard).increaseHitCount();
	}

	@Test
	void returnsResultOfPostOperation() {
		when(postOperation.execute(scorecard)).thenReturn("foo");
		assertThat(hit.execute(scorecard), is("foo"));
	}

}
