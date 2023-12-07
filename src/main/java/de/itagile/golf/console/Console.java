package de.itagile.golf.console;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

import de.itagile.golf.util.SystemProperties;

public class Console {

	public PrintWriter writer;
	public BufferedReader reader;
	
	public Console() throws UnsupportedEncodingException {
		String encoding = ConsoleEncoding.fuerSystemEncoding(SystemProperties.FILE_ENCODING);
		writer = new PrintWriter(new OutputStreamWriter(System.out, encoding));
		reader = new BufferedReader(new InputStreamReader(System.in, encoding));
	}
	
	public void exit() {
		writer.flush();
	}

	public Console println(String line) {
		writer.println(line);
		return this;
	}

	public String readln() throws IOException {
		return reader.readLine();
	}
}
