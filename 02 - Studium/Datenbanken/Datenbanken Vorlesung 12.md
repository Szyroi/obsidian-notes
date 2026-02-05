#datenbanken/vorlesung 
# 25.6.2024
[[Datenbanken Vorlesung 12.pdf]]
[[Datenbanken Vorlesung 12 Extra.pdf]]
## Speicherstrukturen
### Physischer Entwurf der Datenbank
Interne Ebene
- Konzeptuelles Modell Entwerfen (Daten -> Interne Datensätze)
- Info Sammeln, welche Daten wie verwendet werden (Zugriffspfade)
- Physische Organisation Durchführen
	- Verteilung Daten auf Festplatte
	- Vom Datenbankadministrator durchgeführt
	- Im Internen Schema Beschrieben

Speichermedien
- Arbeitsspeicher
- Sekundärspeicher
- Systempuffer (?)
	- ?

Operationen
- Retrieval
	- aka read/get, selektion/auswahl
	- mit bedingung
- Update
	- aka write/put
	- insert
	- delete

Kriterien für Physischen Entwurf
- Sortierung mit einem Sortierkriterium
- Sortierung mit mehreren Sortierkriterien (gleichzeitig)
	- Sortieren nach (A,B) ist nicht das gleiche wie Sortieren nach (B,A)
		- Ein Index über (A,B) ist also Separat von einem Index über (B,A)

Zugriffspfade
- Physisch realisierte Selektionen/Beziehungen
- Erlauben Schnelleres Retrieval
- Müssen bei Update der Daten aktualisiert werden

Ablage der Daten durch DBMS
- Mit OS-Dateisystem
	- Einfacher
	- DBMS hat keinen Einfluss auf Blockbelegung, z.B. dass Zusammenhängende Info im gleichen physischen Block sind
	- Sinnvoll für "kleinere" Systeme
- Eigenverwaltung durch DBMS
	- DBMS übernimmt Anordnung der Datensätze auf logischen Speichereinheiten
	- Dateien sind nicht wie normale Ordner einsehbar
	- DBMS kann Speicherung von Daten optimieren
	- Sinnvoll für große Systeme
	- Beispiel:
		- Datei welche mehrere Blöcke belegt auf mehrere Platten verteilen um gleichzeitiges lesen mehrerer Blöcke zu ermöglichen

Entities und Verbindungen werden zu Internen Datensätzen übersetzt
#### Interne Datensätze

Entity-Attribute
- Zusammenfassen
	- Attribute von verschiedenen Entities welche oft zusammen abgefragt werden, werden zusammengefasst
	- Insbesondere Schwache Entities in 1:n beziehung
- Teilen
	- Wenig verwendete Attribute von viel verwendeten abtrennen


Variabel lange Datensätze
-  z.B. STRING-Attribute ohne zeichenbegrenzung
- Wiederholungsgruppe = Menge/Liste mit Elementen gleichen Typs

Variabel lange Datensätze als Sätze fester Länge
- Obergrenze für Strings z.B. `varchar(20)`
- Menge/Liste mit Obergrenze immer voll erzeugen und mit NULL füllen
- Menge/Liste als Linked List

Direkte Implementation Variabel langer Datensätze
- Option 1: Werteanzahl angeben
- Option 2: Inline pointer zu Start der Attribute
![[Datenbanken Variabel Lange Datensätze.png]]
#### Zugriffsverfahren für Primärschlüssel
Primärschlüssel vs Sekundärschlüssel
- Sekundärschlüssel kann Null sein

Zugriffspfade (Index) werden in der Regel für Primärschlüssel angelegt
Für Sekundärschlüssel können auch Zugriffspfade angelegt werden

Sequentielle Organisation
- Datensätze nach Primärschlüssel aufsteigend abgespeichert
- Finden ist leicht
- Einfügen ist Aufwendig (Daten müssen aus dem Weg geschoben werden)
	- Ans Ende einfügen ist leicht
