package de.itagile.golf;

import static org.hamcrest.Matchers.containsString;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AktuellesLochStepdefs {

	private TrackerDriver tracker;

	public AktuellesLochStepdefs(TrackerDriver tracker) {
		this.tracker = tracker;
	}
	
	@When("ich zum nächsten Loch gehe")
    public void geheZumNaechstenLoch() {
        tracker.gibEin("Nächstes Loch");
    }
	
	@Then("bin ich auf dem {int}. Loch")
	public void pruefeAktuellesLoch(int erwartetesLoch) {
		pruefeLochAnzeige(erwartetesLoch);
		tracker.gibEin("Schlage Ball");
		pruefeLochAnzeige(erwartetesLoch);
	}

	private void pruefeLochAnzeige(int loch) {
		tracker.assertThatAntwort(containsString(String.format("%d.Loch", loch)));
	}
	
}
