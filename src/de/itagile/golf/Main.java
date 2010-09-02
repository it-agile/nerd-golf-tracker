package de.itagile.golf;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import de.itagile.golf.operation.Schlagzahlausgabe;

public class Main {
	
	public static void main(String[] args) throws IOException {
		Tracker tracker = new Tracker(new EinfacherInterpreter());
		tracker.setStartoperation(new Schlagzahlausgabe());
		
		System.out.println("auf dem 1. Loch");
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			String befehl = reader.readLine();
			System.out.println(tracker.reagiereAuf(befehl));
		}
	}
}