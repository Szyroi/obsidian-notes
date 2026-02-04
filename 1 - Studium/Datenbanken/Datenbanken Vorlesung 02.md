#datenbanken/vorlesung 
# 16.04.2024
Teil 1
[[Datenbanken LE2 MiniBeispiel.pdf]]
[[Datenbanken LE2 Anwendungsfaelle.pdf]]
[[Datenbanken LE2 EDV-Anforderungen.pdf]]
Teil 2
[[Datenbanken LE2 Entwurfsprozess.pdf]]
## 02
### Teil 1
#### Warum überhaupt?
Beispiel an Bib-Discover

#### Anwendungsfälle
Spezifische Situationen/Aktionen die System/Anwendung ausführen kann
In DB-Anwendung:
- Zustandsanalyse
- Zustandsänderung

#### EDV-Anforderungen
Unstrukturierte (Texte, Bilder) vs Strukturierte Daten

Dienstfunktionen (CRUD):
- Speichern (Create, Update, Delete)
- Lesen
Ein Datenbanksystem (DBS) ist ein System mit diesen Dienstfunktionen
- Datenbank (DB)
	- Menge der gespeicherten Daten
- Datenbankmanagementsystem (DBMS)

Historie
### Teil 2
#### Prozess des Datenbankentwurfs
Physische Datenunabhängigkeit
Semantische Datensicht wird von Physischer Speicherung getrennt

Logische Datenunabhängigkeit
Anwendung stabil gegen Änderungen der semantischen Datensicht

Schema und Instanz trennen
- Schema
	- Beschreibt Daten(struktur)
	- Metadaten
- Instanz
	- Anwenderdaten

Phasen des Datenbankentwurfs
- Miniwelt (Diskursbereich)
	- Analyse des Problems, Abgrenzung, Abstraktion, Pflichten-/Lastenheft
- Semantischer Entwurf
	- Konzeptionelle/Semantisch ausdrucksstarke Beschreibung
	- Für Menschliche Interpretation
	- Unabhängig von der Wahl eines Datenbanksystems
- Logischer Entwurf
	- Technologische/Logische Beschreibung
	- Konkrete Datenbanknahe Beschreibungen
- Physischer Entwurf
	- Datenbankbeschreibung
	- Konkrete Technische Beschreibung in Sprache der Datenbank

