---
type: konzept
modul: Programmierung 1
sprache: Java
tags:
  - prog1
  - konzept
  - java
  - kontrollstrukturen
---
# Break & Continue (Java)

## Erklärung
- `break` → verlässt die aktuelle Schleife sofort  
- `continue` → überspringt aktuellen Durchlauf, fährt Schleife fort
- Vorlesung: [[06_Kontrollstrukturen.pdf]]

## Beispiel Break

```java
for (int i = 0; i < 5; i++) {
    if (i == 3) break;
    System.out.println(i);
}

// Ausgabe: 0 1 2

```

## Beispiel Continue

```Java
for (int i = 0; i < 5; i++) {
    if (i == 3) continue;
    System.out.println(i);
}
// Ausgabe: 0 1 2 4

```

