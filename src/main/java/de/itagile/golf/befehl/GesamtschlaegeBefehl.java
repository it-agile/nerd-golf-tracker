package de.itagile.golf.befehl;

import de.itagile.golf.Befehl;
import de.itagile.golf.Operation;
import de.itagile.golf.operation.Gesamtschlaege;

public class GesamtschlaegeBefehl implements Befehl {

	@Override
	public String kommando() {
		return "Gesamtschläge";
	}

	@Override
	public Operation operation() {
		return new Gesamtschlaege();
	}

	@Override
	public String beschreibung() {
		return "dann gebe ich die Zahl der Gesamtschläge aus";
	}

}
