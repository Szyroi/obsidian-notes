## **<u>Grundlagen</u>**

### Festkommadarstellung
- Komma ist an fester Position, z.B. 4 Stellen vor und 4 Stellen nach dem Komma.
- Werte werden als Ganzzahlen gespeichert, der Dezimalpunkt ist implizit.
- Vorteil: Einfache, schnelle Berechnungen.
- Nachteil: Begrenzter Wertebereich und fixe Genauigkeit.

### Gleitkommadarstellung
- Komma „gleitet“ durch Exponenten, flexibel für große Wertebereiche.
- Zahl = Vorzeichen × Mantisse × Basis^Exponent.
- Vorteile: Großer Wertebereich, geeignet für wissenschaftliche Berechnung.
- Nachteil: Komplexere Operationen, Rundungsfehler möglich.

![IEEE 754 Darstellung](IEEE-754-single.svg)  
*Bild 1: Aufbau und Zusammensetzung eines 32-Bit Gleitkommawertes*

---

## **<u>Umwandlung in Festkommadarstellung (binär)</u>**

1. **Kommaposition bestimmen:**  
   Beispiel: 4 Bit Nachkommastellen.

2. **Zahl skalieren:**  
   Dezimalzahl × \(2^{4}\) (für 4 Nachkommastellen).  
   Beispiel: \(13.625 \times 16 = 218\).

3. **In Ganzzahl umwandeln:**  
   \(218\) in Binär → `11011010`.

4. **Interpretation:**  
   Diese Binärzahl repräsentiert die Festkommazahl mit festem Komma.

---

## <u>Umwandlung in 32-Bit IEEE 754 Gleitkommadarstellung</u>

1. **Vorzeichen bestimmen:**  
   Positiv: 0, Negativ: 1.  
   Beispiel: 13.625 → Vorzeichen = 0.

2. **Zahl in binäre Normalform bringen:**  
   $(13.625_{10} = 1.101101 \times 2^{3})$.

3. **Mantisse wählen:**  
   Bits rechts der führenden 1 ohne diese speichern: `10110100000000000000000` (23 Bit).

4. **Exponent bestimmen:**  
   Exponent + Bias (127): \(3 + 127 = 130\).  
   Binär 8 Bit: `10000010`.

5. **Alle Teile zusammensetzen:**  
   Vorzeichen (1 Bit) + Exponent (8 Bit) + Mantisse (23 Bit)

---

## Vergleich

| Eigenschaft            | Festkommadarstellung            | Gleitkommadarstellung                |
|-----------------------|---------------------------------|------------------------------------|
| Kommaposition          | Fest                           | Variabel (durch Exponent)          |
| Wertebereich           | Beschränkt                    | Sehr groß                         |
| Genauigkeit            | Fest                          | Relativ konstant                  |
| Rechenaufwand          | Niedrig                       | Höher                            |
| Anwendungsgebiete      | Embedded Systeme, einfache Geräte | Wissenschaft, Grafik, Simulation	|

---


