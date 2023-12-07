package de.itagile.golf.command;

import de.itagile.golf.Command;
import de.itagile.golf.operation.HoleOutput;
import de.itagile.golf.operation.HoleChange;
import de.itagile.golf.operation.HoleChangeOutput;

public class ChangeHoleCommand implements Command {

	public HoleChange operation() {
		return new HoleChange(new HoleChangeOutput(new HoleOutput()));
	}

	public String command() {
		return "Next hole";
	}

	public String description() {
		return "then I count for the next hole";
	}

}
