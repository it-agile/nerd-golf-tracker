package de.itagile.golf.konsole;

public class KonsoleEncoding {

	public static String fuerSystemEncoding(String systemEncoding) {
		if ("Cp1252".equals(systemEncoding)) {
			return "Cp850";
		}
		return "UTF-8";
	}

}
