package de.itagile.golf;

import de.itagile.golf.operation.Schlag;
import de.itagile.golf.operation.Lochwechsel;

enum Anweisung implements EingabeInterpreter {

	LOCHWECHSEL("Nächstes Loch", new Lochwechsel()), SCHLAG("Schlage Ball", new Schlag());

	private final String anweisung;
	private final Operation operation;

	private Anweisung(String anweisung, Operation operation) {
		this.anweisung = anweisung;
		this.operation = operation;
	}

	public String fuehreAus(Scorecard scorecard) {
		return operation.fuehreAus(scorecard);
	}

	public static Anweisung fuer(String anweisung) {
		for (Anweisung operation : values()) {
			if (operation.anweisung.equals(anweisung))
				return operation;
		}
		return null;
	}

	public String fuehreOperationAusFuerEingabe(String eingabe, Scorecard scorecard) {
		return null;
	}
}
