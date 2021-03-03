package de.itagile.golf;

import static org.hamcrest.Matchers.containsString;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CurrentHoleStepdefs {

	private TrackerDriver tracker;

	public CurrentHoleStepdefs(TrackerDriver tracker) {
		this.tracker = tracker;
	}
	
	@When("I go to the next hole")
    public void goToNextHole() {
        tracker.enter("next hole");
    }
	
	@Then("I am on the {int}. hole")
	public void checkCurrentHole(int expectedHole) {
		checkHoleDisplay(expectedHole);
		tracker.enter("strike ball");
		checkHoleDisplay(expectedHole);
	}

	private void checkHoleDisplay(int hole) {
		tracker.assertThatAnswer(containsString(String.format("%d.Loch", hole)));
	}
	
}
