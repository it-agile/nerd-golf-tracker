package foo;

import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@Cucumber.Options(
		strict = true, 
		format = {"pretty"}, 
		monochrome = true
)
public class RunCukesTest {
}