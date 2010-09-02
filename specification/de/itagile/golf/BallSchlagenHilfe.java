package de.itagile.golf;

import de.itagile.golf.jbehave.BaseScenario;

public class BallSchlagenHilfe extends BaseScenario {
	
	public BallSchlagenHilfe() {
		addSteps(new HilfeAnzeigenSteps(new TrackerDriver()));
	}
}