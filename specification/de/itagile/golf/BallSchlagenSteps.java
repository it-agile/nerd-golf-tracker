package de.itagile.golf;


import org.jbehave.scenario.annotations.Then;
import org.jbehave.scenario.annotations.When;
import org.jbehave.scenario.steps.Steps;

public class BallSchlagenSteps extends Steps {

    private GolfTrackerDriver trackerDriver = new GolfTrackerDriver();

    @When("ich den Ball einmal schlage,")
    public void ballEinmalSchlagen() {
        trackerDriver.schlageBall();
    }
    
    @Then("antwortet mir der NerdGolfTracker \"$erwarteteAntwort\"")
    public void golfTrackerAntwortet(String erwarteteAntwort) {
        trackerDriver.gibtAntwort(erwarteteAntwort);
    }

}
