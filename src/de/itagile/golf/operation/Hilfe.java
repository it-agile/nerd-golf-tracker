package de.itagile.golf.operation;

import de.itagile.golf.Befehl;
import de.itagile.golf.BefehleSammler;
import de.itagile.golf.Operation;
import de.itagile.golf.Scorecard;

public class Hilfe implements Operation {

	private final BefehleSammler sammler;

	public Hilfe(BefehleSammler sammler) {
		this.sammler = sammler;
	}

	@Override
	public String fuehreAus(Scorecard scorecard) {
		StringBuilder builder = new StringBuilder("Ich reagiere auf: ");
		for (Befehl befehl : sammler.befehle()) {
			appendBefehl(builder, befehl);
		}
		return builder.toString();
	}

	public void appendBefehl(StringBuilder builder, Befehl befehl) {
		builder.append(befehl.kommando());
		builder.append(" (...");
		builder.append(befehl.beschreibung());
		builder.append("); ");
	}
}
