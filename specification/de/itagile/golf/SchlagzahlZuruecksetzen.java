package de.itagile.golf;

import de.itagile.golf.jbehave.BaseScenario;


public class SchlagzahlZuruecksetzen extends BaseScenario {

	public SchlagzahlZuruecksetzen() {
		TrackerDriver driver = new TrackerDriver();
		addSteps(new BallSchlagenSteps(driver),
				new SchlagzahlZuruecksetzenSteps(driver));
	}
}