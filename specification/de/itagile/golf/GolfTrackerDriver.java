package de.itagile.golf;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class GolfTrackerDriver {

	private Process process;

	public GolfTrackerDriver() {
		try {
			process = Runtime.getRuntime().exec("java -jar build/libs/nerd-golf-tracker.jar");
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

	public void schlageBall() {
		PrintWriter writer = new PrintWriter(new OutputStreamWriter(process.getOutputStream()));
		writer.println("Schlage Ball");
		writer.flush();
    }

    public void gibtAntwort(String erwarteteAntwort) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
		String antwort = reader.readLine();
        assertThat(antwort, is(erwarteteAntwort));
    }
}