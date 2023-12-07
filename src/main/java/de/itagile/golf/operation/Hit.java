package de.itagile.golf.operation;

import de.itagile.golf.Operation;
import de.itagile.golf.Scorecard;

public final class Hit implements Operation {
	
	private final Operation postOperation;

	public Hit(Operation postOperation) {
		this.postOperation = postOperation;
	}
	
	public String execute(Scorecard scorecard) {
		scorecard.increaseHitCount();
		return postOperation.execute(scorecard);
	}

}