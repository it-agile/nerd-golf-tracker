Feature: Schläge pro Loch zählen

    Scenario Outline: Schläge auf einem Loch zählen
        When ich den Ball <x>-mal schlage
        Then zählt der NerdGolfTracker auch so viele Schläge

        Examples:
            |x|
            |1|
            |2|

    @in_arbeit
    Scenario: Lochwechsel
        When ich auf einem Loch gespielt habe
        Then zählen die Schläge auf dem nächsten Loch wieder von 0 an

