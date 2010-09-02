package de.itagile.golf.operation;

import static org.hamcrest.Matchers.containsString;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Arrays;

import org.junit.Test;

import de.itagile.golf.Befehl;
import de.itagile.golf.BefehleSammler;

public class HilfeTest {

	private BefehleSammler sammler = mock(BefehleSammler.class);

	@Test
	public void zeigtIntroAn() throws Exception {
		assertThat(new Hilfe(sammler).fuehreAus(null),
				containsString("Ich reagiere auf:"));
	}

	@Test
	public void zeigtSchlageBallAn() throws Exception {
		Befehl befehl = mock(Befehl.class);
		when(befehl.kommando()).thenReturn("Kommando");
		when(befehl.beschreibung()).thenReturn("Beschreibung");
		when(sammler.befehle()).thenReturn(Arrays.asList(befehl));
		assertThat(new Hilfe(sammler).fuehreAus(null),
				containsString("Kommando (...Beschreibung); "));
	}
}
