package de.itagile.golf.operation;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import de.itagile.golf.Operation;
import de.itagile.golf.Scorecard;


public class LochwechselTest {
	
	private Scorecard scorecard;
	private Lochwechsel lochwechsel;
	private Operation folgeOperation;

	@BeforeEach
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
	public void gibtAusgabeDerFolgeoperationMitAus() throws Exception {
		when(folgeOperation.fuehreAus(any(Scorecard.class))).thenReturn("folgeoperationAusgabe");
		
		assertThat(lochwechsel.fuehreAus(scorecard), is("folgeoperationAusgabe"));	
	}
}
