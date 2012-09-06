package de.itagile.golf;

import de.itagile.golf.jbehave.BaseScenario;

public class LochHochzaehlen extends BaseScenario {

	public LochHochzaehlen() {
		TrackerDriver driver = new TrackerDriver();
		addSteps(new AktuellesLochAnzeigenSteps(driver),
				 new BallSchlagenSteps(driver),
				 new ZumNaechstenLochGehenSteps(driver)
		);
	}
}
