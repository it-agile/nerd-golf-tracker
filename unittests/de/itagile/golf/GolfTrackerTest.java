package de.itagile.golf;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class GolfTrackerTest {

    @Test
    public void zaehltEinenSchlag() throws Exception {
        GolfTracker golfTracker = new GolfTracker();
        assertThat(golfTracker.reagiereAuf("schlage Ball"), is("Du hast einen Schlag."));
    }
}
