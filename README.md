# Autoverwaltungssoftware

Dieses Projekt ist eine objektorientierte Java-Anwendung zur Verwaltung von Fahrzeugen in einem Autohaus. Die Software wurde als Lernprojekt entwickelt, orientiert sich jedoch an realitätsnahen Anforderungen und bietet eine saubere Klassenstruktur sowie erweiterbare Funktionalität.

## Funktionen

- Fahrzeuge erfassen, anzeigen und bearbeiten
- Kilometerstand aktualisieren (Simulation von Fahrten)
- Fahrzeuge als verkauft oder im Service markieren
- Fahrzeugstatus verwalten über ein definiertes `enum`
- Ausgabe einer kompakten Fahrzeugbeschreibung
- Validierung von Eingaben (z. B. ID, Preis, Kilometerstand)

## Projektstruktur

```plaintext
src/
├─ model/         // Enthält die Datenklassen (z. B. Fahrzeug, FahrzeugStatus)
├─ service/       // (Geplant) Verwaltungsklassen und Business-Logik
├─ ui/            // (Geplant) Benutzerinteraktion (z. B. Konsolenmenü)
└─ Main.java      // Einstiegspunkt der Anwendung
