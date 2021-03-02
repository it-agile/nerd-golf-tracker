package de.itagile.golf;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.When;

public class NerdGolfTrackerStepdefs {
	
	private TrackerDriver tracker;

	public NerdGolfTrackerStepdefs(TrackerDriver tracker) {
		this.tracker = tracker;
	}

	@Before
    public void startNewGame() {
        tracker.start();
    }

	@After
    public void stopTracker() {
        tracker.stop();
    }

	@When("ich den NerdGolfTracker starte")
    public void startNerdGolfTracker() {
        // only there to write more readable scenarios
    }

}
