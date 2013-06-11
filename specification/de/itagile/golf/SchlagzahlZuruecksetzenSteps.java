package de.itagile.golf;

import static org.hamcrest.Matchers.containsString;

import org.jbehave.scenario.annotations.Then;
import org.jbehave.scenario.annotations.When;

import de.itagile.golf.jbehave.BaseSteps;

public class SchlagzahlZuruecksetzenSteps extends BaseSteps {

	public SchlagzahlZuruecksetzenSteps(TrackerDriver tracker) {
		super(tracker);
	}

    @When("ich auf einem Loch gespielt habe")
    public void spieleAufEinemLochUndGeheWeiter() {
        gibEin("Schlage Ball");
        gibEin("Nächstes Loch");
    }

	@Then("zählen die Schläge auf dem nächsten Loch wieder von 0 an")
	public void pruefeSchlaegeZaehlen() {
        gibEin("Schlage Ball");
		assertThatAntwort(containsString(String.valueOf(1)));
	}
}
