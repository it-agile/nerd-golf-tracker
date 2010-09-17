package de.itagile.golf;

import org.jbehave.scenario.annotations.When;

import de.itagile.golf.jbehave.BaseSteps;

public class ZumNaechstenLochGehenSteps extends BaseSteps {

	public ZumNaechstenLochGehenSteps(TrackerDriver driver) {
		super(driver);
	}

	@When("ich zum nächsten Loch gehe,")
	public void geheZumNaechstenLoch() {
		empfangeAnweisung("Nächstes Loch");
	}
}
