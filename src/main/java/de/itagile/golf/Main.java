package de.itagile.golf;

import java.io.IOException;

import de.itagile.golf.console.Console;
import de.itagile.golf.operation.HoleOutput;
import de.itagile.golf.operation.StartOutput;

public class Main {
	
	public static void main(String[] args) throws IOException {
		Console console = new Console();
		
		StartOutput startoperation = new StartOutput(new HoleOutput());
		Tracker tracker = new Tracker(new SimpleInterpreter(), startoperation);

		console.println(tracker.start()).exit();
		
		while (true) {
			String command = console.readln();
			console.println(tracker.respondTo(command)).exit();
		}
	}
}