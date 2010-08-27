package de.itagile.golf.operation;

import de.itagile.golf.Operation;
import de.itagile.golf.Scorecard;

public final class Lochwechsel implements Operation {
	
	public String fuehreAus(Scorecard scorecard) {
		scorecard.setzeZurueckAnzahlSchlaege();
		return "Deine Schlagzahl wurde zurück gesetzt.";
	}
}