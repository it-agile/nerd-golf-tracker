package de.itagile.golf.konsole;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

import de.itagile.golf.util.SystemProperties;

public class Konsole {

	public PrintWriter writer;
	public BufferedReader reader;
	
	public Konsole() throws UnsupportedEncodingException {
		String encoding = KonsoleEncoding.fuerSystemEncoding(SystemProperties.FILE_ENCODING);
		writer = new PrintWriter(new OutputStreamWriter(System.out, encoding));
		reader = new BufferedReader(new InputStreamReader(System.in, encoding));
	}
	
	public void gibAus(String ausgabe) {
		writer.println(ausgabe);
		writer.flush();
	}

	public String liesZeileEin() throws IOException {
		return reader.readLine();
	}
}
