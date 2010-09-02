package de.itagile.golf;

import static org.junit.Assert.fail;

import org.jbehave.scenario.annotations.Then;
import org.jbehave.scenario.annotations.When;

import de.itagile.golf.jbehave.BaseSteps;

public class HilfeSteps extends BaseSteps {

	public HilfeSteps(TrackerDriver driver) {
	}
	
	@When("ich die Hilfe aufrufe,")
	public void rufeHilfeAuf() {
		fail();
	}
	
	@Then("zeigt der NerdGolfTracker seine Benutzung an.")
	public void zeigtBenutzungAn() {		
		fail();
	}
}
