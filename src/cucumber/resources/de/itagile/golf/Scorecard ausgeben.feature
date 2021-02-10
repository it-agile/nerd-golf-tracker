# language: de
Funktionalität: Scorecard wird ausgegeben
    
    Szenario: direkt nach dem Start
        Wenn ich den NerdGolfTracker starte und Scorecard abfrage
        Dann ist die Scorecard 0

    Szenariogrundriss: Schläge an erstem Loch zählen
        Wenn ich den Ball <x>-mal schlage
        Dann ist die Scorecard <x>

        Beispiele:
            |x|
            |1|
            |2|
    
    Szenario: Schläge an erstem und zweitem Loch zählen
        Wenn ich den Ball 2-mal schlage
        Wenn ich zum nächsten Loch gehe
        Wenn ich den Ball 3-mal schlage
        Dann ist die Scorecard 5
    