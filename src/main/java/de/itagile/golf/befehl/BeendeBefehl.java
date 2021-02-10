package de.itagile.golf.befehl;

import de.itagile.golf.Befehl;
import de.itagile.golf.Operation;
import de.itagile.golf.BefehleSammler;
import de.itagile.golf.operation.BeendenAusgabe;
import de.itagile.golf.operation.Hilfe;
import de.itagile.golf.operation.Lochausgabe;
import de.itagile.golf.operation.Schlag;
import de.itagile.golf.operation.Schlagzahlausgabe;

public class BeendeBefehl implements Befehl {

	public Operation operation() {
		return new BeendenAusgabe();
	}

	public String kommando() {
		return "Beende";
	}

	public String beschreibung() {
		return "dann beende ich das Programm";
	}

}
