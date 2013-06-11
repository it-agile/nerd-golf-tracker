package de.itagile.golf;

import org.junit.Ignore;

import de.itagile.golf.jbehave.BaseScenario;

@Ignore("in Arbeit")
public class SchlagzahlZuruecksetzen extends BaseScenario {

	public SchlagzahlZuruecksetzen() {
		TrackerDriver tracker = new TrackerDriver();
		addSteps(new NerdGolfTrackerSteps(tracker),
				 new SchlagzahlZuruecksetzenSteps(tracker)
		);
	}
}