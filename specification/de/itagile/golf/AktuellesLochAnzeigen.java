package de.itagile.golf;

import de.itagile.golf.jbehave.BaseScenario;

public class AktuellesLochAnzeigen extends BaseScenario {

	public AktuellesLochAnzeigen() {
		TrackerDriver_ tracker = new TrackerDriver_();
		addSteps(new NerdGolfTrackerSteps_(tracker),
                new AktuellesLochSteps_(tracker));
	}
}
