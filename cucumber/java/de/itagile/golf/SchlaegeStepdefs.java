package de.itagile.golf;

import static org.hamcrest.Matchers.containsString;
import cucumber.api.java.de.Dann;
import cucumber.api.java.de.Wenn;

public class SchlaegeStepdefs {

	private TrackerDriver tracker;
	private int schlaege;

	public SchlaegeStepdefs(TrackerDriver tracker) {
		this.tracker = tracker;
	}
	
	@Wenn("ich den Ball (\\d+)-mal schlage")
    public void schlageBall(int schlaege) {
        this.schlaege = schlaege;
        while (schlaege-- > 0) {
            tracker.gibEin("Schlage Ball");
        }
    }
	
	@Dann("zählt der NerdGolfTracker auch so viele Schläge")
    public void pruefeSchlaege() {
        tracker.assertThatAntwort(containsString(String.valueOf(schlaege)));
    }
}
