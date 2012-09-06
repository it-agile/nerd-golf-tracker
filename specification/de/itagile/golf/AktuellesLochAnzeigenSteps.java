package de.itagile.golf;

import de.itagile.golf.jbehave.BaseSteps;
import org.jbehave.scenario.annotations.Then;
import org.jbehave.scenario.annotations.When;

import static org.hamcrest.Matchers.containsString;

public class AktuellesLochAnzeigenSteps extends BaseSteps {

	public AktuellesLochAnzeigenSteps(TrackerDriver driver) {
		super(driver);
	}

	@When("ich den NerdGolfTracker starte,")
	public void starteNerdGolfTracker() {
	}

	@Then("bin ich auf dem $lochNo. Loch.")
	public void pruefeAktuellesLoch(int loch) {
		pruefeLochAnzeige(loch);
		empfangeAnweisung("Schlage Ball");
		pruefeLochAnzeige(loch);
	}

	private void pruefeLochAnzeige(int loch) {
		assertThatAntwort(containsString(String.format("%d.Loch", loch)));
	}
}
