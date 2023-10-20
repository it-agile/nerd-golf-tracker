package de.itagile.golf;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.instanceOf;
import static org.junit.jupiter.params.provider.Arguments.arguments;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import de.itagile.golf.operation.Hilfe;
import de.itagile.golf.operation.Lochwechsel;
import de.itagile.golf.operation.Schlag;

class EinfacherIntepreterTest {

	private Interpreter interpreter = new EinfacherInterpreter();
	
	private static Stream<Arguments> schlagParameter() {
	    return Stream.of(
	      arguments("Schlage Ball", Schlag.class),
	      arguments("Nächstes Loch", Lochwechsel.class),
	      arguments("Hilfe", Hilfe.class)
	    );
	}
	
	@ParameterizedTest
	@MethodSource("schlagParameter")
	void interpretiertBefehle(String befehl, Class<Operation> operation) {
		assertThat(interpreter.interpretiere(befehl), instanceOf(operation));
	}

}
