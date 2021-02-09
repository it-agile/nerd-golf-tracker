package de.itagile.golf.operation;

import de.itagile.golf.Operation;
import de.itagile.golf.Scorecard;

public class Schlagzahlausgabe implements Operation {

	private Operation folgeoperation;

	public Schlagzahlausgabe(Operation folgeoperation) {
		this.folgeoperation = folgeoperation;
	}

	@Override
	public String fuehreAus(Scorecard scorecard) {
		if (scorecard.anzahlSchlaege() == 0)
		{
			return String.format("Du hast noch keinen Schlag %s", folgeoperation.fuehreAus(scorecard));
		}
		else if (scorecard.anzahlSchlaege() == 1)
		{
			return String.format("Du hast %d Schlag %s", scorecard.anzahlSchlaege(), folgeoperation.fuehreAus(scorecard));
		}
		String vorlage = "Du hast %d Schläge %s";
		return String.format(vorlage, scorecard.anzahlSchlaege(), folgeoperation.fuehreAus(scorecard));
	}
}
