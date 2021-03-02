package de.itagile.golf.command;

import de.itagile.golf.Command;
import de.itagile.golf.operation.HoleDisplay;
import de.itagile.golf.operation.NextHole;
import de.itagile.golf.operation.NextHoleDisplay;

public class NextHoleCommand implements Command {

	public NextHole operation() {
		return new NextHole(new NextHoleDisplay(new HoleDisplay()));
	}

	public String command() {
		return "Nächstes Loch";
	}

	public String description() {
		return "dann zähle ich für das nächste Loch mit";
	}

}
