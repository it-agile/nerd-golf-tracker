package de.itagile.golf;

import java.util.HashMap;
import java.util.Map;


public class EinfacherInterpreter implements Interpreter {

	private Map<String, Operation> operationen = new HashMap<String, Operation>();

	public EinfacherInterpreter() {
		for (Befehl befehl : new BefehleSammler().sammle()) {
			operationen.put(befehl.kommando(), befehl.operation());
		}
	}

	@Override
	public Operation interpretiere(String string) {
		return operationen.get(string);
	}
}
