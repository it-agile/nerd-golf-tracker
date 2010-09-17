package de.itagile.golf;

import de.itagile.golf.jbehave.BaseScenario;

public class AktuellesLochAnzeigen extends BaseScenario {

	public AktuellesLochAnzeigen() {
		TrackerDriver driver = new TrackerDriver();
		addSteps(new AktuellesLochAnzeigenSteps(driver),
				 new BallSchlagenSteps(driver),
				 new ZumNaechstenLochGehenSteps(driver)
		);
	}
}
