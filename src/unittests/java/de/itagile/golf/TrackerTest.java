package de.itagile.golf;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Test;

public class TrackerTest {

	private Interpreter interpreter = mock(Interpreter.class);		
	private Operation startOperation = mock(Operation.class);
	private Tracker tracker = new Tracker(interpreter, startOperation);

	@Test
	public void returnsResultOfOperationRun() throws Exception {
		Operation operation = mock(Operation.class);
		when(interpreter.interpret("foo")).thenReturn(operation);
		when(operation.run(any(ScoreCardCamelCaseProblem.class))).thenReturn("bar");
		assertThat(tracker.respondTo("foo"), is("bar"));
	}
	
	@Test
	public void returnsResultOfStartOperation() throws Exception {
		when(startOperation.run(any(ScoreCardCamelCaseProblem.class))).thenReturn("foo");
		assertThat(tracker.start(), is("foo"));
	}
}