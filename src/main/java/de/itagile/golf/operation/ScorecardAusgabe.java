package de.itagile.golf.operation;

import de.itagile.golf.Operation;
import de.itagile.golf.Scorecard;

public class ScorecardAusgabe implements Operation {
    @Override
    public String fuehreAus(Scorecard scorecard) {
        return "Gesamtschläge: "+ scorecard.anzahlGesamtschlaege();
    }
}
