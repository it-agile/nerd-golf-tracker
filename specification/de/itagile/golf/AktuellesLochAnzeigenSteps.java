package de.itagile.golf;

import static org.hamcrest.Matchers.containsString;

import org.jbehave.scenario.annotations.Then;
import org.jbehave.scenario.annotations.When;

import de.itagile.golf.jbehave.BaseSteps;

public class AktuellesLochAnzeigenSteps extends BaseSteps {
	
	public AktuellesLochAnzeigenSteps(TrackerDriver driver) {
		super(driver);
	}
	
	@When("ich den NerdGolfTracker starte,")
	public void starteNerdGolfTracker() {
	}
	
	@Then("zählt er die Schläge auf dem 1. Loch.")
	public void zaehltSchlaegeAufLoch() {
		assertThatAntwort(containsString("auf dem 1. Loch"));
	}
}
