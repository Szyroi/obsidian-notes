---
type: konzept
modul: Programmierung 1
sprache: Java
tags:
  - prog1
  - konzept
  - java
  - grundlagen
---

# Grundlagen

## Erklärung
- - **Typanpassung (Type Casting)** = Umwandlung eines Werts von einem Datentyp in einen anderen  
- **Implizit (widening)**: Automatische Umwandlung von **klein → groß** (z.B. `int → double`)  
- **Explizit (narrowing / cast)**: Manuelle Umwandlung von **groß → klein** (z.B. `double → int`) 
- Vorlesung: [[08_Typanpassung_Operatoren_Methoden.pdf]]

## Syntax / Struktur

### Implizit
```java
int a = 5;
double b = a;   // int → double automatisch
```

### Explizit

```Java
double c = 3.7; int d = (int) c;  // double → int, Ergebnis 3
```

## Beispiel

```Java
// Implizit
int i = 10;
double x = i;       // 10 → 10.0

// Explizit
double y = 7.9;
int j = (int) y;    // 7

// Verlust von Nachkommastellen beachten
System.out.println(j); // Ausgabe: 7

```

## Typische Fehler

- Verlust von Nachkommastellen bei explizitem Cast nicht berücksichtigt
- Ungültiger Cast, z.B. `String s = (String) 5;` → Compilerfehler
- Missverständnis zwischen impliziter und expliziter Typumwandlung