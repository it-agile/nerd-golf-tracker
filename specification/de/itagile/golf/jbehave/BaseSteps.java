package de.itagile.golf.jbehave;

import de.itagile.golf.TrackerDriver;
import org.hamcrest.Matcher;
import org.jbehave.scenario.steps.Steps;

import static org.junit.Assert.assertThat;

public abstract class BaseSteps extends Steps {

	private final TrackerDriver tracker;

	public BaseSteps(TrackerDriver tracker) {
		super(ScenarioConfiguration.KEYWORDS);
		this.tracker = tracker;
	}
	
	public void gibEin(String anweisung) {
		tracker.gibEin(anweisung);
	}

	public void assertThatAntwort(Matcher<String> matcher) {
		assertThat(tracker.letzteAntwort(), matcher);
	}

    public TrackerDriver tracker() {
        return tracker;
    }
}
