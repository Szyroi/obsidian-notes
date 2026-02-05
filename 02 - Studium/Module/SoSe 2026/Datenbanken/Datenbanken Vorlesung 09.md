#datenbanken/vorlesung 
# 04.06.2024
[[Datenbanken Vorlesung 09.pdf]]
## K6
### K6.2
DML - Data Manipulation Language
Auch für Anfragen

#### Views
View erzeugen
```sql
CREATE VIEW sicht AS anfrage;
```
Views können für queries an stelle von Tabellen eingesetzt werden
#### Einfügen
Tabelle erzeugen und Inserten
```sql
CREATE TABLE tabelle {
spalte1 NUMERIC(4),
spalte2 CHAR(9)
};
INSERT INTO tabelle
VALUES (123, '9 Zeichen');
```
#### Queries
SELECT entspricht Projektion $\pi$ (Zeilen Ausblenden)
```sql
SELECT tupel, von, zeilen FROM tabelle;
SELECT * FROM tabelle;
```

AS entspricht Umbenennung $\beta$
```sql
SELECT vorname AS name FROM tabelle;
SELECT Gehalt*12 AS Jahresgehalt FROM tabelle;
```

Ausblenden identischer Zeilen
```sql
SELECT DISTINCT ...
```

Sortierung der Zeilen
Mehrere sortierungs-spalten: Es wird von links nach rechts priorisiert
```sql
SELECT pers_nr, fb_nr FROM person
ORDER BY fb_nr ASC, pers_nr DESC
```

WHERE entspricht Selektion $\sigma$
Simpelste Prädkate $\theta$: =, !=, <>, <, >, <=, >= 
!= und <> sind identisch(?) (aber != ist non-standard)
```sql
SELECT * FROM person WHERE pers_nr > 1000;
```
Zusätzlich zum arbeiten mit Prädikaten gibt es weitere:
AND, OR, NOT

Number in Range:
IN-Operator `fb_nr IN (1,3)` (ends inclusive)

Zeichenkette mit Muster vergleichen:
LIKE-Operator `vorname LIKE 'Sch%'`
`_` für ein Char: `%` für beliebig viele Chars
Case-Insensitive by default

Vergleich mit Nullwerten:
IS-Operator `todesdatum IS NULL` bzw `todesdatum IS NOT NULL`

Equi-Join (Natürlicher Verbund != Natural Join)
Alter Weg:
```sql
SELECT vl.name, ort.hausnr
FROM vorlesung vl, vorlesungsort ort
WHERE vl.gebaeude = ort.gebaeude;
```
Neuer Weg:
```sql
SELECT vl.name, ort.hausnr
FROM vorlesung vl
INNER JOIN vorlesungsort ort ON vl.gebaeude = ort.gebaeude;
```
INNER join heißt nur tupel wo beiden Seiten nicht null sind

Equi-Join mit NULL-Werten
Outer Join
- LEFT OUTER
	- Null-Werte auf der Seite erlaubt, die via JOIN dazugeholt wird
- RIGHT OUTER
	- Null-Werte auf der Existierenden seite erlaubt
	- Mega weird, inverted alles, und ist mit LEFT ersetzbar

Vereinigung/Durchschnitt/Differenz
```sql
anfrage1 UNION anfrage2;
anfrage1 INTERSECT anfrage2;
anfrage1 MINUS anfrage2;
```
