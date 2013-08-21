package de.itagile.golf.operation;

import de.itagile.golf.Operation;
import de.itagile.golf.Scorecard;

public class Gesamtschlaege implements Operation {

	@Override
	public String fuehreAus(Scorecard scorecard) {
		return String.format("Du hast insgesamt %s Schläge.", scorecard.gesamtSchlaege());
	}

}
