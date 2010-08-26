package de.itagile.golf;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

import org.hamcrest.Matcher;

public class TrackerDriver {

	private Process process;
	private BufferedReader reader;
	private PrintWriter writer;
	
	public TrackerDriver() {
		process = startNerdGolfTracker();
		reader = readerFor(process);
		writer = writerFor(process);
		shutDownWhenSystemExits(process);
	}

	private PrintWriter writerFor(Process process) {
		return new PrintWriter(new OutputStreamWriter(process.getOutputStream()));
	}

	private BufferedReader readerFor(Process process) {
		return new BufferedReader(new InputStreamReader(process.getInputStream()));
	}

	private Process startNerdGolfTracker() {
		try {
			return Runtime.getRuntime().exec(
					"java -jar build/libs/nerd-golf-tracker.jar");
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

	private void shutDownWhenSystemExits(final Process process) {
		Runtime.getRuntime().addShutdownHook(new Thread(){
			@Override
			public void run() {
				process.destroy();
				super.run();
			}
		});
	}

	public void schlageBall() {
		empfangeAnweisung("Schlage Ball");
    }

	private void empfangeAnweisung(String anweisung) {
		writer.println(anweisung);
		writer.flush();
	}

	public void zaehltSchlaege(int anzahl, String einheit) {
        assertThatAntwort(is(String.format("Du hast %d %s.", anzahl, einheit)));
	}

	private void assertThatAntwort(Matcher<String> matcher) {
		try {
			assertThat(reader.readLine(), matcher);
		} catch (IOException exception) {
			throw new RuntimeException(exception);
		}
	}

	public void geheZumNaechstenLoch() {
		empfangeAnweisung("Nächstes Loch");
	}

	public void setztSchlagzahlZurueck() {
		assertThatAntwort(is("Deine Schlagzahl wurde zurückgesetzt."));
	}
}