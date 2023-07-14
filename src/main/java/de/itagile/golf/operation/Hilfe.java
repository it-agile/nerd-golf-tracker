package de.itagile.golf.operation;

import static java.util.stream.Collectors.joining;

import de.itagile.golf.Befehl;
import de.itagile.golf.BefehleSammler;
import de.itagile.golf.Operation;
import de.itagile.golf.Scorecard;
import de.itagile.golf.util.SystemProperties;

public class Hilfe implements Operation {

	private final BefehleSammler sammler;

	public Hilfe(BefehleSammler sammler) {
		this.sammler = sammler;
	}

	@Override
	public String fuehreAus(Scorecard scorecard) {
		return "Ich reagiere auf: "
				+ sammler.sammle().stream().map(this::hilfeZeileFuer).collect(joining(SystemProperties.LINE_SEPARATOR));
	}

	private String hilfeZeileFuer(Befehl befehl) {
		return String.format(" * %s (...%s)", befehl.kommando(), befehl.beschreibung());
	}
}
