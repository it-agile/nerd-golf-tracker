package de.itagile.golf;

import static java.lang.String.valueOf;
import static org.hamcrest.Matchers.equalTo;

import cucumber.api.java.de.Dann;
import cucumber.api.java.de.Wenn;

public class BeendeStepdefs {

	private TrackerDriver tracker;
	private int schlaege;

	public BeendeStepdefs(TrackerDriver tracker) {
		this.tracker = tracker;
	}

	@Dann("kommt die Ausgabe Und Tschüss...")
    public void pruefeEnde() {
        tracker.assertThatAntwort(equalTo("Und Tschüss..."));
    }


}
