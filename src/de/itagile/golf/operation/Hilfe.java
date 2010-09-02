package de.itagile.golf.operation;

import de.itagile.golf.Operation;
import de.itagile.golf.Scorecard;

public class Hilfe implements Operation {

	@Override
	public String fuehreAus(Scorecard scorecard) {
		return "Ich reagiere auf:";
	}

}
