#datenbanken/vorlesung 
# 2.7.2024
[[Datenbanken Vorlesung 13.pdf]]
### Index-Sequentielle Organisation

Index
- Datensätze werden in Blöcken fester Größe abgelegt (z.B. 8kb)
	- Falls einer nicht ausreicht, werden mehrere Blöcke benötigt und in Linked List verkettet
	- Es muss evt erst Block gesucht und dann im Block der Datensatz gesucht werden
- Daten werden bei Sequentieller Organisation nach Primärschlüssel Aufsteigend gespeichert
- Mit Index wird erst im Index und dann in den Datenblöcken gesucht
- Index benötigt selbst Speicherblöcke 

Daten vom Index bestehen aus `(s,b)`
- Primärschlüssel
- Blockaddresse

Indexe sind normalerweise nicht dicht, also enthalten nicht alle vorhandenen Primärschlüssel-Werte
- Es wird der Größte/Kleinste Schlüsselwert `s` im Block `b` gespeichert

Indexe können mehrere Stufen haben (kaskadiert)
- Index für den Index

Probleme beim Einfügen von Datensätzen
- Bei Vollständig gefüllten blöcken, müssen zum Einfügen andere Daten nach hinten geschoben werden 
	- Blöcke werden daher nur zum teil gefüllt (z.B. 60%)
	- Überlaufblöcke entweder als Linked List oder in Überlaufbereich
![[Datenbanken Überlauf.png|450]]
### Gestreute Organisation

Hash-Verfahren
- Hashfunktion Primärschlüsselwert->Speicheraddresse
	- z.B. `Schlüsselwert Modulo Speicherplatzanzahl`
- Daten werden bei errechneter Speicheraddresse (z.B. Blocknummer) abgelegt
- Datensätze werden so im verfügbaren Speicher verstreut
- Es sollten (deutlich) mehr Schlüsselwerte $S$ als Speicheraddressen $N$ verfügbar sein
	- Es werden dann absichtlich mehrere Datensätze der gleichen Addresse zugewiesen
	- Kollision möglich falls Speicheraddresse/Block bereits Voll ist

Kollisionsauflösung (möglichkeiten):
- Überlaufbereich wie bei Sequentieller Organisation
- Nächsten freien Speicherplatz (nächster Block) nach eigendlichem Ziel nutzen
	- Oder auch random Offset basierend auf Schlüssel
- Zweite Hashfunktion welche anderes Ergebnis liefert
#### Sortiert-Logisch-Sequentielle Organisation
Praktisch komplette Linked List aus Datensätzen
Schlecht
### Baumverfahren
Baumorganisation

B-Baum / B+-Baum (Balancierter Baum)
- Knoten von B-Baum sind Speicherblöcke fester Länge
- Jeder Block kann eine gerade Zahl an Baumdatensätzen gleicher Länge aufnehmen
- Jeder B-Baum Datensatz besteht aus
	- Zeiger auf weiteren Knoten
		- Schlüssel im weiteren Knoten sind kleiner als Aktueller Schlüssel, größer als links benachtbarter Schlüssel
	- Schlüssel
	- Nichtschlüsselbereich (z.B. Zeiger auf Speicherblock)
- Am Ende vom Knoten befindet sich ein weiterer Pointer zu einem weiteren Knoten, wobei alle seine Schlüssel größer sind als der Schlüssel links neben dem Pointer

Unterschied zum Sequentiellen Index
- Keine unterscheidung zwischen Index- und Datenblöcken
- B-Baum ist Balanciert
	- Tiefster und am wenigsten Tiefer Ast haben Tiefenunterschied von max. 1

Parameter
- Datensätze pro Block
- Anzahl Datensätze
- Tiefe = log_datensätze-pro-block(anzahl datensätze)
	- Jeder Datensatz wird mit höchstens {ceil(Tiefe)} Datenzugriffen gefunden
- Datensatz
	- Pointergröße
	- Schlüssel- & Datengröße

Für Einfügen in B-Baum:
- Splitten bevor Höhe Erhöht wird
![[Datenbanken B-Baum Einfügen.png]]

B+-Bäume enthalten Datensatzinformationen nur in den Blättern


todo 23/29