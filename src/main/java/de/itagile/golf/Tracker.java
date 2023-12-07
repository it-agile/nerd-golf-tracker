package de.itagile.golf;



public class Tracker {

	public Scorecard scorecard = new SimpleScorecard();
	private Interpreter interpreter;
	private Operation startOperation;

	public Tracker(Interpreter interpreter, Operation startOperation) {
		this.interpreter = interpreter;
		this.startOperation = startOperation;
	}
	
	public String respondTo(String input) {
		return interpreter.interpret(input).execute(scorecard);
	}

	public String start() {
		return startOperation.execute(scorecard);
	}

	public void setStartOperation(Operation startOperation) {
		this.startOperation = startOperation;
	}

}
