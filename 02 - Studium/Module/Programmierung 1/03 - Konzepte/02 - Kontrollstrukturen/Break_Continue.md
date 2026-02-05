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
- Vorlesung: [[VL_06_Kontrollstrukturen]]

## Beispiel Break
```java
for (int i = 0; i < 5; i++) {
    if (i == 3) break;
    System.out.println(i);
}