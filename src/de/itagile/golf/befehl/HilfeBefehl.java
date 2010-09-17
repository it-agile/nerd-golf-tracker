package de.itagile.golf.befehl;

import de.itagile.golf.Befehl;
import de.itagile.golf.Sammler;
import de.itagile.golf.Operation;
import de.itagile.golf.operation.Hilfe;

public class HilfeBefehl implements Befehl {

	public String kommando() {
		return "Hilfe";
	}

	public Operation operation() {
		return new Hilfe(new Sammler<Befehl>(Befehl.class));
	}

	public String beschreibung() {
		return "dann zeige ich Dir das hier";
	}

}
