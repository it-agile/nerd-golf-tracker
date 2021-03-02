package de.itagile.golf.operation;

import de.itagile.golf.Operation;
import de.itagile.golf.ScoreCard;

public class NextHoleDisplay implements Operation {

	private final Operation followUpOperation;

	public NextHoleDisplay(Operation followUpOperation) {
		this.followUpOperation = followUpOperation;
	}

	@Override
	public String run(ScoreCard scoreCard) {
		return "Deine Schlagzahl wurde zurückgesetzt und Du bist " + followUpOperation.run(scoreCard);
	}
}
