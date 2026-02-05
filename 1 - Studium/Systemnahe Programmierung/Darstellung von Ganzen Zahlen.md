## **Einserkomplement**

Um negative zahlen darstellen zu können wird das **Einserkomplement verwendet**.

Das **Einserkomplement** bildet man in dem man alle bits der Binäre zahl invertiert.

**Bsp**:
```c
8_10 = 0000 1000_2
1111 0111_2
```

**Bereich**: $-(2^{n-1} - 1)$ bis $+(2^{n-1}-1)$

**Problem**: Es gibt dadurch aber Doppelte Nullen $+0(0000)$ und $-0(1111 \text{ bei 4 bit})$ 

## **Zweierkomplement**

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

Das erste bit von Links nennt man den **Most Significant Bit (MSB)**.
Dieser gibt an ob die Zahl negataiv oder Positiv ist.
- Bei `0` -> Positiv
- Bei `1` -> Negativ
Der erste bit von Rechts hingegen nennt man den **Least Significant Bit (LSB)**
- Bei `0` -> Zahl ist Gerade
- Bei `1` -> Zahl ist Ungerade

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



## **Festkommadarstellung**

## **Gleitkommadarstellung**
IEEE 754