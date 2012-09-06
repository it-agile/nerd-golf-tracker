package de.itagile.golf;


import org.jbehave.scenario.annotations.Aliases;
import org.jbehave.scenario.annotations.When;

import de.itagile.golf.jbehave.BaseSteps;

public class BallSchlagenSteps extends BaseSteps {

    public BallSchlagenSteps(TrackerDriver driver) {
		super(driver);
	}

	@When("ich den Ball einmal schlage")
    @Aliases(values = {
    		"ich den Ball noch einmal schlage",
    		"ich nun den Ball schlage"
    })
    public void schlageBall() {
        empfangeAnweisung("Schlage Ball");
    }
    
}
