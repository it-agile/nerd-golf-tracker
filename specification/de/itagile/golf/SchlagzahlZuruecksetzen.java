package de.itagile.golf;

import org.junit.Ignore;

import de.itagile.golf.jbehave.BaseScenario;

@Ignore("in Arbeit")
public class SchlagzahlZuruecksetzen extends BaseScenario {

	public SchlagzahlZuruecksetzen() {
		TrackerDriver_ tracker = new TrackerDriver_();
		addSteps(new NerdGolfTrackerSteps_(tracker),
				 new SchlagzahlZuruecksetzenSteps_(tracker)
		);
	}
}