package de.itagile.golf;

import de.itagile.golf.jbehave.BaseSteps;
import org.jbehave.scenario.annotations.Named;
import org.jbehave.scenario.annotations.Then;
import org.jbehave.scenario.annotations.When;

import static org.hamcrest.Matchers.containsString;

public class HilfeAnzeigenSteps extends BaseSteps {

	public HilfeAnzeigenSteps(TrackerDriver driver) {
		super(driver);
	}
	
	@When("ich die Hilfe aufrufe")
	public void rufeHilfeAuf() {
		empfangeAnweisung("Hilfe");
	}

	@Then("listet der NerdGolfTracker einen Eintrag zu <Kommando> auf")
	public void pruefeHilfeEintrag(@Named("Kommando") String kommando) {
		assertThatAntwort(containsString(kommando));
	}
	
}