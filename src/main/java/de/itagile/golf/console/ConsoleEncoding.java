package de.itagile.golf.console;

public class ConsoleEncoding {

	public static String forSystemEncoding(String systemEncoding) {
		if ("Cp1252".equals(systemEncoding)) {
			return "Cp850";
		}
		return "UTF-8";
	}

}
