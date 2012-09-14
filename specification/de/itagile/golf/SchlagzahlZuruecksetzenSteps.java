package de.itagile.golf;

import de.itagile.golf.jbehave.BaseSteps;
import org.jbehave.scenario.annotations.Then;
import org.jbehave.scenario.annotations.When;

import static org.hamcrest.Matchers.containsString;

public class SchlagzahlZuruecksetzenSteps extends BaseSteps {

	public SchlagzahlZuruecksetzenSteps(TrackerDriver driver) {
		super(driver);
	}

    @When("ich zum nächsten Loch gehe")
    public void spieleAufEinemLochUndGeheWeiter() {
        empfangeAnweisung("Schlage Ball");
        empfangeAnweisung("Nächstes Loch");
    }

	@Then("fängt der NerdGolfTracker wieder an, bei 0 zu zählen")
	public void pruefeSchlaegeZaehlen() {
        empfangeAnweisung("Schlage Ball");
		assertThatAntwort(containsString(String.valueOf(1)));
	}
}
