package de.itagile.golf;

import de.itagile.golf.jbehave.BaseScenario;

public class HilfeAnzeigen extends BaseScenario {
	
	public HilfeAnzeigen() {
		addSteps(new HilfeAnzeigenSteps(new TrackerDriver()));
	}
}