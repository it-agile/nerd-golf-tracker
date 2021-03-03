# language: en
Feature: help

  Scenario Outline: help entry
        When I open the help
        Then NerdGolfTracker displays an entry about "<command>"

        Examples:
            |command|
            |Schlage Ball|
            |next hole|
            |help|
