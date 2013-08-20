package de.itagile.golf;

import static org.hamcrest.Matchers.containsString;

import org.jbehave.scenario.annotations.Named;
import org.jbehave.scenario.annotations.Then;
import org.jbehave.scenario.annotations.When;

import de.itagile.golf.jbehave.BaseSteps;

public class SchlaegeZaehlenSteps_ extends BaseSteps {

	private TrackerDriver_ tracker;
    private int schlaege;

    public SchlaegeZaehlenSteps_(TrackerDriver_ tracker) {
		this.tracker = tracker;
    }

    @When("ich den Ball <x>-mal schlage")
    public void schlageBall(@Named("x") int schlaege) {
        this.schlaege = schlaege;
        while (schlaege-- > 0) {
            tracker.gibEin("Schlage Ball");
        }
    }

    @Then("zählt der NerdGolfTracker auch so viele Schläge")
    public void pruefeSchlaege() {
        tracker.assertThatAntwort(containsString(String.valueOf(schlaege)));
    }

}
