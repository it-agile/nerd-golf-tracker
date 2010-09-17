package de.itagile.golf.operation;

import de.itagile.golf.Operation;
import de.itagile.golf.Scorecard;

public final class Lochwechsel implements Operation {
	
	private final Operation folgeoperation;

	public Lochwechsel(Operation folgeoperation) {
		this.folgeoperation = folgeoperation;
	}

	public String fuehreAus(Scorecard scorecard) {
		scorecard.setzeZurueckAnzahlSchlaege();
		return "Deine Schlagzahl wurde zurückgesetzt und Du bist " + folgeoperation.fuehreAus(scorecard);
	}
}