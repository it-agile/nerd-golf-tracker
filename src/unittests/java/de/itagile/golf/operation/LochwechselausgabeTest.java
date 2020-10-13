package de.itagile.golf.operation;

import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Test;

import de.itagile.golf.Operation;
import de.itagile.golf.Scorecard;

public class LochwechselausgabeTest {
	
	private Scorecard scorecard = mock(Scorecard.class);
	private Operation folgeoperation = mock(Operation.class);
	private Lochwechselausgabe lochwechselausgabe = new Lochwechselausgabe(folgeoperation);	

	@Test
	public void gibtZuruecksetzenAus() throws Exception {
		assertThat(lochwechselausgabe.fuehreAus(scorecard), containsString("Deine Schlagzahl wurde zurückgesetzt"));
	}
	
	@Test
	public void gibtAusgabeDerFolgeoperationMitAus() throws Exception {
		when(folgeoperation.fuehreAus(any(Scorecard.class))).thenReturn("folgeoperationAusgabe");
		
		assertThat(lochwechselausgabe.fuehreAus(scorecard), containsString("folgeoperationAusgabe"));	
	}
}
