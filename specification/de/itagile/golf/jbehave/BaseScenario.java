package de.itagile.golf.jbehave;

import org.jbehave.scenario.Scenario;

public abstract class BaseScenario extends Scenario {

	public BaseScenario() {
		useConfiguration(new ScenarioConfiguration());
	}

}
