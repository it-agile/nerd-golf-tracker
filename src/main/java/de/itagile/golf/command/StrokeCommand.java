package de.itagile.golf.command;

import de.itagile.golf.Command;
import de.itagile.golf.operation.HoleDisplay;
import de.itagile.golf.operation.Stroke;
import de.itagile.golf.operation.ScoreDisplay;

public class StrokeCommand implements Command {

	public Stroke operation() {
		return new Stroke(new ScoreDisplay(new HoleDisplay()));
	}

	public String command() {
		return "strike ball";
	}

	public String description() {
		return "then I count the score";
	}

}
