package de.itagile.golf.befehl;

import de.itagile.golf.Befehl;
import de.itagile.golf.operation.Schlag;
import de.itagile.golf.operation.Schlagzahlausgabe;

public class SchlagBefehl implements Befehl {

	public Schlag operation() {
		return new Schlag(new Schlagzahlausgabe());
	}

	public String kommando() {
		return "Schlage Ball";
	}

	public String beschreibung() {
		return "dann zähle ich mit";
	}

}
