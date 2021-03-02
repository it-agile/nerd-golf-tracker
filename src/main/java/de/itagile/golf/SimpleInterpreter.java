package de.itagile.golf;

import java.util.HashMap;
import java.util.Map;


public class SimpleInterpreter implements Interpreter {

	private Map<String, Operation> operations = new HashMap<>();

	public SimpleInterpreter() {
		new CommandCollector().collect().forEach(command -> operations.put(command.command(), command.operation()));
	}

	@Override
	public Operation interpret(String string) {
		return operations.get(string);
	}
}
