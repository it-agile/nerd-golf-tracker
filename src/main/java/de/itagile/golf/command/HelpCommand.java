package de.itagile.golf.command;

import de.itagile.golf.Command;
import de.itagile.golf.Operation;
import de.itagile.golf.CommandCollector;
import de.itagile.golf.operation.Help;

public class HelpCommand implements Command {

	public String command() {
		return "help";
	}

	public Operation operation() {
		return new Help(new CommandCollector());
	}

	public String description() {
		return "dann zeige ich Dir das hier";
	}

}
