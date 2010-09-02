package de.itagile.golf.operation;

import de.itagile.golf.Operation;
import de.itagile.golf.Scorecard;

public class Schlagzahlausgabe implements Operation {

	@Override
	public String fuehreAus(Scorecard scorecard) {
		String vorlage = "Du hast %d %s.";
		return String.format(vorlage, scorecard.anzahlSchlaege(), einheit(scorecard.anzahlSchlaege()));
	}

	private String einheit(int anzahlSchlaege) {
		return anzahlSchlaege == 1 ? "Schlag" : "Schläge";
	}
}
