package de.itagile.golf;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

import de.itagile.golf.operation.Lochwechsel;
import de.itagile.golf.operation.Schlag;

public class EinfacherIntepreterTest {

	private EingabeInterpreter interpreter = new EinfacherInterpreter();

	@Test
	public void interpretiertBallschlag() throws Exception {
		assertThat(interpreter.interpretiere("Schlage Ball"), is(Schlag.class));
	}
	
	@Test
	public void interpretiertLochwechsel() throws Exception {
		assertThat(interpreter.interpretiere("Nächstes Loch"), is(Lochwechsel.class));
	}
}
