package de.itagile.golf.operation;

import de.itagile.golf.Operation;
import de.itagile.golf.ScoreCard;

public class ScoreDisplay implements Operation {

	private Operation followUpOperation;

	public ScoreDisplay(Operation followUpOperation) {
		this.followUpOperation = followUpOperation;
	}

	@Override
	public String run(ScoreCard scoreCard) {
		String template = "Du hast %d Schlag %s";
		return String.format(template,
							 scoreCard.score(),
							 followUpOperation.run(scoreCard));
	}
}
