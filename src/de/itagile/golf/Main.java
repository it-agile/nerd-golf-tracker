package de.itagile.golf;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) throws IOException {
		Tracker tracker = new Tracker(new EinfacherInterpreter());
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("auf dem 1. Loch");
		
		while (true) {
			String befehl = reader.readLine();
			System.out.println(tracker.reagiereAuf(befehl));
		}
	}
}