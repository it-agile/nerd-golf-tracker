Feature: Help

  Scenario Outline: Help entry
        When ich die Hilfe aufrufe
        Then listet der NerdGolfTracker einen Eintrag zu "<Command>" auf

        Examples:
            |Command|
            |Hit ball|
            |Next hole|
            |Help|
