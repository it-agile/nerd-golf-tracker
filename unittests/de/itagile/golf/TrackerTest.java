package de.itagile.golf;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Matchers.any;
import static org.mockito.Matchers.eq;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Test;

public class TrackerTest {

	private Tracker tracker = new Tracker();

	@Test
	public void setztDieSchlagzahlZurueckBeimLochwechsel() throws Exception {
		assertThat(tracker.reagiereAuf("Nächstes Loch"), is("Deine Schlagzahl wurde zurück gesetzt."));
	}
	
	@Test
	public void zaehltNachLochwechselVonVorne() throws Exception {
		tracker.reagiereAuf("Schlage Ball");
		tracker.reagiereAuf("Nächstes Loch");
		assertThat(tracker.reagiereAuf("Schlage Ball"), is("Du hast 1 Schlag."));
	}
	
	@Test
	public void learn() throws Exception {
		EingabeInterpreter anweisung = mock(EingabeInterpreter.class);		
		Tracker tracker = new Tracker(anweisung);
		when(anweisung.fuehreOperationAusFuerEingabe(eq("foo"), any(Scorecard.class))).thenReturn("bar");
		assertThat(tracker.reagiereAuf2("foo"), is("bar"));
	}
}
