# language: en
Feature: help

  Scenario Outline: help entry
        When ich die Hilfe aufrufe
        Then listet der NerdGolfTracker einen Eintrag zu "<Kommando>" auf

        Examples:
            |Kommando|
            |Schlage Ball|
            |Nächstes Loch|
            |Hilfe|
