package de.itagile.golf;

import de.itagile.golf.jbehave.BaseSteps;
import org.jbehave.scenario.annotations.AfterScenario;
import org.jbehave.scenario.annotations.BeforeScenario;
import org.jbehave.scenario.annotations.When;

public class NerdGolfTrackerSteps extends BaseSteps {
    public NerdGolfTrackerSteps(TrackerDriver driver) {
        super(driver);
    }

    @BeforeScenario
    public void starteNeuesSpiel() {
        getDriver().starte();
    }

    @AfterScenario
    public void beendeTracker() {
        getDriver().beende();
    }

    @When("ich den NerdGolfTracker starte")
    public void starteNerdGolfTracker() {
        // nur da, um lesbarere Szenarien zu schreiben
    }
}
