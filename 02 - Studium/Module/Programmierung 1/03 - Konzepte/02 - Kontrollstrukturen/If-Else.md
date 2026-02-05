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
# If-Else (Java)

## Erklärung
- [[06_Kontrollstrukturen.pdf]]
- `if` überprüft eine Bedingung und führt den Block aus, wenn die Bedingung **true** ist.
- `else` wird ausgeführt, wenn die Bedingung **false** ist.
- `else if` erlaubt die Überprüfung weiterer Bedingungen in der Reihenfolge.

## Syntax:

```Java
if (bedingung) {
    // Codeblock
} else if (andereBedingung) {
    // Codeblock
} else {
    // Codeblock
}
```


## Beispiel

```Java
int note = 2;

if (note == 1) {
    System.out.println("Sehr gut");
} else if (note == 2) {
    System.out.println("Gut");
} else {
    System.out.println("Verbesserungsbedarf");
}
```





