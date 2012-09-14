package de.itagile.golf;

import de.itagile.golf.jbehave.BaseScenario;

public class AktuellesLochAnzeigen extends BaseScenario {

	public AktuellesLochAnzeigen() {
		TrackerDriver driver = new TrackerDriver();
		addSteps(new StarteNerdGolfTrackerSteps(driver),
                new AktuellesLochSteps(driver),
				new VerschiedeneSteps(driver),
				new ZumNaechstenLochGehenSteps(driver));
	}
}
