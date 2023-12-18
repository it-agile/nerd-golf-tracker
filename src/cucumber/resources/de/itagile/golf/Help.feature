Feature: Help

  Scenario Outline: Help entry
        When I call for help
        Then the NerdGolfTracker lists an entry for "<Command>"

        Examples:
            |Command|
            |Hit ball|
            |Next hole|
            |Help|
