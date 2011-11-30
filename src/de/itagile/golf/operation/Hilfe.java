package de.itagile.golf.operation;

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
			appendBefehl(builder, befehl);
		}
		return builder.toString();
	}

	private void appendBefehl(StringBuilder builder, Befehl befehl) {
		builder.append(System.getProperty("line.separator"));
		builder.append(" * ");
		builder.append(befehl.kommando());
		builder.append(" (...");
		builder.append(befehl.beschreibung());
		builder.append("); ");
	}
}
