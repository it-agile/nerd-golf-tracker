package de.itagile.golf;

import de.itagile.golf.jbehave.BaseScenario;

public class HilfeAnzeigen extends BaseScenario {
	
	public HilfeAnzeigen() {
        TrackerDriver tracker = new TrackerDriver();
        addSteps(new NerdGolfTrackerSteps(tracker),
                new HilfeAnzeigenSteps(tracker));
	}
}