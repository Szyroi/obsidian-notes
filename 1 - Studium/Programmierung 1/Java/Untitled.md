---
erstellungsdatum: "2025-11-11"
art: Notiz
tags: #Java #Programmierung #Grundlagen
aliases: [Java Basics]
source: [[08_Typanpassung_Operatoren_Methoden.pdf]], [[09_Parameteruebergabe_Felder.pdf]]
autor:
---

# Java Grundlagen: Operatoren, Methoden, Typen, Parameter und Felder

## Ausdrücke & Operatoren
- Ein Ausdruck ist eine Berechnungsformel mit einem bestimmten Typ und Wert.
- Operatoren sind überladen und haben in Java definierte Priorität & Assoziativität (z.B. Punkt-vor-Strich)[attached_file:1].
- Typumwandlungen: implizite (nur erweiternd) und explizite (cast-Ausdruck), z.B. `int` zu `float`[attached_file:1].

## Methoden & Überladung
- Methoden strukturieren den Code und entsprechen mathematischen Funktionen.
- Überladung: gleicher Name, unterschiedliche Parameteranzahl/-typen[attached_file:1].
- Rekursive Methoden ermöglichen kompakte Problemlösungen; Basis- & Rekursionsfall[attached_file:1].

## Parameterübergabe
- Java verwendet `call-by-value`: Kopien der Parameter werden übergeben, keine Änderung der Originalwerte[attached_file:2].
- Vergleich zu `call-by-reference` (z.B. Fortran): dort wird die Speicheradresse übergeben[attached_file:2].

## Felder & Referenzen
- Felder (Arrays) sind Container für gleichartige Datentypen; Zugriff über Indizes und `.length`[attached_file:2].
- Feldvariablen sind Referenztypen und enthalten Speicheradressen („pointer“); Wert kann auch `null` sein[attached_file:2].
- Vergleich von Referenzen (`==`) prüft, ob zwei Variablen auf dasselbe Objekt zeigen; für Wertevergleich bei `String` → `.equals()` nutzen[attached_file:2].
- Mehrdimensionale Felder = Felder von Feldern; Anwendung z.B. für Matrizen.

## Algorithmen & Beispiele
- Primzahlsuche: Sieb des Eratosthenes als Anwendungsbeispiel für Felder.
- Permutationen, Backtracking, Labyrinthsuche: rekursive und iterative Lösungen mit Feldern.

---

**Siehe auch:** [[08_Typanpassung_Operatoren_Methoden.pdf]], [[09_Parameteruebergabe_Felder.pdf]]

