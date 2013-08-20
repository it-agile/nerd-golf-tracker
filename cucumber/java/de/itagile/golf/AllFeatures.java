package de.itagile.golf;

import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@Cucumber.Options(
		strict = true, 
		format = {"pretty"},
		tags = {"~@in_arbeit"},
		monochrome = true
)
public class AllFeatures {
}