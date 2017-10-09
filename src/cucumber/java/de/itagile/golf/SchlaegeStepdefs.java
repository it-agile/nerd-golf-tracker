package de.itagile.golf;

import static java.lang.String.valueOf;
import static org.hamcrest.Matchers.containsString;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SchlaegeStepdefs {

	private TrackerDriver tracker;
	private int schlaege;

	public SchlaegeStepdefs(TrackerDriver tracker) {
		this.tracker = tracker;
	}
	
	@When("ich den Ball (\\d+)-mal schlage")
    public void schlageBall(int schlaege) {
        this.schlaege = schlaege;
        while (schlaege-- > 0) {
            tracker.gibEin("Schlage Ball");
        }
    }
	
	@When("ich auf einem Loch gespielt habe")
    public void spieleAufEinemLochUndGeheWeiter() {
        tracker.gibEin("Schlage Ball");
        tracker.gibEin("Nächstes Loch");
    }
	
	@Then("zählt der NerdGolfTracker auch so viele Schläge")
    public void pruefeSchlaege() {
        tracker.assertThatAntwort(containsString(valueOf(schlaege)));
    }
	
	@Then("zählen die Schläge auf dem nächsten Loch wieder von 0 an")
	public void pruefeSchlaegeZaehlen() {
        tracker.gibEin("Schlage Ball");
		tracker.assertThatAntwort(containsString(valueOf(1)));
	}

}
