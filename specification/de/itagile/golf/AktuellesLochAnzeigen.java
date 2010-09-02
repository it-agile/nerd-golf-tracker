package de.itagile.golf;

import org.junit.Ignore;

import de.itagile.golf.jbehave.BaseScenario;

@Ignore("wip von Alex und Sven")
public class AktuellesLochAnzeigen extends BaseScenario {

	public AktuellesLochAnzeigen() {
		addSteps(new AktuellesLochAnzeigenSteps());
	}
}
