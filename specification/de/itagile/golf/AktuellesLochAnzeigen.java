package de.itagile.golf;

import de.itagile.golf.jbehave.BaseScenario;

public class AktuellesLochAnzeigen extends BaseScenario {

	public AktuellesLochAnzeigen() {
		TrackerDriver driver = new TrackerDriver();
		addSteps(new NerdGolfTrackerSteps(driver),
                new AktuellesLochSteps(driver));
	}
}
