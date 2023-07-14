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

class LochwechselTest {
	
	private Scorecard scorecard = mock(Scorecard.class);
	private Operation folgeOperation = mock(Operation.class);
	private Lochwechsel lochwechsel = new Lochwechsel(folgeOperation);

	@Test
	void setztAnzahlSchlaegeZurueck() throws Exception {
		lochwechsel.fuehreAus(scorecard);
		verify(scorecard).schliesseLochAb();
	}
	
	@Test
	void gibtAusgabeDerFolgeoperationMitAus() throws Exception {
		when(folgeOperation.fuehreAus(any(Scorecard.class))).thenReturn("folgeoperationAusgabe");
		
		assertThat(lochwechsel.fuehreAus(scorecard), is("folgeoperationAusgabe"));	
	}

}
