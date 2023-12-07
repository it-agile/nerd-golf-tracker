package de.itagile.golf;

import java.util.ArrayList;
import java.util.List;

import de.itagile.golf.command.HelpCommand;
import de.itagile.golf.command.ChangeHoleCommand;
import de.itagile.golf.command.HitCommand;

public class CommandCollector {

	public List<Command> collect() {
		List<Command> harvest = new ArrayList<>();
		harvest.add(new HitCommand());
		harvest.add(new ChangeHoleCommand());
		harvest.add(new HelpCommand());
		return harvest;
	}
}
