package de.itagile.golf;

public class EinfacheScorecard implements Scorecard {

	private int aktuellesLoch = 1;
	private int anzahlSchlaege = 0;
	private int gesamtanzahlSchlaege = 0;

	public void erhoeheAnzahlSchlaege() {
		anzahlSchlaege++;
		gesamtanzahlSchlaege++;
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

	@Override
	public int gesamtSchlaege() {
		return gesamtanzahlSchlaege;
	}
}
