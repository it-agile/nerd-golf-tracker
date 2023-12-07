package de.itagile.golf.operation;

import de.itagile.golf.Operation;
import de.itagile.golf.Scorecard;

public class StartOutput implements Operation {

	private Operation postOperation;

	public StartOutput(Operation postOperation) {
		this.postOperation = postOperation;
	}
	
	@Override
	public String execute(Scorecard scorecard) {
		return "You are " + postOperation.execute(scorecard);
	}
}
