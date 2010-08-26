package de.itagile.golf;

enum Anweisung {

	LOCHWECHSEL("Nächstes Loch", new Operation() {
		public String tue(Scorecard scorecard) {
			scorecard.setzeZurueckAnzahlSchlaege();
			return "Deine Schlagzahl wurde zurück gesetzt.";
		}
	}), SCHLAG("Schlage Ball", new Operation() {
		public String tue(Scorecard scorecard) {
			scorecard.erhoeheAnzahlSchlaege();
			String vorlage = "Du hast %d %s.";
			return String.format(vorlage, scorecard.anzahlSchlaege(), einheit(scorecard.anzahlSchlaege()));
		}
	});

	private final String anweisung;
	private final Operation operation;

	private Anweisung(String anweisung, Operation operation) {
		this.anweisung = anweisung;
		this.operation = operation;
	}

	public String fuehreAus(Scorecard scorecard) {
		return operation.tue(scorecard);
	}

	public static Anweisung fuer(String anweisung) {
		for (Anweisung operation : values()) {
			if (operation.anweisung.equals(anweisung))
				return operation;
		}
		return null;
	}

	private static String einheit(int anzahlSchlaege) {
		return anzahlSchlaege == 1 ? "Schlag" : "Schläge";
	}
}
