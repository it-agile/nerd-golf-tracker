package de.itagile.golf.operation;

import de.itagile.golf.Operation;
import de.itagile.golf.Scorecard;

public final class HoleChange implements Operation {
	
	private final Operation postOperation;

	public HoleChange(Operation postOperation) {
		this.postOperation = postOperation;
	}

	public String execute(Scorecard scorecard) {
		scorecard.finishHole();
		return postOperation.execute(scorecard);
	}
}