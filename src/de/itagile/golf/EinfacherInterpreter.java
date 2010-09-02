package de.itagile.golf;

import java.util.HashMap;
import java.util.Map;

import de.itagile.golf.operation.Lochwechsel;
import de.itagile.golf.operation.Schlag;
import de.itagile.golf.operation.Schlagzahlausgabe;

public class EinfacherInterpreter implements Interpreter {

	private Map<String, Operation> operationen = new HashMap<String, Operation>();

	public EinfacherInterpreter() {
		operationen.put("Nächstes Loch", new Lochwechsel());
		operationen.put("Schlage Ball", new Schlag(new Schlagzahlausgabe()));
	}

	@Override
	public Operation interpretiere(String string) {
		return operationen.get(string);
	}
}
