package de.itagile.golf;

public class Tracker {

	private Scorecard scorecard = new EinfacheScorecard();
	private EingabeInterpreter interpreter;
	private Operation startoperation;

	public Tracker(EingabeInterpreter interpreter) {
		this.interpreter = interpreter;
	}

	public String reagiereAuf(String eingabe) {
		return interpreter.interpretiere(eingabe).fuehreAus(scorecard);
	}

	public String starte() {
		return startoperation.fuehreAus(scorecard);
	}

	public void setStartoperation(Operation startoperation) {
		this.startoperation = startoperation;
	}
}
