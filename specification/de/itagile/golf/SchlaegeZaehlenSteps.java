package de.itagile.golf;

import static org.hamcrest.Matchers.containsString;

import org.jbehave.scenario.annotations.Then;

import de.itagile.golf.jbehave.BaseSteps;

public class SchlaegeZaehlenSteps extends BaseSteps {

	public SchlaegeZaehlenSteps(TrackerDriver driver) {
		super(driver);
	}
	
    @Then("zählt der NerdGolfTracker $anzahl $einheit")
	public void zaehltSchlaege(int anzahl, String einheit) throws Exception {
		assertThatAntwort(containsString(String.format("%d ", anzahl)));
	}

}
