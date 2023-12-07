package de.itagile.golf.operation;

import de.itagile.golf.Operation;
import de.itagile.golf.Scorecard;

public class HoleOutput implements Operation {

	@Override
	public String execute(Scorecard scorecard) {
		return "on the " + scorecard.currentHole() + ".hole.";
	}
}
