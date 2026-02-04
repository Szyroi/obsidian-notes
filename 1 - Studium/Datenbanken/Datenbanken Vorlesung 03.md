#datenbanken/vorlesung 
# 23.04.2024
[[Datenbanken Vorlesung 03.pdf]]
## 03
Schema der Miniwelt / Diskursbereich
- Eigenschaften der Entitäten sollten nichts enthalten was in eine Andere entität könnte
- Kardinalitäten?
### Datentypen
Zeichenketten: `char(n)` / `varchar(n)`
Datum- und Zeitwerte: `date`
Zahlen: `numeric(n,d)`
Wahrheitswerte: `boolean`
Komplexe Werte: `compound`
### Schlüsselattribute
Wann sind entitäten Gleich?
Haben zwei Entitäten nur identische Daten, oder sind sie wirklich identisch?
-> Schlüsselattribute (Keys)
Identifizieren eine Entität eindeutig

Schlüssel können aus mehreren Attributen bestehen (Zusammengesetzte Schlüssel)

Primärschlüssel soll kompakt und Effizient sein

Schlüssel sind im ER-Diagramm nicht notwendig
### Relationships
**AKA Beziehungen**
Entitäten = Quadrat
Beziehung = Karo

Binäre Beziehungen = Zwei Entitäten
n-äre Beziehungen = Mehr als 2 Entitäten
![[Datenbanken Triäre Beziehung.png]]
### Kardinalitäten
Min-Max Notation nach Abrial
0..1 Bedingt
1..1 Einfach
0..n Bedingt Mehrfach
1..n Mehrfach

Bei Abrial: Kardinalität gibt die Verbindungszahl an der seite an, an der sie Geschrieben ist.
z.B.
Gebäude <-(1,N)-- hat --(1,1)-> Raum
Heißt:
- Von jedem Gebäude gehen 1 bis N verbindungen aus
	- Jedes Gebäude hat 1 bis N Räume
- Von jedem Raum geht 1 Verbindung aus
	- Jeder Raum hat 1 Gebäude