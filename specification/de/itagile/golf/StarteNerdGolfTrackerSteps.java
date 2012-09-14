package de.itagile.golf;

import de.itagile.golf.jbehave.BaseSteps;
import org.jbehave.scenario.annotations.BeforeScenario;

public class StarteNerdGolfTrackerSteps extends BaseSteps {
    public StarteNerdGolfTrackerSteps(TrackerDriver driver) {
        super(driver);
    }

    @BeforeScenario
    public void starteNeuesSpiel() {
        getDriver().starte();
    }
}
