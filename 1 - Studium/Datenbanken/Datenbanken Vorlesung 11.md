#datenbanken/vorlesung 
# 18.6.2024
[[Datenbanken Vorlesung 11.pdf]]
## Datenbanksysteme
AKA DBS

### CODD'sche Regeln
Die 12 CODD'Schen Regeln
Definieren eine Relationale Datenbank streng
Anforderungen für Relationale DBMS

- Regel 0: Relationales DBMS muss fähig sein, Datenbanken vollständig und eigenständig durch seine Relationalen Fähigkeiten zu verwalten
	- Tabellen über Tabellen
	- Tabellen über andere Datenbank-Komponenten
- Regel 1: Sämtliche Info in Relationalen Datenbanken muss logisch in Tabellen Dargestellt sein
	- Daten
	- Definitionen von Tabellen und Attributen
	- Integritätsbeziehungen und Aktion
	- Sicherheitsinformation (z.B. Zugriffsberechtigungen)
- Regel 2: Jeder Wert muss findbar sein durch:
	- Tabellenname
	- Primärschlüssel
	- Attributname / Spaltenname
- Regel 3: NULL = Fehlende Daten
	- NULL wird gleich behandelt egal was der type von der Spalte ist
- Regel 4: Datenbankstruktur wird in Tabellen gespeichert
- Regel 5: Muss befehlsgesteuerte Abfragesprache haben welche mindestens unterstützt:
	- Daten Definieren
	- Views Definieren
	- Integritätsbedingungen Definireen (Constraints)
	- Transaktionen Definieren
	- Berechtigungen Definieren
	- z.B. SQL
- Regel 6: In Views kann man schreiben falls die Struktur des Views dies nicht Unmöglich macht
	- z.B. ein View mit Zeile C welche aus Zeilen A,B mit `A*B` berechnet wird, kann man nicht updaten
- Regel 7: Get und Update-Operationen müssen Tabellen als Ziel Erlauben
	- Nicht nur einzelne Datensätze
	- Mengenorientierung der Sprache
- Regel 8: Physikalische Unabhängigkeit
	- Für Benutzer ist beim Datenzugriff irrelevant, wie die Daten physisch gespeichert sind
	- Logische Struktur relevant, Physische Struktur nicht 
- Regel 9: Logische Unabhängigkeit der Daten
	- Änderungen an der Datenbankstruktur sollten keine Auswirkung auf bestehende Anwendungen und Abfragen haben (falls alle Info erhalten bleibt)
		- Also sollte backwards compatability für alte queries bestehen, zb via Views
- Regel 10: Integritätsregeln
	- Alle Integritätsbedingungen müssen in Query Language definierbar und in Tabellen dargestellt werden
	- Mindestens Existente Bedingungen:
		- Vollständigkeit (NOT NULL)
		- Beziehungsintegrität (Fremdschlüssel / EQU)
- Regel 11: Verteilung der Daten
	- Bei Übergang von Zentraler zu Verteilter Datenbank ändert sich für Anwendungen logisch nichts
- Regel 12: Unterlaufen der Abfragesprache
	- Falls zusätzlich eine Low-Level-Abfragesprache existiert, muss diese ebenfalls die Integritätsbedingungen respektieren
	- Beschreibt Spezialfall


Voralem 6, 10, 11 sind heute von Bedeutung
- Aktualisieren von Views
- Integritätsregeln
- Verteilung von Daten

### Datenbankmanagementsystem
*AKA DBMS*

Verwaltet Datenbank und Kapselt sie von Anwendungen ab.

Grundlage ist 3-Schema-Architektur
- Externe Ebene (Views)
- Konzeptuelle Ebene (Echte Tabellen)
- Interne Ebene (Tatsächliche Speicherung der Daten, Zugriffspfade/Indices)

DBMS-Ablauf bei Abfrage: Aus View Lesen
- Externe Ebene parsen, definition des Views interpretieren
- Mit Transformationsregeln (Extern -> Konzeptuell) die benötigten Tabellen der Konzeptuellen Ebene feststellen
- Mit Transformationsregeln (Konzeptuell -> Intern) finden, welche physischen Objekte zu lesen sind, und welche Zugriffspfade (z.B. Index) verwendet werden sollen
- DBMS gibt Betriebssystem die Nummern der zu lesenden Speicherblöcke
	- Betriebssystem gibt gelesene Daten an DBMS
- DBMS stellt mit Transformationsregeln das verlangte Externe Objekt zusammen
	- Übergibt es dem Anwendungsprogramm
	- Anwendungsprogramm verarbeitet es

Binden
- Befehle/Objekte welche sich auf Externe Ebene (Views) beziehen, mit denen für Konzeptuelle Ebene ersetzen
- Varianten
	- Statische Datenunabhängigkeit
		- Bei Compile Time der Anwendung (Compiler & Linker)
		- Programm muss bei änderung von Views neu compiled werden
	- Dynamische Datenunabhängigkeit
		- Bei Zugriff zur Datenbank (Interpreter)

Physische Datenunabhängigkeit = Tabellen/Anwendungen isoliert von Physischen Speicher
Logische Datenunabhängigkeit = Views/Anwendungen isoliert von Tabellen

Weitere Aufgaben von DBMS
- Datenintegrität gewährleisten
	- Type Checking
	- Datenverlust bei Systemausfall verhindern
	- Gleichzeitiger Zugriff auf gleichen Datensatz koordinieren
- Datenschutz
	- User Passwords
	- User Permissions
### Data Communication System
*AKA DC-System*

Kommunikation zwischen DBMS und Client (Remote und Lokal)
- Nachrichten Empfangen und Weiterleiten
- Transactions verwalten
Effiziente Steuerung vieler Terminals mit viel Datendurchsatz
- Priorisieren
### Data Dictionary
*AKA DD-System*

Meta-Tabelle / Inhaltsverzeichnis
- Tabellen, Beziehungen, Zugriffsrechte
- Konsistenzbedingungen
- ...


