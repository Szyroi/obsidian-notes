# **Einserkomplement**

Um negative zahlen darstellen zu können wird das **Einserkomplement verwendet**.

Das **Einserkomplement** bildet man in dem man alle bits der Binäre zahl invertiert.

**Bsp**:
```c
8_10 = 0000 1000_2
1111 0111_2
```

**Bereich**: $-(2^{n-1} - 1)$ bis $+(2^{n-1}-1)$

**Problem**: Es gibt dadurch aber Doppelte Nullen $+0(0000)$ und $-0(1111 \text{ bei 4 bit})$ 

# **Zweierkomplement**

Das Zweierkomplement ist die Lösung dieses problems.
Indem die zuvor durch den Einserkomplement gebildete Invertierte zahl mit 1 in der Binär darstellung addiert wird.

Bsp:
```c
8_10 = 0000 1000_2
1111 0111_2

1111 0111 (Einserkomplement von 8)
0000 0001 + (1 in Binär)
----------
     111  (Übertrag) 
----------
1111 1000

```

**Bereich**: $-2^{n-1}$ bis $2^{n-1}-1$

## **Most Significant Bit**

Das erste bit von Links nennt man den **Most Significant Bit (MSB)**.
Dieser gibt an ob die Zahl negataiv oder Positiv ist.
- Bei `0` -> Positiv
- Bei `1` -> Negativ

| Binär    | Dezimal |
| -------- | ------- |
| 01111111 | 127     |
| 01111110 | 126     |
| 01111101 | 125     |
| …        | …       |
| 00000001 | 1       |
| 00000000 | 0       |
| 11111111 | -1      |
| 11111110 | -2      |
| 11111101 | -3      |
| …        | …       |
| 10000000 | -128    |

## **Least Significant Bit**

Der erste bit von Rechts hingegen nennt man den **Least Significant Bit (LSB)**
- Bei `0` -> Zahl ist Gerade
- Bei `1` -> Zahl ist Ungerade

|Dezimal|Binär|LSB|Gerade/Ungerade|
|---|---|---|---|
|0|00000000|0|gerade|
|1|00000001|1|ungerade|
|2|00000010|0|gerade|
|3|00000011|1|ungerade|
|126|01111110|0|gerade|
|127|01111111|1|ungerade|

---
# **Festkommadarstellung**

## **Grundidee**

- Festkomma = **Alternative zu Gleitkommazahlen**
- Die Zahl wird als **Ganzzahl gespeichert**, aber wir interpretieren die Bits so, dass **ein Teil nach dem Komma liegt**
- Vorteil: schneller, deterministischer Rechenaufwand, oft in Embedded-Systemen, DSP oder Mikrocontrollern
- Nachteil: kleiner Wertebereich und weniger Präzision im Vergleich zu float/double
## **Aufbau**
Eine Festkommazahl wird dargestellt als:
- Beispiel: 16-Bit Zahl
  - 1 Bit = Vorzeichen (signed)
  - 7 Bits = Ganzzahlanteil
  - 8 Bits = Bruchanteil
- Der Wert wird interpretiert als:

$$
\text{Wert} = \text{Integer} \times 2^{-f}
$$

wobei \(f\) = Anzahl Bits im Bruchanteil.

---

## **Beispiele**

### a) 8.8 Format (16-Bit)

- 8 Bits → Ganzzahl  
- 8 Bits → Bruch

Zahl: `00000010 01000000₂`  

- Ganzzahl = `00000010` = 2  
- Bruch = `01000000` = 64 / 256 = 0.25  

➡ Wert = 2.25

### b) 1.15 Format (16-Bit signed)

- 1 Bit → Vorzeichen  
- 15 Bits → Bruch  

Beispiel: `0b0 0100000000000000`  

- Wert = 0.5 (da 2¹⁴ / 2¹⁵ = 0.5)  

---

## **Vorteile**

1. Schneller als float/double (keine Hardware-FPU nötig)  
2. Deterministisches Verhalten  
3. Ideal für kleine Controller oder DSPs  

## **Nachteile**

1. Begrenzter Wertebereich → Overflow leicht möglich  
2. Präzision begrenzt  
3. Programmierer muss selbst skalieren und interpretieren  

---

## **C-Beispiel (Fixpunkt mit Skalierung)**

```c
#include <stdio.h>
#include <stdint.h>

#define FRACTIONAL_BITS 8

int main() {
    int16_t x = 2 << FRACTIONAL_BITS; // 2.0 in 8.8 Format
    int16_t y = (64);                 // 0.25 in 8.8 Format (64/256)
    int16_t z = x + y;                // 2.25

    printf("Z = %d (raw), %.2f (interpretiert)\n", z, z / 256.0);
}
```


# **Gleitkommadarstellung**

##  Grundidee
- Gleitkommazahlen = Zahlen mit **Variabler Position des Kommas**
- Anders als Festkomma → Komma „gleitet“, daher der Name
- Standard: **IEEE 754**
  - **32-Bit** = float
  - **64-Bit** = double
- Vorteil: sehr großer Wertebereich und hohe Präzision für wissenschaftliche Berechnungen

---

## Aufbau (IEEE 754)

### a) 32-Bit Float

| Bit   | 31             | 30 … 23      | 22 … 0       |     |
| ----- | -------------- | ------------ | ------------ | --- |
| Name  | Vorzeichen (S) | Exponent (E) | Mantisse (M) |     |
| Größe | 1 Bit          | 8 Bit        | 23 Bit       |     |

- Wert = $$(-1)^S \times 1.M \times 2^{E-127}  $$
  - S = 0 → positiv, S = 1 → negativ  
  - E = Exponent + Bias (127 für 32-Bit)  
  - M = Mantisse (normalisiert, implizite führende 1)  

---

### b) 64-Bit Double

| Bit  | 63       | 62 … 52       | 51 … 0        |
|------|----------|---------------|---------------|
| Name | Vorzeichen | Exponent      | Mantisse      |
| Größe | 1 Bit    | 11 Bit        | 52 Bit        |
- Bias = 1023
- Wert = \((-1)^S \times 1.M \times 2^{E-1023}\)

---

##  Beispiel 32-Bit Float

Zahl: `6.5`  

1. Binär: `6.5` = `110.1₂`  
2. Normalisieren: `1.101 × 2^2`  
3. Vorzeichen S = 0 → positiv  
4. Exponent E = 2 + 127 = 129 → `10000001₂`  
5. Mantisse M = 101000…0 (23 Bits)

**Bitdarstellung (32-Bit):**