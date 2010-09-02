package de.itagile.golf;

import static org.hamcrest.Matchers.containsString;

import org.jbehave.scenario.annotations.Then;
import org.jbehave.scenario.annotations.When;

import de.itagile.golf.jbehave.BaseSteps;

public class AktuellesLochAnzeigenSteps extends BaseSteps {
	
	private TrackerDriver driver;

	@When("ich den NerdGolfTracker starte,")
	public void starteNerdGolfTracker() {
		driver = new TrackerDriver();
	}
	
	@Then("zählt er die Schläge auf dem 1. Loch.")
	public void zaehltSchlaegeAufLoch() {
		driver.assertThatAntwort(containsString("auf dem 1. Loch"));
	}
}
