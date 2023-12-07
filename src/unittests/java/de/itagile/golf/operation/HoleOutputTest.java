package de.itagile.golf.operation;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;

import de.itagile.golf.Scorecard;

class HoleOutputTest {

	@Test
	void outputCurrentHole() {
		Scorecard scorecard = mock(Scorecard.class);
		when(scorecard.currentHole()).thenReturn(42);
		assertThat(new HoleOutput().execute(scorecard ), containsString("42.hole"));
	}

}
