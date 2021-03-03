# language: en
Feature: count strokes per hole

    Scenario Outline: count strokes on one hole
        When I strike the ball <x> times
        Then the NerdGolfTracker also counts so many strokes

        Examples:
            |x|
            |1|
            |2|
    @wip
    Scenario: go to next hole
        When I played on a hole
        Then the score for the next hole is reset to 0

