package de.itagile.golf.operation;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import org.junit.Test;

import de.itagile.golf.Scorecard;


public class LochwechselTest {
	
	@Test
	public void setztAnzahlSchlaegeZurueck() throws Exception {
		Scorecard scorecard = mock(Scorecard.class);
		new Lochwechsel().fuehreAus(scorecard);
		verify(scorecard).setzeZurueckAnzahlSchlaege();
	}
}
