package de.itagile.golf;

import org.jbehave.scenario.annotations.AfterScenario;
import org.jbehave.scenario.annotations.BeforeScenario;
import org.jbehave.scenario.annotations.When;

import de.itagile.golf.jbehave.BaseSteps;

public class NerdGolfTrackerSteps extends BaseSteps {
    private TrackerDriver tracker;

	public NerdGolfTrackerSteps(TrackerDriver tracker) {
		this.tracker = tracker;
    }

    @BeforeScenario
    public void starteNeuesSpiel() {
        tracker.starte();
    }

    @AfterScenario
    public void beendeTracker() {
        tracker.beende();
    }

    @When("ich den NerdGolfTracker starte")
    public void starteNerdGolfTracker() {
        // nur da, um lesbarere Szenarien zu schreiben
    }
}
