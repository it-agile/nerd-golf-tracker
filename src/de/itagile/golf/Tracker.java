package de.itagile.golf;

public class Tracker {

	private Scorecard scorecard = new Scorecard();
	private EingabeInterpreter interpreter;

	public Tracker() {
	}
	
	public Tracker(EingabeInterpreter interpreter) {
		this.interpreter = interpreter;
	}

	public String reagiereAuf(String eingabe) {
		Anweisung anweisung = Anweisung.fuer(eingabe);
		return anweisung.fuehreAus(scorecard);
	}

	public String reagiereAuf2(String eingabe) {
		return interpreter.fuehreOperationAusFuerEingabe(eingabe, scorecard);
	}
}
