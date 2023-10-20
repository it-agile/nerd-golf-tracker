package de.itagile.golf;

import static java.util.stream.Collectors.toMap;

import java.util.Map;

public class EinfacherInterpreter implements Interpreter {

	private final Map<String, Operation> operationen;

	public EinfacherInterpreter() {
		operationen = new BefehleSammler().sammle().stream().collect(toMap(Befehl::kommando, Befehl::operation));
	}

	@Override
	public Operation interpretiere(String string) {
		return operationen.get(string);
	}
}
