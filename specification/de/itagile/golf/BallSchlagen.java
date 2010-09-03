package de.itagile.golf;

import de.itagile.golf.jbehave.BaseScenario;


public class BallSchlagen extends BaseScenario {
	
	public BallSchlagen() {
		TrackerDriver driver = new TrackerDriver();
		addSteps(new BallSchlagenSteps(driver),
				 new SchlaegeZaehlenSteps(driver));
	}
}