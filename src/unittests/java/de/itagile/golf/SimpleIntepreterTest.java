package de.itagile.golf;

import static org.hamcrest.Matchers.isA;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import de.itagile.golf.operation.Help;
import de.itagile.golf.operation.NextHole;
import de.itagile.golf.operation.Stroke;

@RunWith(Parameterized.class)
public class SimpleIntepreterTest {

	private Interpreter interpreter = new SimpleInterpreter();
	private final String command;
	private final Class<? super Operation> operation;

	public SimpleIntepreterTest(String command, Class<? super Operation> operation) {
		this.command = command;
		this.operation = operation;
	}
	
	@Parameters
	public static List<Object[]> parameters() {
		Object[][] testData = new Object[][] {
				{"Schlage Ball", Stroke.class},
				{"next hole", NextHole.class},
				{"help", Help.class},
				};
		return Arrays.asList(testData);
	}
	
	@Test
	public void interpretsCommands() throws Exception {
		assertThat(interpreter.interpret(command), isA(operation));
	}
}
