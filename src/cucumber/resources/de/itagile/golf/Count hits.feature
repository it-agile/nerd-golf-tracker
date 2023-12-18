Feature: Count hits per hole

    Scenario Outline: Count hits on one hole
        When I hit the ball <x> times
        Then the NerdGolfTracker counts this many hits

        Examples:
            |x|
            |1|
            |2|

    @ignore
    Scenario: Count hits on next hole
        When I played one hole
        Then counting of hits start at 0 for the new hole

