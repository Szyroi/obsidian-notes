#datenbanken/vorlesung 
# 28.05.2024
[[Datenbanken Vorlesung 08.pdf]]
Kapitel 6, Teil 1
## K6
### K6.1
Formale Datenbank-Abfrage-Sprachen
#### Kriterien von Datenanfragesprachen

Grundlagen
- Abgeschlossenheit
	- Ergebnis ist wieder Relation
	- Kann also als Input einer weiteren Query verwendet werden
- Adäquatheit
	- Alle Konzepte des unterliegenden Datenmodells werden Unterstützt
- Orthogonalität
	- Sprachkonstrukte sind in ähnlichen Situationen ähnlich anwendbar
- Mengenorientiertheit
	- Jede Operation Funktioniert auf Mengen von Daten

Schnittstelle zum System
- Optimierbarkeit
	- Optimierungsregeln
- Effizienz
	- Nicht Exponentielle Kaufzeit
- Sicherheit (Laufzeit)
	- Anfragen brauchen endlich viel Zeit und geben endlich viele Daten zurück

Schnittstelle zum Anwender
- Vollständigkeit
	- Sprache muss mindestens die Anfragen einer Standardsprache ausdrücken können
- Eingeschränktheit
	- Keine komplette Programmiersprache
- Deskriptivität
	- Anwender formuliert, was er haben will, und nicht welche Speicherstrukturen er ansprechen muss um sein Ergebnis zu erhalten
- Ad-Hoc-Formulierung
	- Anfrage Formulierbar ohne vollständiges Programm zu schreiben

#### Heutige Anfragesprachen
Objektorientierte Systeme:
...

Relationale Systeme:
Sprache
- SEQUEL
- QUEL
- SQL (<-- !)
- QBE

Zweidimensionale Tabellen
Fremschlüssel und Beziehungs-Tabellen
Mengenorientiert
Basieren auf Relationenalgebra und -kalkül
#### Relationenkalkül vs Relationenalgebra

Kalkül = Formale Logische Sprache von Aussagen
Prädikatenkalkül = Antwort true/false

Relationenkalkül = Angabe eines Relationenschemas mit Bedingungen (Prädikate)
- Wie Mathematische Set-Angabe: $\set{\text{Schema}\|\text{Bedingung}}$
Nicht-prozedualer Ansatz:
- Nur beschreibung, was man möchte (nicht prozedur um es zu erhalten)


Algebra = Definiert durch Wertebereich und Operationen auf ihm

Relationenalgebra
- Tabellen als Werte
- Operatoren auf Tabellen wie z.B.
	- Spalten Ausblenden
	- Zeilen Heraussuchen
	- Tabellen Verknüpfen
	- Spalten Umbenennen

Prozedualer Ansatz:
- Beschreibung, was man möchte
- Beschreibung, wie man es bekommt

z.B. Name des Studenten der Relation "Student" mit der Matrikelnummer "1234"

#### Relationenalgebra

Grundoperationen
- Selektion: Zeilen heraussuchen
- Projektion: Spalten ausblenden
- Union: Vereinigung von Relationen
- Differenz von Relationen
- Produkt von Relationen (Alle möglichen Tupel)
Hilfsoperationen
- Umbenennen von Spalten

Umbenennung $\beta$
Attribut in $R_1$ from $a$ nach $b$ Umbenennen
$\beta[b\leftarrow a]R_1$
In SQL als `SELECT a AS b ...`

Selektion $\sigma$
Zeilen aus $R_1$ Heraussuchen, die Bedingung $\theta$ erfüllen
$\sigma[\theta]R_1$
z.B. $\theta$ könnte sein `Gebäude='B'`
In SQL als `SELECT * FROM R_1 WHERE b`

Projektion $\pi$
Spalten aus $R_1$ Ausblenden, bzw nur bestimmte Spalten $a,b,c$ behalten
$\pi[a,b,c]R_1$
In SQL als `SELECT a,b,c ...`

Union $R_3=R_1+R_2$
AKA $\cup$
Vereinigt Zeilen zweier Relationen $R_1,R_2$ zu einer $R_3$
Die Zwei Relationen müssen das gleiche Format haben
- Anzahl Attribute, Attributnamen, Attribut-Wertebereiche, Attribut-Reihenfolge

Differenz $R_3=R_1-R_2$
Zeilen aus $R_1$ die nicht in $R_2$ sind
Nicht Kommutativ
Die Zwei Relationen müssen das gleiche Format haben (wie Union)

Produkt $R_3=R_1\times R_2$
AKA Karthesisches Produkt
Verknüpfung jeder Zeile von $R_1$ mit jeder Zeile von $R_2$
Zeilenanzahl von $R_3$ ist Zeilenanzahl von $R_1$ und $R_2$ miteinander Multipliziert
Umbenennung nötig wenn $R_1$ und $R_2$ Spalten mit gleichen Namen haben

##### Zusammengesetzte Operationen

- Schnitt $R_1\cap R_2$
- Division $R_1 \div R_2$
	- Schema: Attribute von $R_2$ sind Teilmenge von $R_1$
	- Ergebnis erhält nur Zeilen aus $R_1$ die alle Eigenschaften der Zeilen von $R_2$ erfüllen
	- Ergebnisschema enthält keine Spalten die in $R_2$ sind
	- z.B. Welche der Studenten im Belegungsplan(VL, MatNR) $R_1$ hört jede der Vorlesungen(VL) $R_2$ -> (MatNR)
- Join / Verbund
	- Theta-Join $R_1\bowtie_{(a\;\theta\;b)}R_2$
		- Nur solche Zeilen werden Verknüpft, die $\theta$ erfüllen
		- Ersetzbar mit Umbenennung, Produkt, Selektion
	- Equi-Join $R_1\bowtie_{(a=b)}R_2$
		- Theta-Join aber $\theta$ ist gleichheit "="
	- Natürlicher Join $R_1 \oplus R_2$
		- Wie Equi-Join aber $a$ und $b$ müssen gleich heißen
		- Duplizierte Zeile $a,b$ wird automatisch nur ein mal zurückgegeben (Projektion)

#### Datenmanipulation
Einfügen von Tupel/Zeilen (Vereinigung)
R1 = R1 + R2

Löschen von Tupel/Zeilen (Differenz)
R1 = R1 - R2

Ersetzen von Tupel/Zeilen (Zusammengesetzt)
R1 = R1 - R2 + R3

