package de.itagile.golf;

import org.jbehave.scenario.Scenario;

public class BallSchlagen extends Scenario {
    
    public BallSchlagen() {
        super(new BallSchlagenSteps(new TrackerDriver()));
    }
}