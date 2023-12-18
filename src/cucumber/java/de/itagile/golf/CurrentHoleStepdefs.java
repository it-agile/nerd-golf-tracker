package de.itagile.golf;

import static org.hamcrest.Matchers.containsString;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CurrentHoleStepdefs {

	private TrackerDriver tracker;

	public CurrentHoleStepdefs(TrackerDriver tracker) {
		this.tracker = tracker;
	}
	
	@When("I go to the next hole")
    public void gotToTheNextHole() {
        tracker.input("Next hole");
    }
	
	@Then("I am on the {int}. hole")
	public void checkCurrentHole(int expectedHole) {
		checkHoleOuptput(expectedHole);
		tracker.input("Hit ball");
		checkHoleOuptput(expectedHole);
	}

	private void checkHoleOuptput(int expectedHole) {
		tracker.assertThatAnswer(containsString(String.format("%d.hole", expectedHole)));
	}
	
}
