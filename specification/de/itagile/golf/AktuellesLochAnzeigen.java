package de.itagile.golf;

import org.junit.Ignore;

import de.itagile.golf.jbehave.BaseScenario;

@Ignore("wip")
public class AktuellesLochAnzeigen extends BaseScenario {

	public AktuellesLochAnzeigen() {
		TrackerDriver driver = new TrackerDriver();
		addSteps(new AktuellesLochAnzeigenSteps(driver),
				 new BallSchlagenSteps(driver));
	}
}
