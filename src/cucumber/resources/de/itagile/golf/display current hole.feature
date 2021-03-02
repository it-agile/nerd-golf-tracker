# language: en
Feature: display current hole

    Scenario: right after the start
        When ich den NerdGolfTracker starte
        Then bin ich auf dem 1. Loch

    Scenario: on the 2nd hole
        When ich zum nächsten Loch gehe
        Then bin ich auf dem 2. Loch
