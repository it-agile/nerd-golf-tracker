package de.itagile.golf;

import static org.hamcrest.Matchers.containsString;
import cucumber.api.java.de.Dann;
import cucumber.api.java.de.Wenn;

public class HilfeStepdefs {
	
	private TrackerDriver tracker;

	public HilfeStepdefs(TrackerDriver tracker) {
		this.tracker = tracker;
	}
	
	@Wenn("ich die Hilfe aufrufe")
	public void rufeHilfeAuf() {
		tracker.gibEin("Hilfe");
	}
	
	@Dann("listet der NerdGolfTracker einen Eintrag zu (.*) auf")
	public void pruefeHilfeEintrag(String kommando) {
		tracker.assertThatAntwort(containsString(kommando));
	}
}
