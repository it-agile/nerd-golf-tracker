package de.itagile.golf.operation;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;

import de.itagile.golf.Operation;
import de.itagile.golf.Scorecard;

class SchlagTest {

	private Scorecard scorecard = mock(Scorecard.class);
	private Operation folgeoperation = mock(Operation.class);
	private Schlag schlag = new Schlag(folgeoperation);

	@Test
	void erhoehtAnzahlSchlaegeAufScorecard() throws Exception {
		schlag.fuehreAus(scorecard);
		verify(scorecard).erhoeheAnzahlSchlaege();
	}

	@Test
	void gibtErgebnisDerFolgeoperationZurueck() throws Exception {
		when(folgeoperation.fuehreAus(scorecard)).thenReturn("foo");
		assertThat(schlag.fuehreAus(scorecard), is("foo"));
	}

}
