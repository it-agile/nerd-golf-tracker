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
	
	@When("I hit the ball {int} times")
    public void hitBall(int hits) {
        this.hits = hits;
        while (hits-- > 0) {
            tracker.input("Hit ball");
        }
    }
	
	@When("I played one hole")
    public void hitAtOneHoleAndGoToTheNext() {
        tracker.input("Hit ball");
        tracker.input("Next hole");
    }
	
	@Then("the NerdGolfTracker counts this many hits")
    public void checkHits() {
        tracker.assertThatAnswer(containsString(valueOf(hits)));
    }
	
	@Then("counting of hits start at 0 for the new hole")
	public void checkHitsAfterHoleChange() {
        tracker.input("Hit ball");
		tracker.assertThatAnswer(containsString(valueOf(1)));
	}

}
