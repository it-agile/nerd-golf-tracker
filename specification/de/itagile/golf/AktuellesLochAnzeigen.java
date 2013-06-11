package de.itagile.golf;

import de.itagile.golf.jbehave.BaseScenario;

public class AktuellesLochAnzeigen extends BaseScenario {

	public AktuellesLochAnzeigen() {
		TrackerDriver tracker = new TrackerDriver();
		addSteps(new NerdGolfTrackerSteps(tracker),
                new AktuellesLochSteps(tracker));
	}
}
