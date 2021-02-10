package de.itagile.golf.operation;

import de.itagile.golf.Operation;
import de.itagile.golf.Scorecard;

public class BeendenAusgabe implements Operation {

	public BeendenAusgabe() {
	}
	
	@Override
	public String fuehreAus(Scorecard scorecard) {
		return "Und Tschüss...";
	}
}
