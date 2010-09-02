package de.itagile.golf;

import de.itagile.golf.operation.Hilfe;

public class HilfeBefehl implements Befehl {

	public String kommando() {
		return "Hilfe";
	}

	public Operation operation() {
		return new Hilfe();
	}

}
