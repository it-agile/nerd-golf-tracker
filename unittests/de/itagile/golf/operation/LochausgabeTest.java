package de.itagile.golf.operation;

import static org.hamcrest.Matchers.containsString;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Test;

import de.itagile.golf.Scorecard;

public class LochausgabeTest {

	@Test
	public void gibtAktuellesLochAus() throws Exception {
		Scorecard scorecard = mock(Scorecard.class);
		when(scorecard.aktuellesLoch()).thenReturn(42);
		assertThat(new Lochausgabe().fuehreAus(scorecard ), containsString("42. Loch"));
	}
}
