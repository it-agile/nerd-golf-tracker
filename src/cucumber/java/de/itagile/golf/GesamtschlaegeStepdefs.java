package de.itagile.golf;

import static java.lang.String.valueOf;
import static org.hamcrest.Matchers.containsString;

import java.util.List;
import java.util.Map;

import cucumber.api.DataTable;
import cucumber.api.java.de.Dann;
import cucumber.api.java.de.Wenn;

public class GesamtschlaegeStepdefs {

	private TrackerDriver tracker;

	public GesamtschlaegeStepdefs(TrackerDriver tracker) {
		this.tracker = tracker;
	}
	
//	@Wenn("ich folgendermaßen spiele")
	public void spiele1(DataTable spielstand) throws Throwable {
		List<Map<String, String>> rows = spielstand.asMaps();
		for (Map<String, String> row: rows) {
			spieleLoch(Integer.valueOf(row.get("Schläge")));
		}
	}

//	@Wenn("ich folgendermaßen spiele")
	public void spiele2(List<Map<String, String>> loecher) throws Throwable {
		for (Map<String, String> loch: loecher) {
			spieleLoch(Integer.valueOf(loch.get("Schläge")));
		}
	}
	
//	@Wenn("ich folgendermaßen spiele")
	public void spiele3(List<Map<String, Integer>> loecher) throws Throwable {
		for (Map<String, Integer> loch: loecher) {
			spieleLoch(loch.get("Schläge"));
		}
	}
	
	@Wenn("ich folgendermaßen spiele")
	public void spiele4(List<Lochergebnis> loecher) throws Throwable {
		for (Lochergebnis loch: loecher) {
			spieleLoch(loch.schläge);
		}
	}
	
	@Dann("habe ich insgesamt (\\d+) Schläge")
	public void pruefeSchlaege(int erwarteteGesamtschlaege) throws Throwable {
		tracker.gibEin("Gesamtschläge");
		tracker.assertThatAntwort(containsString(valueOf(erwarteteGesamtschlaege)));
	}
	
	private void spieleLoch(int schlaege) {
		while (schlaege-- > 0)
			tracker.gibEin("Schlage Ball");
		tracker.gibEin("Nächstes Loch");
	}
	
	public static class Lochergebnis {
		public int loch;
		public int schläge;
	}
}
