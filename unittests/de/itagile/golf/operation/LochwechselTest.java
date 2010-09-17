package de.itagile.golf.operation;

import static org.hamcrest.Matchers.containsString;
import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;

import de.itagile.golf.Scorecard;


public class LochwechselTest {
	
	private Scorecard scorecard;
	private Lochwechsel lochwechsel;

	@Before
	public void setup() {
		scorecard = mock(Scorecard.class);
		lochwechsel = new Lochwechsel();		
	}
	
	@Test
	public void setztAnzahlSchlaegeZurueck() throws Exception {
		lochwechsel.fuehreAus(scorecard);
		verify(scorecard).setzeZurueckAnzahlSchlaege();
	}
	
	@Test
	public void gibtZuruecksetzenAus() throws Exception {
		assertThat(lochwechsel.fuehreAus(scorecard), containsString("Deine Schlagzahl wurde zurück gesetzt"));
	}
	
	@Test
	public void gibtNeuesLochAus() throws Exception {
		when(scorecard.aktuellesLoch()).thenReturn(2);
		assertThat(lochwechsel.fuehreAus(scorecard), containsString("Du bist auf dem 2. Loch"));		
	}
}
