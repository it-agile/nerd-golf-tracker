package de.itagile.golf.jbehave;

import org.jbehave.scenario.steps.Steps;


public abstract class BaseSteps extends Steps {

	public BaseSteps() {
		super(ScenarioConfiguration.KEYWORDS);
	}
}
