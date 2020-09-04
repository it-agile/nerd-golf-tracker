package de.itagile.golf.operation;

import static de.itagile.golf.util.SystemProperties.LINE_SEPARATOR;
import static java.util.Arrays.asList;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Test;

import de.itagile.golf.Befehl;
import de.itagile.golf.BefehleSammler;

public class HilfeTest {

	@Test
	public void zeigtIntroAn() throws Exception {
		assertThat(hilfetext(), containsString("Ich reagiere auf:"));
	}

	@Test
	public void zeigtBeschreibungZumKommando() throws Exception {
		assertThat(hilfetext(dummyBefehl("Kommando", "Beschreibung")), 
				containsString("Kommando (...Beschreibung)"));
	}

	@Test
	public void gibtProKommandoEineZeileAus() throws Exception {
		String hilfetextFuerZweiBefehle = hilfetext(mock(Befehl.class), mock(Befehl.class));
		assertThat(anzahlZeilen(hilfetextFuerZweiBefehle), is(2));
	}

	private int anzahlZeilen(String string) {
		String[] zeilen = string.split(LINE_SEPARATOR);
		return zeilen.length;
	}

	private String hilfetext(Befehl... befehle) {
		BefehleSammler sammler = mock(BefehleSammler.class);
		
		Hilfe hilfe = new Hilfe(sammler);
		when(sammler.sammle()).thenReturn(asList(befehle));
		return hilfe.fuehreAus(null);
	}

	private Befehl dummyBefehl(String kommando, String beschreibung) {
		Befehl befehl = mock(Befehl.class);
		when(befehl.kommando()).thenReturn(kommando);
		when(befehl.beschreibung()).thenReturn(beschreibung);
		return befehl;
	}
}
