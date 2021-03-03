package de.itagile.golf.operation;

import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Test;

import de.itagile.golf.ScoreCard;

public class HoleDisplayTest {

	@Test
	public void displaysCurrentHole() throws Exception {
		ScoreCard scoreCard = mock(ScoreCard.class);
		when(scoreCard.currentHole()).thenReturn(42);
		assertThat(new HoleDisplay().run(scoreCard ), containsString("42. hole"));
	}
}
