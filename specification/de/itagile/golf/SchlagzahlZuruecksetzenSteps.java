package de.itagile.golf;

import org.jbehave.scenario.annotations.Then;
import org.jbehave.scenario.annotations.When;

import de.itagile.golf.jbehave.BaseSteps;

public class SchlagzahlZuruecksetzenSteps extends BaseSteps {

	private final TrackerDriver driver;

	public SchlagzahlZuruecksetzenSteps(TrackerDriver driver) {
		this.driver = driver;
	}

	@When("ich zum nächsten Loch gehe,")
	public void geheZumNaechstenLoch() {
		driver.geheZumNaechstenLoch();
	}
		
	@Then("setzt der NerdGolfTracker die Schlagzahl zurück.")
	public void setztSchlagzahlZurueck() {
		driver.setztSchlagzahlZurueck();
	}
}
