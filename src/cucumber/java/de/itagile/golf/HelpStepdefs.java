package de.itagile.golf;

import static org.hamcrest.Matchers.containsString;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HelpStepdefs {
	
	private TrackerDriver tracker;

	public HelpStepdefs(TrackerDriver tracker) {
		this.tracker = tracker;
	}
	
	@When("I call for help")
	public void callHelp() {
		tracker.input("Help");
	}
	
	@Then("the NerdGolfTracker lists an entry for {string}")
	public void checkHelpOutput(String kommando) {
		tracker.assertThatAnswer(containsString(kommando));
	}
}
