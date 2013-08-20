package de.itagile.golf;

public class EinfacheScorecard implements Scorecard {

	private int aktuellesLoch = 1;
	private int anzahlSchlaege;

	public void erhoeheAnzahlSchlaege() {
		anzahlSchlaege++;
	}

	public void schliesseLochAb() {
		aktuellesLoch++;
	}

	public int anzahlSchlaege() {
		return anzahlSchlaege;
	}

	public int aktuellesLoch() {
		return aktuellesLoch;
	}
}
