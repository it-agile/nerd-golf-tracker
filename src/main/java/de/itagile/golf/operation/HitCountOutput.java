package de.itagile.golf.operation;

import de.itagile.golf.Operation;
import de.itagile.golf.Scorecard;

public class HitCountOutput implements Operation {

	private Operation postOperation;

	public HitCountOutput(Operation postOperation) {
		this.postOperation = postOperation;
	}

	@Override
	public String execute(Scorecard scorecard) {
		String template = "You got %d hit %s";
		return String.format(template, 
							 scorecard.hitCount(), 
							 postOperation.execute(scorecard));
	}
}
