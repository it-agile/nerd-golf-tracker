package de.itagile.golf.operation;

import static java.util.stream.Collectors.joining;

import de.itagile.golf.Command;
import de.itagile.golf.CommandCollector;
import de.itagile.golf.Operation;
import de.itagile.golf.Scorecard;
import de.itagile.golf.util.SystemProperties;

public class Help implements Operation {

	private final CommandCollector collector;

	public Help(CommandCollector collector) {
		this.collector = collector;
	}

	@Override
	public String execute(Scorecard scorecard) {
		return "I respond to: "
				+ collector.collect().stream().map(this::helpLineFor).collect(joining(SystemProperties.LINE_SEPARATOR));
	}

	private String helpLineFor(Command command) {
		return String.format(" * %s (...%s)", command.command(), command.description());
	}
}
