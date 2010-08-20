package de.itagile.golf;

import static org.junit.Assert.fail;

import org.jbehave.scenario.annotations.Then;
import org.jbehave.scenario.annotations.When;
import org.jbehave.scenario.steps.Steps;

public class BallSchlagenSteps extends Steps {

    @When("ich den Ball einmal schlage,")
    public void ballEinmalSchlagen() {
        
    }
    
    @Then("antwortet mir der NerdGolfTracker \"Du hast einen Schlag.\"")
    public void golfTrackerAntwortet() {
        fail();
    }
    
    


}
