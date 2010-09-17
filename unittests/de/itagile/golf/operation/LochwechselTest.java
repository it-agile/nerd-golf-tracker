package de.itagile.golf.operation;

import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Matchers;

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
	public void gibtAusgabeDerFolgeoperationMitAus() throws Exception {
		when(folgeOperation.fuehreAus(any(Scorecard.class))).thenReturn("folgeoperationAusgabe");
		
		assertThat(lochwechsel.fuehreAus(scorecard), is("folgeoperationAusgabe"));	
	}
}
