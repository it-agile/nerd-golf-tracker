package de.itagile.golf;

import static org.hamcrest.Matchers.containsString;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HilfeStepdefs {
	
	private TrackerDriver tracker;

	public HilfeStepdefs(TrackerDriver tracker) {
		this.tracker = tracker;
	}
	
	@When("ich die Hilfe aufrufe")
	public void rufeHilfeAuf() {
		tracker.gibEin("Hilfe");
	}
	
	@Then("listet der NerdGolfTracker einen Eintrag zu {string} auf")
	public void pruefeHilfeEintrag(String kommando) {
		tracker.assertThatAntwort(containsString(kommando));
	}
}
