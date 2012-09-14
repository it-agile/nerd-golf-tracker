package de.itagile.golf.jbehave;

import de.itagile.golf.TrackerDriver;
import org.hamcrest.Matcher;
import org.jbehave.scenario.steps.Steps;

import static org.junit.Assert.assertThat;

public abstract class BaseSteps extends Steps {

	private final TrackerDriver driver;

	public BaseSteps(TrackerDriver driver) {
		super(ScenarioConfiguration.KEYWORDS);
		this.driver = driver;
	}
	
	public void empfangeAnweisung(String anweisung) {
		driver.empfangeAnweisung(anweisung);
	}

	public void assertThatAntwort(Matcher<String> matcher) {
		assertThat(driver.letzteAntwort(), matcher);
	}

    public TrackerDriver getDriver() {
        return driver;
    }
}
