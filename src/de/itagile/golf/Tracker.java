package de.itagile.golf;

public class Tracker {

	private Scorecard scorecard = new Scorecard();
	
	public String reagiereAuf(String eingabe) {
		Anweisung anweisung = Anweisung.fuer(eingabe);
		return anweisung.fuehreAus(scorecard);
	}
}
