package de.itagile.golf.operation;

import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import de.itagile.golf.EinfacheScorecard;
import de.itagile.golf.befehl.ScorecardAusgabeBefehl;
import org.junit.Test;

import de.itagile.golf.Scorecard;

public class ScorecardTest {

    @Test
    public void ausgabeLeereScorecard() throws Exception {
        Scorecard scorecard = new EinfacheScorecard();
        assertThat(new ScorecardAusgabe().fuehreAus(scorecard),
                containsString("Gesamtschläge: 0"));
    }
    @Test
    public void ausgabeGespielteScorecard() throws Exception {
        Scorecard scorecard = new EinfacheScorecard();
        scorecard.erhoeheAnzahlSchlaege();
        assertThat(new ScorecardAusgabe().fuehreAus(scorecard),
                containsString("Gesamtschläge: 1"));
    }

}
