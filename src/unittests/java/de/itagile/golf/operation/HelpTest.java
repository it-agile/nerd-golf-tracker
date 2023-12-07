package de.itagile.golf.operation;

import static de.itagile.golf.util.SystemProperties.LINE_SEPARATOR;
import static java.util.Arrays.asList;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;

import de.itagile.golf.Command;
import de.itagile.golf.CommandCollector;

class HelpTest {

	@Test
	void showsIntro() {
		assertThat(helpText(), containsString("I respond to:"));
	}

	@Test
	void showsDescriptionForCommand() {
		assertThat(helpText(dummyCommand("Command", "Description")), 
				containsString("Command (...Description)"));
	}

	@Test
	void oneHelpLinePerCommand() {
		String helpTextForTwoCommands = helpText(mock(Command.class), mock(Command.class));
		assertThat(lineCount(helpTextForTwoCommands), is(2));
	}

	private int lineCount(String string) {
		String[] lines = string.split(LINE_SEPARATOR);
		return lines.length;
	}

	private String helpText(Command... commands) {
		CommandCollector collector = mock(CommandCollector.class);
		
		Help help = new Help(collector);
		when(collector.collect()).thenReturn(asList(commands));
		return help.execute(null);
	}

	private Command dummyCommand(String commandInput, String description) {
		Command command = mock(Command.class);
		when(command.command()).thenReturn(commandInput);
		when(command.description()).thenReturn(description);
		return command;
	}

}
