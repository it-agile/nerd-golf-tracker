package de.itagile.golf.operation;

import de.itagile.golf.Operation;
import de.itagile.golf.ScoreCard;

public final class Stroke implements Operation {
	
	private final Operation followUpOperation;

	public Stroke(Operation followUpOperation) {
		this.followUpOperation = followUpOperation;
	}
	
	public String run(ScoreCard scoreCard) {
		scoreCard.increaseScore();
		return followUpOperation.run(scoreCard);
	}

}