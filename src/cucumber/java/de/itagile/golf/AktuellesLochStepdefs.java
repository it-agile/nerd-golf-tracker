package de.itagile.golf;

import static org.hamcrest.Matchers.containsString;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AktuellesLochStepdefs {

	private TrackerDriver tracker;

	public AktuellesLochStepdefs(TrackerDriver tracker) {
		this.tracker = tracker;
	}
	
	@When("ich zum nächsten Loch gehe")
    public void geheZumNaechstenLoch() {
        tracker.gibEin("Nächstes Loch");
    }
	
	@Then("bin ich auf dem (\\d+). Loch")
	public void pruefeAktuellesLoch(int erwartetesLoch) {
		pruefeLochAnzeige(erwartetesLoch);
		tracker.gibEin("Schlage Ball");
		pruefeLochAnzeige(erwartetesLoch);
	}

	private void pruefeLochAnzeige(int loch) {
		tracker.assertThatAntwort(containsString(String.format("%d.Loch", loch)));
	}
	
}
