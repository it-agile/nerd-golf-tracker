package de.itagile.golf.jbehave;

import java.util.Locale;

import org.jbehave.scenario.MostUsefulConfiguration;
import org.jbehave.scenario.definition.KeyWords;
import org.jbehave.scenario.i18n.I18nKeyWords;
import org.jbehave.scenario.i18n.StringEncoder;

public class ScenarioConfiguration extends MostUsefulConfiguration {

	public static final I18nKeyWords KEYWORDS = new I18nKeyWords(Locale.GERMAN, new StringEncoder(), "de/itagile/golf/jbehave/keywords");

	@Override
	public KeyWords keywords() {
		return KEYWORDS;
	}
}