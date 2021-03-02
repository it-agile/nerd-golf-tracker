package de.itagile.golf;

import java.util.ArrayList;
import java.util.List;

import de.itagile.golf.command.HelpCommand;
import de.itagile.golf.command.NextHoleCommand;
import de.itagile.golf.command.StrokeCommand;

public class CommandCollector {

	public List<Command> collect() {
		List<Command> collection = new ArrayList<>();
		collection.add(new StrokeCommand());
		collection.add(new NextHoleCommand());
		collection.add(new HelpCommand());
		return collection;
	}
}
