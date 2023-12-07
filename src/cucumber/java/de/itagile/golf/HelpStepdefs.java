package de.itagile.golf;

import static org.hamcrest.Matchers.containsString;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HelpStepdefs {
	
	private TrackerDriver tracker;

	public HelpStepdefs(TrackerDriver tracker) {
		this.tracker = tracker;
	}
	
	@When("ich die Hilfe aufrufe")
	public void callHelp() {
		tracker.input("Help");
	}
	
	@Then("listet der NerdGolfTracker einen Eintrag zu {string} auf")
	public void checkHelpOutput(String kommando) {
		tracker.assertThatAnswer(containsString(kommando));
	}
}
