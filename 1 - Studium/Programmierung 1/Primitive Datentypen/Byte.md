# Einführung in die Programmierung: Bitoperationen, Fließkommazahlen, Zeichenketten

## Bitoperationen

- Werte werden binär in 32 Bits (4 Bytes) gespeichert.
- Niederwertiges Bit hat den Index 0, höchstwertiges Bit den Index 31.
- Beispiel: int x = 5 entspricht binär 000...0101.

### Bit-Shift-Operationen
- `<<` Links-Shift: Bits werden nach links verschoben, rechts werden Nullen eingefügt.
- `>>` Rechts-Shift mit Vorzeichenbehandlung: Bits nach rechts verschieben, höchstes Bit wird erweitert.
- `>>>` Rechts-Shift ohne Vorzeichen: Rechts verschieben, links Nullen.

### Bitweise Operatoren
- `~` Bitweise Negation (Invertierung aller Bits).
- `&` Bitweises UND zweier Werte.
- `|` Bitweises ODER zweier Werte.
- `^` Exklusives Oder (XOR).

### Beispiel Bitmaske
- Isolieren eines Bits mit Maske, z.B. `wert & 0x1` liest das niederwertigste Bit.
- Shifting verändert die Position der Bits im Wert.

## Überlauf bei ganzzahligen Operationen
- Ganzzahlarithmetik ist exakt, außer bei Überlaufeffekten.
- Beispiel: Addition über Maximalwert bei byte (127 + 1 = -128).
- Programmierer müssen Überlauf selbst vermeiden.

## Ganze Zahlen in Java
| Typ    | Größe    | Besonderheit               |
|--------|----------|----------------------------|
| byte   | 1 Byte   | Wertbereich -128 bis 127   |
| short  | 2 Bytes  | Wertbereich siehe Java-Doc |
| int    | 4 Bytes  | Standard ganzzahliger Typ  |
| long   | 8 Bytes  | Für große Werte            |

- Werte im Zweierkomplement.
- Konstanten können in Dezimal, Oktal, Hex oder Binär angegeben werden.

## Fließkommazahlen

### Darstellung
- Zusammensetzung aus Vorzeichen, Mantisse und Exponent.
- Formel: Wert = (-1)^V * Mantisse * Basis^Exponent.

### IEEE 754 Standard
- 32 Bit float: 1 Bit Vorzeichen, 8 Bit Exponent, 23 Bit Mantisse.
- 64 Bit double: 1 Bit Vorzeichen, 11 Bit Exponent, 52 Bit Mantisse.
- Rundungsfehler durch begrenzte Mantisse möglich.

### Probleme bei Fließkommazahlen
- Ungenauigkeiten durch Rundung vor allem bei Operationen mit sehr unterschiedlichen Größen.

### Java Typen für Fließkommazahlen
- `float`: 32 Bit, weniger genau.
- `double`: 64 Bit, Standard für reelle Zahlen.

## Zeichen und Zeichenketten

### Zeichenkodierungen
- ASCII: 7 Bit, 128 Zeichen (lat. Alphabet, Steuerzeichen).
- ISO-8859-1: 8 Bit, u.a. deutsche Umlaute.
- Unicode: Bis zu 21 Bit, weltweit alle Zeichen.
- UTF-8, UTF-16, UTF-32 als Kodierungsformate.

### Java Zeichen (`char`) und Strings
- `char`: einzelnes 16-Bit Unicode-Zeichen (UTF-16).
- `String`: Klasse für Zeichenketten, unveränderlich.
- Escape-Sequenzen z.B. `\n` (Neue Zeile), `\t` (Tabulator).
- Verkettung mit `+` erzeugt neue Strings.

### Wichtige String-Methoden
- `length()`: Länge des Strings.
- `charAt(index)`: Zeichen an Position.
- `substring(start, end)`: Teilstring.
- `equals(String)`: Vergleich auf Gleichheit.

---

> [!INFO] Tipp  
> Nutze diese Notiz in Obsidian, um die Konzepte der ersten Seiten strukturiert und leicht zugänglich zu speichern. Verwende die Überschriften und Listen zur klaren Gliederung.

