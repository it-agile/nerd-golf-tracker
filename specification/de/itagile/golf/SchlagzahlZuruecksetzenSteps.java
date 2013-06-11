package de.itagile.golf;

import static org.hamcrest.Matchers.containsString;

import org.jbehave.scenario.annotations.Then;
import org.jbehave.scenario.annotations.When;

import de.itagile.golf.jbehave.BaseSteps;

public class SchlagzahlZuruecksetzenSteps extends BaseSteps {

	private TrackerDriver tracker;

	public SchlagzahlZuruecksetzenSteps(TrackerDriver tracker) {
		this.tracker = tracker;
	}

    @When("ich auf einem Loch gespielt habe")
    public void spieleAufEinemLochUndGeheWeiter() {
        tracker.gibEin("Schlage Ball");
        tracker.gibEin("Nächstes Loch");
    }

	@Then("zählen die Schläge auf dem nächsten Loch wieder von 0 an")
	public void pruefeSchlaegeZaehlen() {
        tracker.gibEin("Schlage Ball");
		tracker.assertThatAntwort(containsString(String.valueOf(1)));
	}
}
