package de.itagile.golf;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Matchers.any;
import static org.mockito.Matchers.eq;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Test;

public class TrackerTest {

	private EingabeInterpreter interpreter = mock(EingabeInterpreter.class);		
	private Tracker tracker = new Tracker(interpreter);

	@Test
	public void delegiertAusfuehrungAnInterpreter() throws Exception {
		when(interpreter.verarbeiteEingabe(eq("foo"), any(Scorecard.class))).thenReturn("bar");
		assertThat(tracker.reagiereAuf("foo"), is("bar"));
	}
}