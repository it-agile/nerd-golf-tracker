package de.itagile.golf;

import static org.hamcrest.Matchers.containsString;

import org.jbehave.scenario.annotations.Aliases;
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
	
	@Then("zählt er die Schläge auf dem $lochNo. Loch.")
	@Aliases(values = {
			"zählt er die Schläge immer noch auf dem $lochNo. Loch.", 
			"zählt der NerdGolfTracker die Schläge auf dem $lochNo. Loch."
		})
	public void zaehltSchlaegeAufLoch(int lochNo) {
		assertThatAntwort(containsString(String.format("auf dem %d. Loch", lochNo)));
	}
}
