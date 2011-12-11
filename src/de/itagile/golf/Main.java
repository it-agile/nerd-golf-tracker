package de.itagile.golf;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

import de.itagile.golf.operation.Lochausgabe;
import de.itagile.golf.operation.Startausgabe;

public class Main {
	
	private static final String CHARSET = "UTF-8";
	private static PrintWriter writer;
	private static BufferedReader reader;

	public static void main(String[] args) throws IOException {
		writer = new PrintWriter(new OutputStreamWriter(System.out, CHARSET));
		reader = new BufferedReader(new InputStreamReader(System.in, CHARSET));
		
		Startausgabe startoperation = new Startausgabe(new Lochausgabe());
		Tracker tracker = new Tracker(new EinfacherInterpreter(), startoperation);

		gibAus(tracker.starte());
		
		while (true) {
			String befehl = reader.readLine();
			gibAus(tracker.reagiereAuf(befehl));
		}
	}

	private static void gibAus(String ausgabe) {
		writer.println(ausgabe);
		writer.flush();
	}
}