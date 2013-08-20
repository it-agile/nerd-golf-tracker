package de.itagile.golf;

import static org.hamcrest.Matchers.containsString;

import org.jbehave.scenario.annotations.Then;
import org.jbehave.scenario.annotations.When;

import de.itagile.golf.jbehave.BaseSteps;

public class AktuellesLochSteps_ extends BaseSteps {

	private TrackerDriver_ tracker;

	public AktuellesLochSteps_(TrackerDriver_ tracker) {
		this.tracker = tracker;
	}

    @When("ich zum nächsten Loch gehe")
    public void geheZumNaechstenLoch() {
        tracker.gibEin("Nächstes Loch");
    }

    @Then("bin ich auf dem $lochNo. Loch")
	public void pruefeAktuellesLoch(int loch) {
		pruefeLochAnzeige(loch);
		tracker.gibEin("Schlage Ball");
		pruefeLochAnzeige(loch);
	}

	private void pruefeLochAnzeige(int loch) {
		tracker.assertThatAntwort(containsString(String.format("%d.Loch", loch)));
	}
}
