package de.itagile.golf;

import de.itagile.golf.jbehave.BaseSteps;
import org.jbehave.scenario.annotations.Named;
import org.jbehave.scenario.annotations.Then;
import org.jbehave.scenario.annotations.When;

import static org.hamcrest.Matchers.containsString;

public class SchlaegeZaehlenSteps extends BaseSteps {

    private int schlaege;

    public SchlaegeZaehlenSteps(TrackerDriver driver) {
        super(driver);
    }

    @When("ich den Ball <x>-mal schlage")
    public void schlageBall(@Named("x") int schlaege) {
        this.schlaege = schlaege;
        while (schlaege-- > 0) {
            empfangeAnweisung("Schlage Ball");
        }
    }

    @Then("zählt der NerdGolfTracker auch so viele Schläge")
    public void pruefeSchlaege() {
        assertThatAntwort(containsString(String.valueOf(schlaege)));
    }

    @Then("zählt der NerdGolfTracker $anzahl $einheit")
	public void zaehltSchlaege(int anzahl, String einheit) throws Exception {
		assertThatAntwort(containsString(String.format("%d ", anzahl)));
	}

}
