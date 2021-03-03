package de.itagile.golf;

import static org.hamcrest.Matchers.containsString;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HelpStepdefs {
	
	private TrackerDriver tracker;

	public HelpStepdefs(TrackerDriver tracker) {
		this.tracker = tracker;
	}
	
	@When("I open the help")
	public void callHelp() {
		tracker.enter("help");
	}
	
	@Then("NerdGolfTracker displays an entry about {string}")
	public void checkHelpEntry(String command) {
		tracker.assertThatAnswer(containsString(command));
	}
}
