package de.itagile.golf;

import java.util.ArrayList;
import java.util.List;

import de.itagile.golf.befehl.*;

public class BefehleSammler {

	public List<Befehl> sammle() {
		List<Befehl> ernte = new ArrayList<>();
		ernte.add(new SchlagBefehl());
		ernte.add(new LochwechselBefehl());
		ernte.add(new ScorecardAusgabeBefehl());
		ernte.add(new HilfeBefehl());
		ernte.add(new BeendeBefehl());
		return ernte;
	}
}
