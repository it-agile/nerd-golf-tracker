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
	
	@When("I strike the ball {int} times")
    public void strikeBall(int strokes) {
        this.schlaege = strokes;
        while (strokes-- > 0) {
            tracker.enter("Schlage Ball");
        }
    }
	
	@When("I played on a hole")
    public void playedOnaHoleAndGoToNext() {
        tracker.enter("Schlage Ball");
        tracker.enter("next hole");
    }
	
	@Then("the NerdGolfTracker also counts so many strokes")
    public void checkStrokes() {
        tracker.assertThatAnswer(containsString(valueOf(schlaege)));
    }
	
	@Then("the score for the next hole is reset to 0")
	public void checkStrokeCounting() {
        tracker.enter("Schlage Ball");
		tracker.assertThatAnswer(containsString(valueOf(1)));
	}

}
