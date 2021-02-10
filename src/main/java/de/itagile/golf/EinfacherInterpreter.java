package de.itagile.golf;

import java.util.HashMap;
import java.util.Map;


public class EinfacherInterpreter implements Interpreter {

	private Map<String, Operation> operationen = new HashMap<>();

	public EinfacherInterpreter() {
		new BefehleSammler().sammle().forEach(befehl -> operationen.put(befehl.kommando(), befehl.operation()));
	}

	@Override
	public Operation interpretiere(String string) {
		if (operationen.get(string) == null) {
			return operationen.get("Hilfe");
		}
		return operationen.get(string);
	}
}
