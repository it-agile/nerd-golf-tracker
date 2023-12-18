package de.itagile.golf;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.instanceOf;
import static org.junit.jupiter.params.provider.Arguments.arguments;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import de.itagile.golf.operation.Help;
import de.itagile.golf.operation.HoleChange;
import de.itagile.golf.operation.Hit;

class SimpleIntepreterTest {

	private Interpreter interpreter = new SimpleInterpreter();
	
	private static Stream<Arguments> hitParameter() {
	    return Stream.of(
	      arguments("Hit ball", Hit.class),
	      arguments("Next hole", HoleChange.class),
	      arguments("Help", Help.class)
	    );
	}
	
	@ParameterizedTest
	@MethodSource("hitParameter")
	void interpretCommand(String command, Class<Operation> operation) {
		assertThat(interpreter.interpret(command), instanceOf(operation));
	}

}
