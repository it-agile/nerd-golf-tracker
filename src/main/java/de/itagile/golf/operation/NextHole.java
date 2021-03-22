package de.itagile.golf.operation;

import de.itagile.golf.Operation;
import de.itagile.golf.ScoreCardCamelCaseProblem;

public final class NextHole implements Operation {
	
	private final Operation followUpOperation;

	public NextHole(Operation followUpOperation) {
		this.followUpOperation = followUpOperation;
	}

	public String run(ScoreCardCamelCaseProblem scoreCard) {
		scoreCard.completeCurrentHole();
		return followUpOperation.run(scoreCard);
	}
}