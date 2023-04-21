package de.itagile.golf;

import org.junit.platform.suite.api.ExcludeTags;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasspathResource("de/itagile/golf")
@ExcludeTags("in_arbeit")
@IncludeEngines("cucumber")
public class AllFeatures {
}
