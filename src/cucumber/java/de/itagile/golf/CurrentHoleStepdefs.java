package de.itagile.golf;

import static org.hamcrest.Matchers.containsString;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CurrentHoleStepdefs {

	private TrackerDriver tracker;

	public CurrentHoleStepdefs(TrackerDriver tracker) {
		this.tracker = tracker;
	}
	
	@When("ich zum nächsten Loch gehe")
    public void goToNextHole() {
        tracker.enter("Nächstes Loch");
    }
	
	@Then("bin ich auf dem {int}. Loch")
	public void checkCurrentHole(int expectedHole) {
		checkHoleDisplay(expectedHole);
		tracker.enter("Schlage Ball");
		checkHoleDisplay(expectedHole);
	}

	private void checkHoleDisplay(int hole) {
		tracker.assertThatAnswer(containsString(String.format("%d.Loch", hole)));
	}
	
}
