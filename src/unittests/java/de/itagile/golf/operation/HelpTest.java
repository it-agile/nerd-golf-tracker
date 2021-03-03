package de.itagile.golf.operation;

import static de.itagile.golf.util.SystemProperties.LINE_SEPARATOR;
import static java.util.Arrays.asList;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Test;

import de.itagile.golf.Command;
import de.itagile.golf.CommandCollector;

public class HelpTest {

	@Test
	public void displaysIntro() throws Exception {
		assertThat(helpText(), containsString("I respond to:"));
	}

	@Test
	public void displaysDescriptionOfCommand() throws Exception {
		assertThat(helpText(dummyCommand("command", "description")),
				containsString("command (...description)"));
	}

	@Test
	public void displaysOneLinePerCommand() throws Exception {
		String helpTextForTwoCommands = helpText(mock(Command.class), mock(Command.class));
		assertThat(numberOfLines(helpTextForTwoCommands), is(2));
	}

	private int numberOfLines(String string) {
		String[] lines = string.split(LINE_SEPARATOR);
		return lines.length;
	}

	private String helpText(Command... commands) {
		CommandCollector collector = mock(CommandCollector.class);
		
		Help help = new Help(collector);
		when(collector.collect()).thenReturn(asList(commands));
		return help.run(null);
	}

	private Command dummyCommand(String commandString, String description) {
		Command command = mock(Command.class);
		when(command.command()).thenReturn(commandString);
		when(command.description()).thenReturn(description);
		return command;
	}
}
