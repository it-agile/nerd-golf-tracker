package de.itagile.golf;

import de.itagile.golf.jbehave.BaseSteps;
import org.jbehave.scenario.annotations.When;

public class VerschiedeneSteps extends BaseSteps {
	public VerschiedeneSteps(TrackerDriver driver) {
		super(driver);
	}

	@When("ich den NerdGolfTracker starte,")
	public void starteNerdGolfTracker() {
	}
}
