#datenbanken/vorlesung 
# 11.06.2024
[[Datenbanken Vorlesung 10.pdf]]
## K6
### K6.3

Theta-Join vs Equi-Join ("Natürlicher Verbund") vs NATURAL JOIN
Gleiche Query 3x
```sql
-- Theta-Join (als Equi-Join)
SELECT o.lv_nr, g.strasse
FROM lv_ort o INNER JOIN gebaeude g
ON o.gebaeude = g.gebaeude;

-- Equi-Join mit Syntaxzucker
SELECT o.lv_nr, g.strasse
FROM lv_ort o INNER JOIN gebaeude g
USING (gebaeude);

-- Natural Join
SELECT lv_nr, strasse
FROM lv_ort NATURAL JOIN gebaeude;
```

Aggregatfunktionen
- `SUM`
- `COUNT`
	- `COUNT(prop)` um unique values von prop zu zählen
	- `COUNT(*)` um zeilen insgesamt zu zählen
- `MAX` / `MIN`
- `AVG`
Können im SELECT Teil verwendet werden
Reduzieren eine Menge an Elementen zu einem einzelnen Element

Gruppenbildung
Mit `GROUP BY`
Gruppen filtern mit `HAVING`
SELECT tupel wird auf jeder Gruppe separat ausgewertet?
Reihenfolge:
```sql
SELECT tupel
FROM tabellen
WHERE predicate
GROUP BY ausdruck
HAVING predicate
ORDER BY sortierung
```

IN-Operator für Mengen/Subqueries
```sql
SELECT * FROM personen
WHERE pers_nr in (
  SELECT pers_nr FROM professoren
)
```
Andere Operatoren:
- `=` für wenn subquery nur ein entry returned
- `ALL` condition muss für jedes element der Subquery/Menge zutreffen
- `ANY` condition muss für irgendein element der Subquery/Menge zutreffen
```sql
SELECT * FROM mitarbeiter
WHERE gehalt >= ALL (
  SELECT gehalt FROM mitarbeiter
)
```
- `EXISTS` um zu Testen dass Menge/Subquery nicht leer ist
	- Es gibt kein $\forall$ (`ALL` ist etwas anderes)
	- $\forall$ kann mit `not exists` und negierung der inneren bedingung dargestellt werden
		- $\forall x:f(x)=\lnot(\exists x:\lnot f(x))$
- `NOT EXISTS` ...

#### Relationen Verändern
Zur Modifikation von Tabelleninhalt
Insert / Einfügen
```sql
INSERT
INTO tabelle
VALUES (123, 'hi');
```

Delete / Löschen
```sql
DELETE FROM tabelle;

DELETE FROM tabelle
WHERE property = 1;
```

Update / Modifizieren
```sql
UPDATE tabelle
SET property = 123, vorname = 'Jeff'
WHERE name = 'Joff';
```
