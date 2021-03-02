package de.itagile.golf.operation;

import de.itagile.golf.Operation;
import de.itagile.golf.ScoreCard;

public final class NextHole implements Operation {
	
	private final Operation followUpOperation;

	public NextHole(Operation followUpOperation) {
		this.followUpOperation = followUpOperation;
	}

	public String run(ScoreCard scoreCard) {
		scoreCard.completeCurrentHole();
		return followUpOperation.run(scoreCard);
	}
}