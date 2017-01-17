package de.itagile.golf.operation;

import java.util.ArrayList;
import java.util.List;

import de.itagile.golf.Befehl;
import de.itagile.golf.BefehleSammler;
import de.itagile.golf.Operation;
import de.itagile.golf.Scorecard;
import de.itagile.golf.util.CollectionUtils;
import de.itagile.golf.util.SystemProperties;

public class Hilfe implements Operation {

	private final BefehleSammler sammler;

	public Hilfe(BefehleSammler sammler) {
		this.sammler = sammler;
	}

	@Override
	public String fuehreAus(Scorecard scorecard) {
		List<String> hilfeTexte = new ArrayList<>();
		for (Befehl befehl : sammler.sammle()) {
			hilfeTexte.add(hilfeZeileFuer(befehl));
		}
		return "Ich reagiere auf: " + CollectionUtils.join(hilfeTexte, SystemProperties.LINE_SEPARATOR);
	}

	private String hilfeZeileFuer(Befehl befehl) {
		return String.format(" * %s (...%s)", befehl.kommando(), befehl.beschreibung());
	}
}
