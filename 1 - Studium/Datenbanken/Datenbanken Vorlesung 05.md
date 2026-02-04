#datenbanken/vorlesung 
# 07.05.2024
[[Datenbanken Vorlesung 04_2.pdf]]
[[Datenbanken Vorlesung 04 Zusammenfassung Begriffe.pdf]]
## 04
### Historische Datenmodelle

Hierarchisches Modell
- Daten in Knoten in einer Hierachie (Baum)
- Nur 1:N beziehungen erlaubt
- N:M nicht direkt möglich

Netzwerkmodell
- Daten in Knoten in einem Netzwerk
- Zugriffe navigierend: Ersten Knoten angeben und von daaus zu nachtbarn Laufen
- Komplex, stark für sprache COBOL gemacht
### Relationales Modell

Semantisches (konzeptionelles) Schema:
- "Entity-Relationship" Datenmodell
![[Pasted image 20240511233134.png]]
### Semantisches vs Logisches Datenschema
- Semantisches (Konzeptionelles) Schema
	- "Entity-Relationship" Datenmodell
	- Beziehungen
- Logisches Datenschema ("Relationales Datenmodell")
	- Relationen-Datenmodell
	- Foreign Keys (Referenzen)
	- Besteht nur aus Relationen
	- Darstellbar in Tabellenform
![[Datenbanken Semantisches vs Logisches Schema.png]]

Eigenschaften einer Relation
- Attribut (Spalten einer Tabelle)
- Wertebereich
- Attributwert 
	- Atomares Element eines Wertebereiches
	- keine Mengen/Mehrwertigen
- Relationenschema
	- Menge von Attributen
- Relation
	- Menge von Zeilen
- Tupel
	- ????
???

### Normalisierung
Erste Normalform
- Zu Normaler Tabelle, kästchen enthalten nicht mehrere Werte
Zweite Normalform
- Bei Tupel-Keys: Attribute die nur von teil des Keys abhängig sind, werden ausgelagert
- (Name, {Matrikelnr}, {LV-nr}, LV-name)
	- Name nur von Matrikelnr abhängig, LV-name nur von LV-nr abhängig
	- -> 3 tabellen: Personen({Matrikelnr}, Name), Belegungen({Matrikelnr}, {LV-nr}), Vorlesungen({LV-nr}, LV-name)
Dritte Normalform
- Attribute die von Nicht-keys abhängig sind, werden ausgelagert
- ({LV-Nr}, Gebäudename, Addresse)
	- Abhängigkeit: Gebäude-Addresse ist von Gebäude abhängig, Gebäude ist von LV-Nr abhängig
	- -> LV({LV-Nr}, Gebäude), Gebäude({Gebäudename}, Addresse)
...