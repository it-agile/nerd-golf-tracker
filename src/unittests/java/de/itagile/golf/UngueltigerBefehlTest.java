package de.itagile.golf;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.isA;
import static org.junit.Assert.*;

import org.junit.Test;

import de.itagile.golf.operation.Hilfe;

public class UngueltigerBefehlTest {

	private Interpreter interpreter = new EinfacherInterpreter();
	
	@Test
	public void interpretiertUngueltigeBefehle() {
		assertThat(interpreter.interpretiere("XYZ"), isA(Hilfe.class));
	}

}
