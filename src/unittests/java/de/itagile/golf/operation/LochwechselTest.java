package de.itagile.golf.operation;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import de.itagile.golf.EinfacheScorecard;
import org.hamcrest.MatcherAssert;
import org.junit.Before;
import org.junit.Test;

import de.itagile.golf.Operation;
import de.itagile.golf.Scorecard;


public class LochwechselTest {
	
	private Scorecard scorecard;
	private Lochwechsel lochwechsel;
	private Operation folgeOperation;

	@Before
	public void setup() {
		scorecard = mock(Scorecard.class);
		folgeOperation = mock(Operation.class);
		lochwechsel = new Lochwechsel(folgeOperation);		
	}
	
	@Test
	public void setztAnzahlSchlaegeZurueck() throws Exception {
		lochwechsel.fuehreAus(scorecard);
		verify(scorecard).schliesseLochAb();
	}

	@Test
	public void ermittleGesamtanzahlSchlaege() throws Exception {
		Scorecard scorecard = new EinfacheScorecard();
		Schlag schlag = new Schlag(folgeOperation);
		schlag.fuehreAus(scorecard);
		lochwechsel.fuehreAus(scorecard);
		assertThat(scorecard.anzahlGesamtschlaege(), is(1));
	}

	@Test
	public void ermittleGesamtanzahlSchlaegeNach3Loechern() throws Exception {
		Scorecard scorecard = new EinfacheScorecard();

		Schlag schlag = new Schlag(folgeOperation);
		schlag.fuehreAus(scorecard);
		lochwechsel.fuehreAus(scorecard);

		Schlag schlag2 = new Schlag(folgeOperation);
		schlag2.fuehreAus(scorecard);
		schlag2.fuehreAus(scorecard);
		lochwechsel.fuehreAus(scorecard);

		Schlag schlag3 = new Schlag(folgeOperation);
		schlag3.fuehreAus(scorecard);
		lochwechsel.fuehreAus(scorecard);

		assertThat(scorecard.anzahlGesamtschlaege(), is(4));
	}
	
	@Test
	public void gibtAusgabeDerFolgeoperationMitAus() throws Exception {
		when(folgeOperation.fuehreAus(any(Scorecard.class))).thenReturn("folgeoperationAusgabe");
		
		assertThat(lochwechsel.fuehreAus(scorecard), is("folgeoperationAusgabe"));	
	}
}
