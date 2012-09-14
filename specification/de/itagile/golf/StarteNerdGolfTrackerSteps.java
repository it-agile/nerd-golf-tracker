package de.itagile.golf;

import de.itagile.golf.jbehave.BaseSteps;
import org.jbehave.scenario.annotations.BeforeScenario;
import org.jbehave.scenario.annotations.When;

public class StarteNerdGolfTrackerSteps extends BaseSteps {
    public StarteNerdGolfTrackerSteps(TrackerDriver driver) {
        super(driver);
    }

    @BeforeScenario
    public void starteNeuesSpiel() {
        getDriver().starte();
    }

    @When("ich den NerdGolfTracker starte")
    public void starteNerdGolfTracker() {
        // nur da, um lesbarere Szenarien zu schreiben
    }
}
