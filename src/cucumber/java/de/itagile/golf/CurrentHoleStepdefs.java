package de.itagile.golf;

import static org.hamcrest.Matchers.containsString;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CurrentHoleStepdefs {

	private TrackerDriver tracker;

	public CurrentHoleStepdefs(TrackerDriver tracker) {
		this.tracker = tracker;
	}
	
	@When("ich zum nächsten Loch gehe")
    public void gotToTheNextHole() {
        tracker.input("Next hole");
    }
	
	@Then("bin ich auf dem {int}. Loch")
	public void checkCurrentHole(int expectedHole) {
		checkHoleOuptput(expectedHole);
		tracker.input("Hit ball");
		checkHoleOuptput(expectedHole);
	}

	private void checkHoleOuptput(int expectedHole) {
		tracker.assertThatAnswer(containsString(String.format("%d.hole", expectedHole)));
	}
	
}
