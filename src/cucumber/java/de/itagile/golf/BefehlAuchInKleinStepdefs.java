package de.itagile.golf;
import static org.hamcrest.Matchers.containsString;
import cucumber.api.java.de.Dann;
import cucumber.api.java.de.Wenn;

public class BefehlAuchInKleinStepdefs {
    private TrackerDriver tracker;

    public BefehlAuchInKleinStepdefs(TrackerDriver tracker) {
        this.tracker = tracker;
    }

    @Wenn("ich den Befehl {string} eingebe")
    public void rufeHilfeAuf(String befehl) {
        tracker.gibEin(befehl);
    }

    @Dann("wird die Hilfe angezeigt")
    public void wirdDieHilfeAngezeigt() {
        tracker.assertThatAntwort(containsString("Ich reagiere auf:"));
    }
}
