# Einführung in die Programmierung: Bitoperationen, Fließkommazahlen und Zeichenketten

## Übersicht
Diese Notiz fasst wichtige Konzepte aus den Bereichen Bitoperationen, Fließkommazahlen und Zeichenketten (Java) zusammen. Sie dient als Nachschlagewerk und Wissensbasis im Wiki-Stil.

---

## Bitoperationen

### Grundlagen
- Zahlen werden in 32 Bits (4 Bytes) binär gespeichert.
- Das niedrigste Bit hat Index 0, das höchste Bit Index 31.
- Beispiel: Integer `5` ist in Binär 000...0101.

### Wichtige Operationen
- **Links-Shift (<<):** Verschiebt Bits nach links, rechts werden Nullen eingefügt.
- **Rechts-Shift (>>):** Verschiebt Bits nach rechts mit Vorzeichenbehandlung.
- **Rechts-Shift ohne Vorzeichen (>>>):** Verschiebt Bits rechts, links werden Nullen eingefügt.
- **Bitweise Operatoren:**
  - `~` (Negation)
  - `&` (UND)
  - `|` (ODER)
  - `^` (Exklusives ODER XOR)

### Anwendungsbeispiel: Bitmaske
- Isolierung bestimmter Bits über Maskierung, z.B. `wert & 0x1` liest das niedrigstwertige Bit aus.
- Bitverschiebung zur Positionsanpassung der Bits.

---

## Überlauf in Ganzzahlarithmetik

- Integer-Arithmetik ist exakt, solange kein Überlauf stattfindet.
- Überlauf tritt z.B. bei einem `byte` bei Addition von 127 + 1 auf (führt zu -128).
- Programmierer müssen Überläufe proaktiv vermeiden.

---

## Ganze Zahlen in Java

| Datentyp | Größe   | Wertbereich / Besonderheit |
| -------- | ------- | -------------------------- |
| `byte`   | 1 Byte  | -128 bis 127               |
| `short`  | 2 Bytes | Kurzinteger                |
| `int`    | 4 Bytes | Standard ganzzahliger Typ  |
| `long`   | 8 Bytes | Für sehr große Zahlen      |

- Speicherung im Zweierkomplement.
- Zahlenkonstanten können als Dezimal-, Oktal-, Hex- oder Binärwerte angegeben werden.

---

## Fließkommazahlen

### Darstellung und Format
- Kombination aus Vorzeichen, Mantisse und Exponent.
- Formel: \( \text{Wert} = (-1)^V \times \text{Mantisse} \times B^\text{Exponent} \)

### IEEE 754 Standard
- **32 Bit (float):** 1 Bit Vorzeichen, 8 Bit Exponent, 23 Bit Mantisse.
- **64 Bit (double):** 1 Bit Vorzeichen, 11 Bit Exponent, 52 Bit Mantisse.
- Fehler und Rundungen aufgrund begrenzter Mantissenlänge möglich.

### Einschränkungen
- Ungenaue Ergebnisse bei Operationen auf Zahlen mit großer Zahlenunterschieden.
- Rundungsfehler sind normal bei Fließkommaarithmetik.

### Java-Typen
´´ (32 Bit), weniger genau.
`double` (64 Bit), Standardtyp für reelle Zahlen.

---

## Zeichen und Zeichenketten (Java)

### Kodierungen
- **ASCII:** 7-Bit, 128 Zeichen, lateinisches Alphabet.
- **ISO-8859-1:** 8-Bit, inklusive europäischer Sonderzeichen (Umlaute).
- **Unicode:** Bis zu 21 Bit, globaler Standard.
- Kodierungsformate: UTF-8, UTF-16, UTF-32.

### Java-Typen
- `char`: Unicode 16 Bit Zeichen (UTF-16).
- `String`: Klasse für Zeichenketten, unveränderlich (immutable).
- Unterstützung von Escape-Sequenzen (`\n`, `\t` etc.).
- Verkettung mit `+` erzeugt neue Strings, ändert aber alte nicht.

### Wichtige Methoden
- `length()`: Länge des Strings.
- `charAt(index)`: Zeichen an einer Position.
- `substring(start, end)`: Teilstring.
- `equals(String)`: Vergleich auf Gleichheit (nicht `==` verwenden).

---






---



