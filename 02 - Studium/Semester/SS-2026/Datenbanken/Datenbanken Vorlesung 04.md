#datenbanken/vorlesung 
# 30.04.2024
[[Datenbanken Vorlesung 04_1.pdf]]
## 04
### Attribute
Eigenschaften von Entity-/Beziehungs-Typen

Wertebereich (Domäne):
Menge Zulässiger Werte einer Eigenschaft; z.B.:
- `int`, `numeric(3,2)`, `string`
- `{"true", "false"}`
- `date`

> [!info] Keys im ERD
> In der ERD-Modellierung sollten keine künstlichen Attribute (wie "Nr") modelliert werden

### Schlüssel
*AKA Key / Primary Key*
und Primärschlüssel

Schlüssel = Schlüsselkandidaten
Kleinste Menge an Attributen die jedes Entity eines Typs eindeutig Identifiziert
Evtl künstlicher Schlüssel (nicht in Semantischer Darstellung)

Schlüssel werden im Diagramm underlined

Qualifizierte Identitäten
Bei Zusammengesetzen Schlüsseln kann auch eine Relation als teil des Key genutzt werden
![[Datenbanken Relation als Key.png]]
### EERM
*AKA Extended Entity-Relationship-Modell*

#### Zusammengesetzes Attribut
- Menge
- Liste
- Teilattribute
	- Weitere Zusammengesetzte (Unter-)Attribute

#### Schwache Entitätstypen/Beziehungstypen
und Kompositionen

Schwache Entitäten
- Haben keine vollständige eigene Identität (Key)
- Ergibt sich teil der Identität über die verbundene Entität
- können Entitäten nicht ohne die übergeordnete Entität existieren
![[Datenbanken Schwache Entitäten.png]]
Schwache Beziehungstypen sind "**Kompositionen**" ("cmp")
- Schwache Entität: Teil (untergeordnet)
- Starke Entität: Ganzes (übergeordnet)
Teil-Ganzes-beziehungen

In Zeichnung: Von Schwacher zu Besitzender Entität geht ein Pfeil anstatt nur eine linie
#### Aggregation
*aka Eigentums-Beziehung, Gehört-zu-Beziehung*

Relationstyp aus gleich starken Entitäten
"Unidirektionales Eigentum"
- Es existiert eine Rangordnung zwischen den beteiligten Entitäten
Entitäten auf Beiden seiten können auch alleine existieren.
![[Datenbanken Aggregation.png]]
#### Assoziation

Allgemeinster Beziehungstyp
Jede beziehung ist (mindestens) eine Assoziation
#### Ist-Beziehungen
*AKA is-a, Generalisierung, Spezialisierung*

Bestehen aus
- Supertyp (generalisierter Typ)
- Subtypen (spezialisierter Typ)
	- Beschreibt nur ein Subset der Entitäten die der Supertyp beschreibt
Subtypen inheriten von dem Supertyp
Auch mehrfache Vererbung möglich (Supertyp hat selbst einen Supertyp)

Haben eigenes Symbol:
![[Datenbanken Ist-Beziehung.png]]

Klassifizierung:
- total/partiell
	- total (t, alle): Alle entitäten die in den Supertyp passen, passen in eine der Subtypen
	- partiell (p, einige): Nicht alle entitäten die in den Supertyp passen, passen in eine der Subtypen
- disjunkt/nicht-disjunkt
	- disjunkt (d): Entitäten können nur max. der Subtypen sein
	- nicht-disjunkt (n): Entitäten können mehrere der Subtypen sein
#### Versionierung

Aktuell Beziehung vs Entität:
- Entität
	- Schlüssellieferant
	- hat eigene Identität, kann ohne Beziehung existieren
- Beziehung
	- kein Schlüssellieferant
	- hat keine eigene Identität
	- Wird über die zugeordneten Entitäten beschrieben
Dadurch sind jedoch mehrere Beziehungen des gleichen Typs zwischen den gleichen Entitäten nicht möglich (sonst nicht Identifizierbar).

Lösung:
- Neue Entität mit der die Beziehung in Verbindung steht
- Jede beziehung ist uniquely identifizierbar weil sie durch die neue Entität ein unique set an Entitäten hat
![[Datenbanken Versionierte Beziehung.png]]
![[Datenbanken Versionierung 2.png]]

