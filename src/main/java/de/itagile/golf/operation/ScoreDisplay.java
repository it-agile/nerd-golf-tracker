package de.itagile.golf.operation;

import de.itagile.golf.Operation;
import de.itagile.golf.ScoreCardCamelCaseProblem;

public class ScoreDisplay implements Operation {

	private Operation followUpOperation;

	public ScoreDisplay(Operation followUpOperation) {
		this.followUpOperation = followUpOperation;
	}

	@Override
	public String run(ScoreCardCamelCaseProblem scoreCard) {
		String template = "Your score is %d strokes %s";
		return String.format(template,
							 scoreCard.score(),
							 followUpOperation.run(scoreCard));
	}
}
