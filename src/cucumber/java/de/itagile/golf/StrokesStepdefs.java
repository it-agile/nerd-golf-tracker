package de.itagile.golf;

import static java.lang.String.valueOf;
import static org.hamcrest.Matchers.containsString;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StrokesStepdefs {

	private TrackerDriver tracker;
	private int schlaege;

	public StrokesStepdefs(TrackerDriver tracker) {
		this.tracker = tracker;
	}
	
	@When("ich den Ball {int}-mal schlage")
    public void strikeBall(int strokes) {
        this.schlaege = strokes;
        while (strokes-- > 0) {
            tracker.enter("Schlage Ball");
        }
    }
	
	@When("ich auf einem Loch gespielt habe")
    public void playOnOneHoleAndGoToNext() {
        tracker.enter("Schlage Ball");
        tracker.enter("Nächstes Loch");
    }
	
	@Then("zählt der NerdGolfTracker auch so viele Schläge")
    public void checkStrokes() {
        tracker.assertThatAnswer(containsString(valueOf(schlaege)));
    }
	
	@Then("zählen die Schläge auf dem nächsten Loch wieder von 0 an")
	public void checkStrokeCounting() {
        tracker.enter("Schlage Ball");
		tracker.assertThatAnswer(containsString(valueOf(1)));
	}

}
