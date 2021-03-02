package de.itagile.golf;

import java.io.IOException;

import de.itagile.golf.console.Console;
import de.itagile.golf.operation.HoleDisplay;
import de.itagile.golf.operation.StartDisplay;

public class Main {
	
	public static void main(String[] args) throws IOException {
		Console console = new Console();
		
		StartDisplay startOperation = new StartDisplay(new HoleDisplay());
		Tracker tracker = new Tracker(new SimpleInterpreter(), startOperation);

		console.println(tracker.start()).closeOutput();
		
		while (true) {
			String command = console.readLine();
			console.println(tracker.respondTo(command)).closeOutput();
		}
	}
}