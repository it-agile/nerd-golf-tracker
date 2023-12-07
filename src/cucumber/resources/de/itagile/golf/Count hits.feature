Feature: Count hits per hole

    Scenario Outline: Count hits on one hole
        When ich den Ball <x>-mal schlage
        Then zählt der NerdGolfTracker auch so viele Schläge

        Examples:
            |x|
            |1|
            |2|

    @ignore
    Scenario: Count hits on next hole
        When ich auf einem Loch gespielt habe
        Then zählen die Schläge auf dem nächsten Loch wieder von 0 an

