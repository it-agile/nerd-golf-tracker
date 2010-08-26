package de.itagile.golf;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class TrackerTest {

	private Tracker tracker = new Tracker();

	@Test
	public void zaehltEinenSchlag() throws Exception {
		assertThat(tracker.reagiereAuf("Schlage Ball"), is("Du hast 1 Schlag."));
	}
	
	@Test
	public void zaehltMehrereSchlaege() throws Exception {
		tracker.reagiereAuf("Schlage Ball");
		assertThat(tracker.reagiereAuf("Schlage Ball"), is("Du hast 2 Schläge."));		
	}
	
	@Test
	public void setztDieSchlagzahlZurueckBeimLochwechsel() throws Exception {
		assertThat(tracker.reagiereAuf("Nächstes Loch"), is("Deine Schlagzahl wurde zurück gesetzt."));
	}
}
