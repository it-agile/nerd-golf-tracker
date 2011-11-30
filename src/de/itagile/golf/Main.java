package de.itagile.golf;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import de.itagile.golf.operation.Lochausgabe;
import de.itagile.golf.operation.Startausgabe;

public class Main {
	
	public static void main(String[] args) throws IOException {
		Startausgabe startoperation = new Startausgabe(new Lochausgabe());
		Tracker tracker = new Tracker(new EinfacherInterpreter(), startoperation);
		gibAus(tracker.starte());
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			String befehl = reader.readLine();
			gibAus(tracker.reagiereAuf(befehl));
		}
	}

	private static void gibAus(String ausgabe) {
		System.out.println(ausgabe);
	}
}