
## Definition
**Integer** (dt. *Ganzzahlen*) sind die Menge aller positiven, negativen und neutralen ganzen Zahlen:
\[
\mathbb{Z} = \{ \ldots, -3, -2, -1, 0, 1, 2, 3, \ldots \}
\]

Sie enthalten **keine Brüche oder Dezimalzahlen**.

---

## Eigenschaften
- **Abgeschlossenheit:**  
  Addition, Subtraktion und Multiplikation zweier Ganzzahlen ergeben wieder eine Ganzzahl.  
  Division **nicht** abgeschlossen (z. B. \( 1 / 2 \notin \mathbb{Z} \)).
  
- **Neutral- und Inverselemente:**  
  - Additiv neutrales Element: \( 0 \)  
  - Additiv inverses Element: \( -a \) zu \( a \)
  
- **Ordnung:**  
  Die Ganzzahlen sind geordnet:  
  \( \ldots < -2 < -1 < 0 < 1 < 2 < \ldots \)

---

## Darstellung in der Informatik
- **Datentypen:** `int`, `long`, `short`, `uint` (je nach Sprache)
- **Speicherbedarf:** abhängig von der Bit-Länge (z. B. 8 Bit → -128 bis 127)
- **Überlauf:** Wenn der Wertebereich überschritten wird, springt der Wert zum anderen Ende (z. B. \( 127 + 1 = -128 \) bei 8-Bit).

---

## Beispiele
| Ausdruck | Ergebnis | Erklärung |
|-----------|-----------|------------|
| \( 5 + (-3) \) | \( 2 \) | Addition mit negativem Operand |
| \( -4 \times 2 \) | \( -8 \) | Negativ × Positiv = Negativ |
| \( -8 / 4 \) | \( -2 \) | Division ergibt wieder Integer |
| \( 1 / 2 \) | ✖ | kein Integer-Ergebnis |

---

## Teilmengen
- **Natürliche Zahlen:** \( \mathbb{N} = \{0, 1, 2, 3, \ldots\} \)
- **Negative Zahlen:** \( \mathbb{Z}^- = \{-1, -2, -3, \ldots\} \)
- **Nichtnegative Zahlen:** \( \mathbb{Z}_{\ge 0} = \{0, 1, 2, \ldots\} \)

---
## Siehe auch
- [[Natürliche Zahlen]]
- [[Rationale Zahlen]]
- [[Vorzeichenregeln]]

---
