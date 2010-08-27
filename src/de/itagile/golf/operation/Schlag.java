package de.itagile.golf.operation;

import de.itagile.golf.Operation;
import de.itagile.golf.Scorecard;

public final class Schlag implements Operation {
	
	public String fuehreAus(Scorecard scorecard) {
		scorecard.erhoeheAnzahlSchlaege();
		String vorlage = "Du hast %d %s.";
		return String.format(vorlage, scorecard.anzahlSchlaege(), einheit(scorecard.anzahlSchlaege()));
	}

	private String einheit(int anzahlSchlaege) {
		return anzahlSchlaege == 1 ? "Schlag" : "Schläge";
	}
}