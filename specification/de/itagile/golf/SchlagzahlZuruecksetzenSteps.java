package de.itagile.golf;

import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.is;

import org.jbehave.scenario.annotations.Then;

import de.itagile.golf.jbehave.BaseSteps;

public class SchlagzahlZuruecksetzenSteps extends BaseSteps {

	public SchlagzahlZuruecksetzenSteps(TrackerDriver driver) {
		super(driver);
	}

	@Then("setzt der NerdGolfTracker die Schlagzahl zurück.")
	public void setztSchlagzahlZurueck() {
		assertThatAntwort(containsString("Deine Schlagzahl wurde zurück gesetzt"));
	}
}
