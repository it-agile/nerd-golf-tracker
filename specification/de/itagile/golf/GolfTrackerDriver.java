package de.itagile.golf;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class GolfTrackerDriver {

    private GolfTracker golfTracker = new GolfTracker();
    private String antwort;

    public void schlageBall() {
        antwort = golfTracker.reagiereAuf("schlage Ball");
    }

    public void gibtAntwort(String erwarteteAntwort) {
        assertThat(antwort, is(erwarteteAntwort));
    }
}
