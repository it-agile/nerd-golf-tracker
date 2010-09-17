package de.itagile.golf.befehl;

import de.itagile.golf.Befehl;
import de.itagile.golf.operation.Lochausgabe;
import de.itagile.golf.operation.Lochwechsel;

public class LochwechselBefehl implements Befehl {

	public Lochwechsel operation() {
		return new Lochwechsel(new Lochausgabe());
	}

	public String kommando() {
		return "Nächstes Loch";
	}

	public String beschreibung() {
		return "dann zähle ich für das nächste Loch mit";
	}

}
