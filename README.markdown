Quotes Language: german


# Code-Formatierung

Einrücktiefe

* Java-Code: 1 Tab
* `build.gradle`: 4 Leerzeichen


# Inkompatibilitäten

Gradle 1.0-m7 scheint mit Java 7 nicht funktionieren.

Gradle spätestens ab 1.0-m9 funktioniert mit unserem JBehave-Setup nicht: Steps mit Umlauten matchen nicht. JBehave 2.5 liest die Text-Dateien mit dem Encoding, das in der System-Property "file.encoding" hinterlegt ist. Gradle startet den Test-Task aber nicht mehr mit dem richtigen Encoding. Das hier wird schlichtweg ignoriert:

    test {
        systemProperty 'file.encoding', 'UTF-8'
    }

Vermutlich steht dies im Zusammenhang mit <http://issues.gradle.org/browse/GRADLE-1618>.



# Fallstricke

Die ausführbare Spezifikation verlässt sich darauf, dass der NerdGolfTracker seine Ausgabe auf einmal tätigt, technisch gesprochen: dass der Output-Stream nur einmal geflusht wird. Würde mehrmals geflusht werden, wäre das Lesen der Ausgabe im `TrackerDriver` unzuverlässig.


# Absichtliche Fehler

* Bei der Ausgabe der aktuellen Schläge wird "Schlag" nur im Singular ausgegeben.
* Beim Lochwechsel wird die Zahl der Schläge nicht zurückgesetzt.
* Bei der Ausgabe des aktuellen Lochs fehlt ein Leerzeichen zwischen Zahl and "Loch".
* Bei der Hilfe-Ausgabe ist die Einleitung nicht durch einen Zeilenumbruch abgetrennt.
