package de.itagile.golf;



public class Tracker {

	public Scorecard scorecard = new EinfacheScorecard();
	private Interpreter interpreter;
	private Operation startoperation;

	public Tracker(Interpreter interpreter, Operation startoperation) {
		this.interpreter = interpreter;
		this.startoperation = startoperation;
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
