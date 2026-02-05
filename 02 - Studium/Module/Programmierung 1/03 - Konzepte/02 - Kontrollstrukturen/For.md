---
type: konzept
modul: Programmierung 1
sprache: Java
tags:
  - java
  - prog1
  - konzept
  - kontrollstrukturen
---
# For-Schleife (Java)

## Erklärung
- Wird verwendet, um Code **eine bestimmte Anzahl von Malen** auszuführen  
- Besteht aus **Initialisierung**, **Bedingung** und **Inkrement/Update**  
- Besonders geeignet für Zähler- oder Index-Iterationen

- Verlinkt mit Vorlesung:
[[06_Kontrollstrukturen.pdf]]

## Syntax
```Java
for (initialisierung; bedingung; inkrement) {
    // Codeblock
}
```

## Beispiel 1 – Zähler

```Java
for (int i = 0; i < 5; i++) {     
	System.out.println(i); 
}
```

## Beispiel 2 – Array-Iteration

```Java
int[] zahlen = {1, 2, 3, 4};
for (int i = 0; i < zahlen.length; i++) {
    System.out.println(zahlen[i]);
}
```
