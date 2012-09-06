package de.itagile.golf;

import de.itagile.golf.jbehave.BaseScenario;

public class LochHochzaehlen extends BaseScenario {

	public LochHochzaehlen() {
		TrackerDriver driver = new TrackerDriver();
		addSteps(new AktuellesLochSteps(driver),
				new VerschiedeneSteps(driver),
				new ZumNaechstenLochGehenSteps(driver));
	}
}
