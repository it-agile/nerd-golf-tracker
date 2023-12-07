package de.itagile.golf;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;

class TrackerTest {

	private Interpreter interpreter = mock(Interpreter.class);		
	private Operation startOperation = mock(Operation.class);
	private Tracker tracker = new Tracker(interpreter, startOperation);

	@Test
	void returnsResultOfOperation() {
		Operation operation = mock(Operation.class);
		when(interpreter.interpret("foo")).thenReturn(operation);
		when(operation.execute(any(Scorecard.class))).thenReturn("bar");
		assertThat(tracker.respondTo("foo"), is("bar"));
	}
	
	@Test
	void resturnsResultOfStartOperation() {
		when(startOperation.execute(any(Scorecard.class))).thenReturn("foo");
		assertThat(tracker.start(), is("foo"));
	}

}