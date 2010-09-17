package de.itagile.golf.operation;

import static org.hamcrest.Matchers.containsString;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Arrays;

import org.junit.Test;

import de.itagile.golf.Befehl;
import de.itagile.golf.Sammler;

public class HilfeTest {

	@SuppressWarnings("unchecked")
	private Sammler<Befehl> sammler = mock(Sammler.class);

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
		when(sammler.sammle()).thenReturn(Arrays.asList(befehl));
		assertThat(new Hilfe(sammler).fuehreAus(null),
				containsString("Kommando (...Beschreibung); "));
	}
}
