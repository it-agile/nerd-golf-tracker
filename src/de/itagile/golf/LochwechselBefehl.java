package de.itagile.golf;

import de.itagile.golf.operation.Lochwechsel;

public class LochwechselBefehl implements Befehl {

	public Lochwechsel operation() {
		return new Lochwechsel();
	}

	public String kommando() {
		return "Nächstes Loch";
	}

}
