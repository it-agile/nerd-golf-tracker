package de.itagile.golf;

import static org.hamcrest.Matchers.containsString;

import org.jbehave.scenario.annotations.Named;
import org.jbehave.scenario.annotations.Then;
import org.jbehave.scenario.annotations.When;

import de.itagile.golf.jbehave.BaseSteps;

public class HilfeAnzeigenSteps_ extends BaseSteps {

	private TrackerDriver_ tracker;

	public HilfeAnzeigenSteps_(TrackerDriver_ tracker) {
		this.tracker = tracker;
	}
	
	@When("ich die Hilfe aufrufe")
	public void rufeHilfeAuf() {
		tracker.gibEin("Hilfe");
	}

	@Then("listet der NerdGolfTracker einen Eintrag zu <Kommando> auf")
	public void pruefeHilfeEintrag(@Named("Kommando") String kommando) {
		tracker.assertThatAntwort(containsString(kommando));
	}
	
}