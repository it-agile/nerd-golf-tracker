package de.itagile.golf;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class Konsole {

	private static final String ENCODING = "UTF-8";
	public PrintWriter writer;
	public BufferedReader reader;
	
	public Konsole() throws UnsupportedEncodingException {
		writer = new PrintWriter(new OutputStreamWriter(System.out, ENCODING));
		reader = new BufferedReader(new InputStreamReader(System.in, ENCODING));
	}
	
	public void gibAus(String ausgabe) {
		writer.println(ausgabe);
		writer.flush();
	}

	public String liesZeileEin() throws IOException {
		return reader.readLine();
	}
}
