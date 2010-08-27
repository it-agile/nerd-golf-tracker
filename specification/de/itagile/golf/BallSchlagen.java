package de.itagile.golf;

import de.itagile.golf.jbehave.BaseScenario;


public class BallSchlagen extends BaseScenario {
	
	public BallSchlagen() {
		addSteps(new BallSchlagenSteps(new TrackerDriver()));
	}
}