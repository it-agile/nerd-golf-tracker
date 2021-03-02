# language: en
Feature: display current hole

    Scenario: right after the start
        When I start the NerdGolfTracker
        Then I am on the 1. hole

    Scenario: on the 2nd hole
        When I go to the next hole
        Then I am on the 2. hole
