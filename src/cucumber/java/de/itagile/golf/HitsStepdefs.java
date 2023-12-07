package de.itagile.golf;

import static java.lang.String.valueOf;
import static org.hamcrest.Matchers.containsString;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HitsStepdefs {

	private TrackerDriver tracker;
	private int hits;

	public HitsStepdefs(TrackerDriver tracker) {
		this.tracker = tracker;
	}
	
	@When("ich den Ball {int}-mal schlage")
    public void hitBall(int hits) {
        this.hits = hits;
        while (hits-- > 0) {
            tracker.input("Hit ball");
        }
    }
	
	@When("ich auf einem Loch gespielt habe")
    public void hitAtOneHoleAndGoToTheNext() {
        tracker.input("Hit ball");
        tracker.input("Next hole");
    }
	
	@Then("zählt der NerdGolfTracker auch so viele Schläge")
    public void checkHits() {
        tracker.assertThatAnswer(containsString(valueOf(hits)));
    }
	
	@Then("zählen die Schläge auf dem nächsten Loch wieder von 0 an")
	public void checkHitsAfterHoleChange() {
        tracker.input("Hit ball");
		tracker.assertThatAnswer(containsString(valueOf(1)));
	}

}
