package de.itagile.golf.operation;

import static java.util.Arrays.asList;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.greaterThanOrEqualTo;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.Test;

import de.itagile.golf.Befehl;
import de.itagile.golf.Sammler;

public class HilfeTest {

	@SuppressWarnings("unchecked")
	private Sammler<Befehl> sammler = mock(Sammler.class);
	private Hilfe hilfe = new Hilfe(sammler);

	@Test
	public void zeigtIntroAn() throws Exception {
		assertThat(new Hilfe(sammler).fuehreAus(null),
				containsString("Ich reagiere auf:"));
	}

	@Test
	public void zeigtBeschreibungZumKommando() throws Exception {
		Befehl befehl = mock(Befehl.class);
		when(befehl.kommando()).thenReturn("Kommando");
		when(befehl.beschreibung()).thenReturn("Beschreibung");
		when(sammler.sammle()).thenReturn(asList(befehl));
		assertThat(hilfe.fuehreAus(null),
				containsString("Kommando (...Beschreibung); "));
	}
	
	@Test
	public void gibtEinKommandoProZeileAus() throws Exception {
		List<Befehl> dummyBefehle = asList(mock(Befehl.class), mock(Befehl.class));
		when(sammler.sammle()).thenReturn(dummyBefehle);
		String hilfeText = hilfe.fuehreAus(null);
		String[] zeilen = hilfeText.split(System.getProperty("line.separator"));
		assertThat(zeilen.length, is(greaterThanOrEqualTo(2)));
	}
}
