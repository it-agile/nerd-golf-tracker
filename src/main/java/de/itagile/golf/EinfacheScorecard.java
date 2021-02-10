package de.itagile.golf;

public class EinfacheScorecard implements Scorecard {

	private int aktuellesLoch = 1;
	private int anzahlSchlaege;
	private int anzahlGesamtschlaege;

	public void erhoeheAnzahlSchlaege() {
		anzahlSchlaege++;
	}

	public void schliesseLochAb() {
		aktuellesLoch++;
		anzahlGesamtschlaege = anzahlGesamtschlaege + anzahlSchlaege;
		anzahlSchlaege = 0;
	}

	public int anzahlSchlaege() {
		return anzahlSchlaege;
	}

	public int aktuellesLoch() {
		return aktuellesLoch;
	}

	public int anzahlGesamtschlaege() {
		return anzahlGesamtschlaege;
	}
}
