package de.itagile.golf.operation;

import de.itagile.golf.Operation;
import de.itagile.golf.ScoreCard;

public class HoleDisplay implements Operation {

	@Override
	public String run(ScoreCard scoreCard) {
		return "on the " + scoreCard.currentHole() + ". hole.";
	}
}
