package de.itagile.golf.operation;

import static de.itagile.golf.util.SystemProperties.LINE_SEPARATOR;
import de.itagile.golf.Befehl;
import de.itagile.golf.Operation;
import de.itagile.golf.Sammler;
import de.itagile.golf.Scorecard;

public class Hilfe implements Operation {

	private final Sammler<Befehl> sammler;

	public Hilfe(Sammler<Befehl> sammler) {
		this.sammler = sammler;
	}

	@Override
	public String fuehreAus(Scorecard scorecard) {
		StringBuilder builder = new StringBuilder("Ich reagiere auf: ");
		for (Befehl befehl : sammler.sammle()) {
			builder.append(hilfeZeileFuer(befehl));
		}
		return builder.toString();
	}

	private String hilfeZeileFuer(Befehl befehl) {
		return String.format("%s * %s (...%s)", LINE_SEPARATOR, befehl.kommando(), befehl.beschreibung());
	}
}
