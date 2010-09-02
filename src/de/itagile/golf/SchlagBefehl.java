package de.itagile.golf;

import de.itagile.golf.operation.Schlag;
import de.itagile.golf.operation.Schlagzahlausgabe;

public class SchlagBefehl implements Befehl {

	public Schlag operation() {
		return new Schlag(new Schlagzahlausgabe());
	}

	public String kommando() {
		return "Schlage Ball";
	}

}
