package de.itagile.golf;

import static org.mockito.Matchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Test;

public class TrackerTest {

	private EingabeInterpreter interpreter = mock(EingabeInterpreter.class);		
	private Tracker tracker = new Tracker(interpreter);

	@Test
	public void uebersetztEingabeInOperationUndFuehrtSieAus() throws Exception {
		Operation operation = mock(Operation.class);
		when(interpreter.interpretiere("foo")).thenReturn(operation);
		tracker.reagiereAuf("foo");
		verify(operation).fuehreAus(any(Scorecard.class));
	}
}