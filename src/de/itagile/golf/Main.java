package de.itagile.golf;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import de.itagile.golf.operation.Lochausgabe;

public class Main {
	
	public static void main(String[] args) throws IOException {
		Tracker tracker = new Tracker(new EinfacherInterpreter(), new Lochausgabe());
		gibtAus(tracker.starte());
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			String befehl = reader.readLine();
			gibtAus(tracker.reagiereAuf(befehl));
		}
	}

	private static void gibtAus(String ausgabe) {
		System.out.println(ausgabe);
	}
}