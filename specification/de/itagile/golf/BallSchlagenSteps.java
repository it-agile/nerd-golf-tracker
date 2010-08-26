package de.itagile.golf;


import org.jbehave.scenario.annotations.Alias;
import org.jbehave.scenario.annotations.Then;
import org.jbehave.scenario.annotations.When;
import org.jbehave.scenario.steps.Steps;

public class BallSchlagenSteps extends Steps {

    private GolfTrackerDriver trackerDriver = new GolfTrackerDriver();
    
    @When("ich den Ball einmal schlage,")
    @Alias("ich den Ball noch einmal schlage,")
    public void ballEinmalSchlagen() {
        trackerDriver.schlageBall();
    }
    
    @Then("antwortet mir der NerdGolfTracker \"$erwarteteAntwort\"")
    public void golfTrackerAntwortet(String erwarteteAntwort) throws Exception {
        trackerDriver.gibtAntwort(erwarteteAntwort);
    }

}
