package de.itagile.golf.command;

import de.itagile.golf.Command;
import de.itagile.golf.operation.HoleOutput;
import de.itagile.golf.operation.Hit;
import de.itagile.golf.operation.HitCountOutput;

public class HitCommand implements Command {

	public Hit operation() {
		return new Hit(new HitCountOutput(new HoleOutput()));
	}

	public String command() {
		return "Hit ball";
	}

	public String description() {
		return "then I will count";
	}

}
