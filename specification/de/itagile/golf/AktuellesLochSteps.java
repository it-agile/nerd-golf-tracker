package de.itagile.golf;

import de.itagile.golf.jbehave.BaseSteps;
import org.jbehave.scenario.annotations.Then;
import org.jbehave.scenario.annotations.When;

import static org.hamcrest.Matchers.containsString;

public class AktuellesLochSteps extends BaseSteps {

	public AktuellesLochSteps(TrackerDriver tracker) {
		super(tracker);
	}

    @When("ich zum nächsten Loch gehe")
    public void geheZumNaechstenLoch() {
        gibEin("Nächstes Loch");
    }

    @Then("bin ich auf dem $lochNo. Loch")
	public void pruefeAktuellesLoch(int loch) {
		pruefeLochAnzeige(loch);
		gibEin("Schlage Ball");
		pruefeLochAnzeige(loch);
	}

	private void pruefeLochAnzeige(int loch) {
		assertThatAntwort(containsString(String.format("%d.Loch", loch)));
	}
}
