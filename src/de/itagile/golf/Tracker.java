package de.itagile.golf;

public class Tracker {

	private Scorecard scorecard = new EinfacheScorecard();
	private EingabeInterpreter interpreter;

	public Tracker(EingabeInterpreter interpreter) {
		this.interpreter = interpreter;
	}

	public String reagiereAuf(String eingabe) {
		return interpreter.interpretiere(eingabe).fuehreAus(scorecard);
	}
}
