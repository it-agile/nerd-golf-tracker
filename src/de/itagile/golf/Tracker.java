package de.itagile.golf;

public class Tracker {

	private int anzahlSchlaege;
	
	public String reagiereAuf(String anweisung) {
		if (anweisung.equals("Nächstes Loch")) {
			return "Deine Schlagzahl wurde zurück gesetzt.";
		}
		anzahlSchlaege++;
		String vorlage = "Du hast %d %s.";
		return String.format(vorlage, anzahlSchlaege, einheit());
	}

	private String einheit() {
		return anzahlSchlaege == 1 ? "Schlag" : "Schläge";
	}

}
