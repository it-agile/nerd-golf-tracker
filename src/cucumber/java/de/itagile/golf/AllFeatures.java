package de.itagile.golf;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
		strict = true, 
		tags = {"not @in_arbeit"},
		monochrome = true,
		features = "src/cucumber/resources"
)
public class AllFeatures {
}
