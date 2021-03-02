package de.itagile.golf;

import static org.hamcrest.Matchers.containsString;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HelpStepdefs {
	
	private TrackerDriver tracker;

	public HelpStepdefs(TrackerDriver tracker) {
		this.tracker = tracker;
	}
	
	@When("ich die Hilfe aufrufe")
	public void callHelp() {
		tracker.enter("Hilfe");
	}
	
	@Then("listet der NerdGolfTracker einen Eintrag zu {string} auf")
	public void checkHelpEntry(String command) {
		tracker.assertThatAnswer(containsString(command));
	}
}
