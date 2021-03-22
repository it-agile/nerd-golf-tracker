package de.itagile.golf.operation;

import de.itagile.golf.Operation;
import de.itagile.golf.ScoreCardCamelCaseProblem;

public class HoleDisplay implements Operation {

	@Override
	public String run(ScoreCardCamelCaseProblem scoreCard) {
		return "on the " + scoreCard.currentHole() + ". hole.";
	}
}
