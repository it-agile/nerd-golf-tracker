package de.itagile.golf;

import static org.hamcrest.Matchers.containsString;

import org.jbehave.scenario.annotations.Then;
import org.jbehave.scenario.annotations.When;

import de.itagile.golf.jbehave.BaseSteps;

public class HilfeSteps extends BaseSteps {

	public HilfeSteps(TrackerDriver driver) {
		super(driver);
	}
	
	@When("ich die Hilfe aufrufe,")
	public void rufeHilfeAuf() {
		empfangeAnweisung("Hilfe");
	}
	
	@Then("zeigt der NerdGolfTracker seine Benutzung an.")
	public void zeigtBenutzungAn() {		
		assertThatAntwort(containsString("Ich reagiere auf:"));
	}
}