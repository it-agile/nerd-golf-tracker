package de.itagile.golf.console;

public class ConsoleEncoding {

	public static String fuerSystemEncoding(String systemEncoding) {
		if ("Cp1252".equals(systemEncoding)) {
			return "Cp850";
		}
		return "UTF-8";
	}

}
