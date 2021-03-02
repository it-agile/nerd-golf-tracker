package de.itagile.golf;



public class Tracker {

	public ScoreCard scoreCard = new SimpleScoreCard();
	private Interpreter interpreter;
	private Operation startOperation;

	public Tracker(Interpreter interpreter, Operation startOperation) {
		this.interpreter = interpreter;
		this.startOperation = startOperation;
	}
	
	public String respondTo(String input) {
		return interpreter.interpret(input).run(scoreCard);
	}

	public String start() {
		return startOperation.run(scoreCard);
	}

	public void setStartOperation(Operation startOperation) {
		this.startOperation = startOperation;
	}

}
