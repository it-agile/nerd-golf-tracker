package de.itagile.golf;

public class Tracker {

	Scorecard scorecard = new Scorecard();
	
	public String reagiereAuf(String eingabe) {
		Anweisung anweisung = Anweisung.fuer(eingabe);
		return anweisung.fuehreAus(scorecard);
	}
}
