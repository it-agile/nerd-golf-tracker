package de.itagile.golf;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.de.Wenn;

public class NerdGolfTrackerStepdefs {
	
	private TrackerDriver tracker;

	public NerdGolfTrackerStepdefs(TrackerDriver tracker) {
		this.tracker = tracker;
	}

	@Before
    public void starteNeuesSpiel() {
        tracker.starte();
    }

	@After
    public void beendeTracker() {
        tracker.beende();
    }

	@Wenn("ich den NerdGolfTracker starte")
    public void starteNerdGolfTracker() {
        // nur da, um lesbarere Szenarien zu schreiben
    }

}
