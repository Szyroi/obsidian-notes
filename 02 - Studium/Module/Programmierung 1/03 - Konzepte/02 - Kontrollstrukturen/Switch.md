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
# Switch (Java)

## Erklärung
- Alternative zu mehreren `if-else if`
- Prüft Gleichheit von Variablenwerten
- `default` = Standardblock, wenn kein Fall zutrifft

## Syntax

```java
switch (variable) {
    case wert1:
        // Code
        break;
    case wert2:
        // Code
        break;
    default:
        // Code
}
```

## Beispiel

```Java
int tag = 3;
switch (tag) {
    case 1: System.out.println("Montag"); break;
    case 2: System.out.println("Dienstag"); break;
    case 3: System.out.println("Mittwoch"); break;
    default: System.out.println("Unbekannt");
}
```



