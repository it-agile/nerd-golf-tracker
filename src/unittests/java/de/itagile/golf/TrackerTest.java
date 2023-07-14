package de.itagile.golf;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;

class TrackerTest {

	private Interpreter interpreter = mock(Interpreter.class);		
	private Operation startoperation = mock(Operation.class);
	private Tracker tracker = new Tracker(interpreter, startoperation);

	@Test
	void gibtErgebnisDerAusgeloestenOperationZurueck() throws Exception {
		Operation operation = mock(Operation.class);
		when(interpreter.interpretiere("foo")).thenReturn(operation);
		when(operation.fuehreAus(any(Scorecard.class))).thenReturn("bar");
		assertThat(tracker.reagiereAuf("foo"), is("bar"));
	}
	
	@Test
	void gibtErgebnisDerStartoperationZurueck() throws Exception {
		when(startoperation.fuehreAus(any(Scorecard.class))).thenReturn("foo");
		assertThat(tracker.starte(), is("foo"));
	}

}