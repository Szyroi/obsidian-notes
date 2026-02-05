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
# While Schleifen

## Erklärung
- [[06_Kontrollstrukturen.pdf]]
- `while()` Wiederholt Code, solange Bedingung true ist
-  Bedingung wird **vor** jedem Durchlauf geprüft

## Syntax

```Java
while (bedingung) {
    // Codeblock
}
```

## Beispiel

```Java
int i = 0;
while (i < 5) {
    System.out.println(i);
    i++;
}
```
