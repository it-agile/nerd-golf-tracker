package de.itagile.golf;

import de.itagile.golf.jbehave.BaseScenario;


public class SchlaegeZaehlen extends BaseScenario {
	
	public SchlaegeZaehlen() {
		TrackerDriver tracker = new TrackerDriver();
		addSteps(new NerdGolfTrackerSteps(tracker),
				 new SchlaegeZaehlenSteps(tracker));
	}
}