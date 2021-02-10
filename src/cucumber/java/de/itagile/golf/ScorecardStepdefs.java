package de.itagile.golf;

import static org.hamcrest.Matchers.containsString;

import cucumber.api.java.de.Dann;
import cucumber.api.java.de.Wenn;

public class ScorecardStepdefs {

	private TrackerDriver tracker;
	private int schlaege;

	public ScorecardStepdefs(TrackerDriver tracker) {
		this.tracker = tracker;
	}
	
	@Wenn("ich den NerdGolfTracker starte und Scorecard abfrage")
    public void direktNachStart() {
        tracker.gibEin("Scorecard");
    }
	
	@Dann("ist die Scorecard {int}")
    public void pruefeGesamtzahl(int gesamtzahl) {
        tracker.gibEin("Scorecard");
        tracker.assertThatAntwort(containsString(String.format("%d", gesamtzahl)));
    }
	

}
