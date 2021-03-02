package de.itagile.golf.operation;

import java.util.ArrayList;
import java.util.List;

import de.itagile.golf.Command;
import de.itagile.golf.CommandCollector;
import de.itagile.golf.Operation;
import de.itagile.golf.ScoreCard;
import de.itagile.golf.util.CollectionUtils;
import de.itagile.golf.util.SystemProperties;

public class Help implements Operation {

	private final CommandCollector collector;

	public Help(CommandCollector collector) {
		this.collector = collector;
	}

	@Override
	public String run(ScoreCard scoreCard) {
		List<String> helpTexts = new ArrayList<>();
		for (Command command : collector.collect()) {
			helpTexts.add(helpLineFor(command));
		}
		return "Ich reagiere auf: " + CollectionUtils.join(helpTexts, SystemProperties.LINE_SEPARATOR);
	}

	private String helpLineFor(Command command) {
		return String.format(" * %s (...%s)", command.command(), command.description());
	}
}
