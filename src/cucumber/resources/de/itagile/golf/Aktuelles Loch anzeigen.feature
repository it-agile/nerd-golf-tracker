# language: en
Feature: Aktuelles Loch anzeigen

    Scenario: direkt nach dem Start
        When ich den NerdGolfTracker starte
        Then bin ich auf dem 1. Loch

    Scenario: auf dem 2. Loch
        When ich zum nächsten Loch gehe
        Then bin ich auf dem 2. Loch
