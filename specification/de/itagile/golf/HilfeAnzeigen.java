package de.itagile.golf;

import de.itagile.golf.jbehave.BaseScenario;

public class HilfeAnzeigen extends BaseScenario {
	
	public HilfeAnzeigen() {
        TrackerDriver_ tracker = new TrackerDriver_();
        addSteps(new NerdGolfTrackerSteps_(tracker),
                new HilfeAnzeigenSteps_(tracker));
	}
}