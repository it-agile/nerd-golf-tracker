package de.itagile.golf;

import org.jbehave.scenario.annotations.Then;
import org.jbehave.scenario.annotations.When;
import org.jbehave.scenario.steps.Steps;

public class SchlagzahlZuruecksetzenSteps extends Steps {

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
