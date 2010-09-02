package de.itagile.golf;

import static org.hamcrest.Matchers.is;

import org.jbehave.scenario.annotations.Then;
import org.jbehave.scenario.annotations.When;

import de.itagile.golf.jbehave.BaseSteps;

public class SchlagzahlZuruecksetzenSteps extends BaseSteps {

	public SchlagzahlZuruecksetzenSteps(TrackerDriver driver) {
		super(driver);
	}

	@When("ich zum nächsten Loch gehe,")
	public void geheZumNaechstenLoch() {
		empfangeAnweisung("Nächstes Loch");
	}
		
	@Then("setzt der NerdGolfTracker die Schlagzahl zurück.")
	public void setztSchlagzahlZurueck() {
		assertThatAntwort(is("Deine Schlagzahl wurde zurück gesetzt."));
	}
}
