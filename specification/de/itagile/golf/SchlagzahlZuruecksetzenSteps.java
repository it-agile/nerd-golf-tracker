package de.itagile.golf;

import static org.hamcrest.Matchers.containsString;

import org.jbehave.scenario.annotations.Then;
import org.jbehave.scenario.annotations.When;

import de.itagile.golf.jbehave.BaseSteps;

public class SchlagzahlZuruecksetzenSteps extends BaseSteps {

	public SchlagzahlZuruecksetzenSteps(TrackerDriver driver) {
		super(driver);
	}

    @When("ich auf einem Loch gespielt habe")
    public void spieleAufEinemLochUndGeheWeiter() {
        empfangeAnweisung("Schlage Ball");
        empfangeAnweisung("Nächstes Loch");
    }

	@Then("zählen die Schläge auf dem nächsten Loch wieder von 0 an")
	public void pruefeSchlaegeZaehlen() {
        empfangeAnweisung("Schlage Ball");
		assertThatAntwort(containsString(String.valueOf(1)));
	}
}
