package de.itagile.golf;

import de.itagile.golf.jbehave.BaseScenario;

public class SchlagzahlZuruecksetzenHilfe extends BaseScenario {
	
	public SchlagzahlZuruecksetzenHilfe() {
		addSteps(new HilfeAnzeigenSteps(new TrackerDriver()));
	}
}