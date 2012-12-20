package de.itagile.golf;

import de.itagile.golf.jbehave.BaseScenario;
import org.junit.Ignore;

@Ignore("in Arbeit")
public class SchlagzahlZuruecksetzen extends BaseScenario {

	public SchlagzahlZuruecksetzen() {
		TrackerDriver driver = new TrackerDriver();
		addSteps(new NerdGolfTrackerSteps(driver),
				 new SchlagzahlZuruecksetzenSteps(driver)
		);
	}
}