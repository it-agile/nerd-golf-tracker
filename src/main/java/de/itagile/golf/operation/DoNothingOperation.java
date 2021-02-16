package de.itagile.golf.operation;

import de.itagile.golf.Operation;
import de.itagile.golf.Scorecard;

final class DoNothingOperation implements Operation {
	@Override
	public String fuehreAus(Scorecard scorecard) {
		return "";
	}
}