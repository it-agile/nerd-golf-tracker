package de.itagile.golf;

import org.jbehave.scenario.Scenario;

public class SchlagzahlZuruecksetzen extends Scenario {

	public SchlagzahlZuruecksetzen() {
		TrackerDriver driver = new TrackerDriver();
		addSteps(new BallSchlagenSteps(driver),
				new SchlagzahlZuruecksetzenSteps(driver));
	}
}
