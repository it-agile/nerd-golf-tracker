package de.itagile.golf.befehl;

import de.itagile.golf.Befehl;
import de.itagile.golf.Operation;
import de.itagile.golf.operation.Lochausgabe;
import de.itagile.golf.operation.Lochwechsel;
import de.itagile.golf.operation.Lochwechselausgabe;
import de.itagile.golf.operation.MultiOperation;

public class LochwechselBefehl implements Befehl {

	public Operation operation() {
		MultiOperation multiOp = new MultiOperation();
		multiOp.add(new Lochwechsel());
		multiOp.add(new Lochwechselausgabe());
		multiOp.add(new Lochausgabe());
		return multiOp;
	}

	public String kommando() {
		return "Nächstes Loch";
	}

	public String beschreibung() {
		return "dann zähle ich für das nächste Loch mit";
	}

}
