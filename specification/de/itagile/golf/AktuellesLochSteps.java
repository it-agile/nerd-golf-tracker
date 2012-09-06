package de.itagile.golf;

import de.itagile.golf.jbehave.BaseSteps;
import org.jbehave.scenario.annotations.Then;

import static org.hamcrest.Matchers.containsString;

public class AktuellesLochSteps extends BaseSteps {

	public AktuellesLochSteps(TrackerDriver driver) {
		super(driver);
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
