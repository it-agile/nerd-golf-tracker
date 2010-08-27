package de.itagile.golf;

public class EinfacheScorecard implements Scorecard {

	private int anzahlSchlaege;

	public void erhoeheAnzahlSchlaege() {
		anzahlSchlaege++;
	}

	public void setzeZurueckAnzahlSchlaege() {
		anzahlSchlaege = 0;
	}

	public int anzahlSchlaege() {
		return anzahlSchlaege;
	}
}
