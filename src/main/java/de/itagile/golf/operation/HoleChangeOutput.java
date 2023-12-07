package de.itagile.golf.operation;

import de.itagile.golf.Operation;
import de.itagile.golf.Scorecard;

public class HoleChangeOutput implements Operation {

	private final Operation postOperation;

	public HoleChangeOutput(Operation postOperation) {
		this.postOperation = postOperation;
	}

	@Override
	public String execute(Scorecard scorecard) {
		return "Your hit count got reset and you are " + postOperation.execute(scorecard);
	}
}
