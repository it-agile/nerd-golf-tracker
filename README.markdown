Quotes Language: German


# Code-Formatierung

Einrücktiefe

* Java-Code: 1 Tab
* `build.gradle`: 4 Leerzeichen


# Requirements

* Java 7
* Gradle 2.0

Known to work

* Java 8
* Gradle 2.10


# Fallstricke

Die ausführbare Spezifikation verlässt sich darauf, dass der NerdGolfTracker seine Ausgabe auf einmal tätigt, technisch gesprochen: dass der Output-Stream nur einmal geflusht wird. Würde mehrmals geflusht werden, wäre das Lesen der Ausgabe im `TrackerDriver` unzuverlässig.


# Absichtliche Fehler

* Bei der Ausgabe der aktuellen Schläge wird "Schlag" nur im Singular ausgegeben.
* Beim Lochwechsel wird die Zahl der Schläge nicht zurückgesetzt.
* Bei der Ausgabe des aktuellen Lochs fehlt ein Leerzeichen zwischen Zahl and "Loch".
* Bei der Hilfe-Ausgabe ist die Einleitung nicht durch einen Zeilenumbruch abgetrennt.


# Definition of done

Der Build sollte auf Kombinationen folgender Parameter funktionieren:

* OS X/Windows/Ubuntu
* Java 7/8

Eine praktikable einfachere Lösung scheint:

* OS X Java 7, OS X Java 8, Windows Java 7


## Checklisten

* Gradle: <default>, eclipse, idea, uploadArchives
