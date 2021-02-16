package de.itagile.golf.operation;

import java.util.ArrayList;
import java.util.List;

import de.itagile.golf.Operation;
import de.itagile.golf.Scorecard;

public class MultiOperation implements Operation {

	private List<Operation> operations = new ArrayList<>();

	@Override
	public String fuehreAus(Scorecard scorecard) {
		String result = "";
		for(Operation operation : operations) {
			result += operation.fuehreAus(scorecard);
		}
		return result;
	}

	public void add(Operation operation) {
		operations.add(operation);
	}

}
