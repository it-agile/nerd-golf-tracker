package de.itagile.golf;

import java.util.HashMap;
import java.util.Map;

import de.itagile.golf.operation.Schlag;
import de.itagile.golf.operation.Lochwechsel;

public class EinfacherInterpreter implements EingabeInterpreter {

	private Map<String, Operation> operationen = new HashMap<String, Operation>();

	public EinfacherInterpreter() {
		operationen.put("Nächstes Loch", new Lochwechsel());
		operationen.put("Schlage Ball", new Schlag());
	}

	public String verarbeiteEingabe(String eingabe, Scorecard scorecard) {
		return operationen.get(eingabe).fuehreAus(scorecard);
	}
}
