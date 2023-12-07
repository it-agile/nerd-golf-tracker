package de.itagile.golf;

import static java.util.stream.Collectors.toMap;

import java.util.Map;

public class SimpleInterpreter implements Interpreter {

	private final Map<String, Operation> operations;

	public SimpleInterpreter() {
		operations = new CommandCollector().collect().stream().collect(toMap(Command::command, Command::operation));
	}

	@Override
	public Operation interpret(String string) {
		return operations.get(string);
	}
}
