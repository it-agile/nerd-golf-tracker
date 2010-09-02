package de.itagile.golf;

import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.not;

import org.jbehave.scenario.annotations.Alias;
import org.jbehave.scenario.annotations.Then;
import org.jbehave.scenario.annotations.When;

import de.itagile.golf.jbehave.BaseSteps;

public class HilfeAnzeigenSteps extends BaseSteps {

	public HilfeAnzeigenSteps(TrackerDriver driver) {
		super(driver);
	}
	
	@When("ich die Hilfe aufrufe,")
	public void rufeHilfeAuf() {
		empfangeAnweisung("Hilfe");
	}
	
	@Then("zeigt der NerdGolfTracker seine Benutzung an")
	public void zeigtBenutzungAn() {		
		assertThatAntwort(containsString("Ich reagiere auf:"));
	}
	
	@Then("listet der NerdGolfTracker einen Eintrag zu \"$kommando\" inkl. entsprechender Beschreibung.")
	@Alias("listet einen Eintrag zu \"$kommando\" inkl. entsprechender Beschreibung.")
	public void zeigtBenutzungVonSchlageBallAn(String kommando) {
		assertThatAntwort(containsString(kommando));
		assertThatAntwort(containsString("..."));
		assertThatAntwort(not(containsString("(...null)")));
	}
	
}