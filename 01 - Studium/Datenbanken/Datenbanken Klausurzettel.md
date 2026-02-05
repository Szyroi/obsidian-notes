## SQL
SELECT
```sql
SELECT (DISTINCT) a AS name
FROM tabelle b
JOIN c ON b.prop = c.prop
WHERE d
GROUP BY e
HAVING f
ORDER BY g ASC, h DESC;
```

Where
```sql
string LIKE 'M__er'
string LIKE 'M%'
x IS NOT NULL
number IN (1,3) -- end inclusive
```

Aggregatfunktionen
Sum, Avg, Count, Min, Max 

Joins
```sql
NATURAL JOIN tab
(INNER) JOIN tab a ON a.prop = b.prop
LEFT JOIN tab a ON a.prop = b.prop -- oder a is null
-- und cursed right join
```

Subselect conditions
```sql
WHERE x >= ALL ()
WHERE x = ANY ()
WHERE EXISTS ()
```

Delete
```sql
DELETE FROM tabelle WHERE x;
```

Insert
```sql
INSERT INTO tabelle VALUES (1, 2 '3');
```

Update
```sql
UPDATE tabelle
SET property = value
WHERE x
```

Tabellen
```sql
CREATE TABLE tabelle (
	name numeric(10),
	bla char(20)
);
```

Constraints
```sql
ALTER TABLE tabelle
ADD CONSTRAINT somename
-- CHECK (prop is not null)
-- PRIMARY KEY (prop)
-- UNIQUE (prop)
-- FOREIGN KEY (prop) REFERENCES other_table
```

Views
```sql
CREATE VIEW viewname AS
SELECT ... FROM ...
```
### Relationenalgebra
Umbenennung $\beta$ : $\beta[b\leftarrow a]R_1$
Attribut in $R_1$ from $a$ nach $b$ Umbenennen

Selektion $\sigma$ : $\sigma[\theta]R_1$
Zeilen aus $R_1$ Heraussuchen, die Bedingung $\theta$ erfüllen

Projektion $\pi$ : $\pi[a,b,c]R_1$
Spalten aus $R_1$ Ausblenden, bzw nur bestimmte Spalten $a,b,c$ behalten

Union $R_1\cup R_2$, Differenz $R_1-R_2$, Produkt $R_1\times R_2$

Zusammengesetzte:

Schnitt $\cap$, Division (??)

Join/Verbund
- Theta-Join $R_1\bowtie_{(a\;\theta\;b)}R_2$
	- Nur solche Zeilen werden Verknüpft, die $\theta$ erfüllen
	- Ersetzbar mit Umbenennung, Produkt, Selektion
- Equi-Join $R_1\bowtie_{(a=b)}R_2$
	- Theta-Join aber Bedingung $\theta$ ist gleichheit "="
- Natürlicher Join $R_1 \oplus R_2$
	- Wie Equi-Join aber $a$ und $b$ müssen gleich heißen
	- Duplizierte Zeile $a,b$ wird automatisch nur ein mal zurückgegeben (Projektion)

## Schemas
- Miniwelt / Diskursbereich 
	- Skizze
- Semantisches (Konzeptionelles) Schema / ERD / Semantischer Entwurf
	- Kardinalitäten, Beziehungen als Karo, Versionierung
	- Student <-(1..n)-{Studiert}-(0..n)-> Studiengang
		- Die Kardinalität an der näheren Seite gibt die Verbindungen an dem typ an
		- Jeder Student hat 1-n Studiengänge
		- Jeder Studiengang hat 0-n Studenten
		- (Bedingt) Einfach / Mehrfach
	- Komposition, Aggregation, Assoziation
	- Is-A (Sub-/Supertypen)
		- total/partiell, disjunkt/nicht-disjunkt
	- Schwache Entitätstypen
- Logisches Datenschema ("Relationales Datenmodell") / Logischer Entwurf
	- Foreign Keys
	- n-zu-n Kardinalitäten werden zu Zwischentabellen
- Datenbankschema (SQL) / Physischer Entwurf

### Normalformen
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

## DBMS
12 Codd-sche Regeln geben vor wie ein Relationales DMBS sein sollte.
DBMS verwaltet Datenbank

Ebenen eines DBMS / 3-Schema-Architektur
- Externe Ebene (Views)
- Konzeptuelle Ebene (Echte Tabellen)
- Interne Ebene (Tatsächliche Speicherung der Daten, Zugriffspfade/Indices)

Extern -> Konzeptuell = Views zu Tabellen auflösen
- Binden (Compile-Time/Interpreted)
	- Statische / Dynamische Datenunabhängigkeit 
Konzeptuell -> Intern = Physische Objekte von Tabellen finden
## Speicherstrukturen
Wie werden Datensätze auf Datenträger-Blöcke verteilt
- Index-Sequentielle Organisation
- Gestreute Organisation
- Baumverfahren

B-Baum
- Knoten = Speicherblock
- Speicherblock enthält Baumdatensätze aus
	- Pointer zum nächsten knoten (Wo keys zwischen aktuellem und vorherigem Baumdatensatz liegen)
	- Key
	- Andere Attribute vom Datensatz
- Am ende von jedem Speicherblock ist pointer zu nächstem Block für noch größere Keys

B+-Bäume
- Wie B-Baum aber enthält Datensätze nur in Blättern