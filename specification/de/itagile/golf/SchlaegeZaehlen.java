package de.itagile.golf;

import de.itagile.golf.jbehave.BaseScenario;


public class SchlaegeZaehlen extends BaseScenario {
	
	public SchlaegeZaehlen() {
		TrackerDriver_ tracker = new TrackerDriver_();
		addSteps(new NerdGolfTrackerSteps_(tracker),
				 new SchlaegeZaehlenSteps_(tracker));
	}
}