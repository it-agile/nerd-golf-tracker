package de.itagile.golf;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import de.itagile.golf.operation.Lochwechsel;
import de.itagile.golf.operation.Schlag;

@RunWith(Parameterized.class)
public class EinfacherIntepreterTest {

	private EingabeInterpreter interpreter = new EinfacherInterpreter();
	private final String befehl;
	private final Class<? super Operation> operation;

	public EinfacherIntepreterTest(String befehl, Class<? super Operation> operation) {
		this.befehl = befehl;
		this.operation = operation;
	}
	
	@Parameters
	public static List<Object[]> parameters() {
		Object[][] testData = new Object[][] {
				{"Schlage Ball", Schlag.class},
				{"Nächstes Loch", Lochwechsel.class},
				};
		return Arrays.asList(testData);
	}
	
	@Test
	public void interpretiertBefehle() throws Exception {
		assertThat(interpreter.interpretiere(befehl), is(operation));
	}
}
