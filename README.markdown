
# Code-Formatierung

Einrücktiefe

* Java-Code: 1 Tab
* `build.gradle`: 4 Leerzeichen


# Fallstricke

Die ausführbare Spezifikation verlässt sich darauf, dass der NerdGolfTracker seine Ausgabe auf einmal tätigt, technisch gesprochen: dass der Output-Stream nur einmal geflusht wird. Würde mehrmals geflusht werden, wäre das Lesen der Ausgabe im `TrackerDriver` unzuverlässig.


# Absichtliche Fehler

Bei der Hilfe-Ausgabe ist die Einleitung nicht durch einen Zeilenumbruch abgetrennt.
