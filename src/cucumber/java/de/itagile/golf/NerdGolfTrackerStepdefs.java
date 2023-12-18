package de.itagile.golf;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.When;

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
    public void endTracker() {
        tracker.finish();
    }

	@When("I start the NerdGolfTracker")
    public void startNerdGolfTracker() {
        // empty method, just to make scenarios easier to read
    }

}
