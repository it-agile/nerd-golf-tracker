package de.itagile.golf.operation;

import de.itagile.golf.Operation;
import de.itagile.golf.ScoreCard;

public class StartDisplay implements Operation {

	private Operation followUpOperation;

	public StartDisplay(Operation followUpOperation) {
		this.followUpOperation = followUpOperation;
	}
	
	@Override
	public String run(ScoreCard scoreCard) {
		return "You are " + followUpOperation.run(scoreCard);
	}
}
