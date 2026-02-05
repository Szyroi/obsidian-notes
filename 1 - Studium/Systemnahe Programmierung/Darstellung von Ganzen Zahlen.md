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

1111 0111
0000 0001+
1110 1111 
----------


```
