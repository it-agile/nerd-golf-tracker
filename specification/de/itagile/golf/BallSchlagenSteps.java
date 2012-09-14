package de.itagile.golf;


import de.itagile.golf.jbehave.BaseSteps;
import org.jbehave.scenario.annotations.When;

public class BallSchlagenSteps extends BaseSteps {

    public BallSchlagenSteps(TrackerDriver driver) {
		super(driver);
	}

	@When("ich den Ball einmal schlage")
    public void schlageBall() {
        empfangeAnweisung("Schlage Ball");
    }
    
}
