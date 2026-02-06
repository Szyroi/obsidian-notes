---
type: konzept
modul: Mathematische Grundlagen und Lineare Algebra
tags:
  - mengen
  - grundlagen
klausur: true
---

# Mengen

## 0.1 Leere Menge
**Definition:**  
Die **leere Menge** ∅ := {} := {x | x ≠ x} enthält **keine Elemente**.  
∀x ∈ Universum U: x ∉ ∅

**Intuition:**  
∅ ist die Menge ohne Elemente – das „Nichts“.

**Beispiel:**  
∅, {}  

**Klausurhinweis:**  
- Leere Menge als Teilmenge jeder Menge  
- Nicht mit {∅} verwechseln (das ist eine Menge mit einem Element ∅)

---

## 0.2 Kardinalität
**Definition:**  
Die **Kardinalität** $|A|$ einer Menge $A$ ist die **Anzahl ihrer Elemente**.

**Satz 0.1:**  
Falls $B ⊆ A ⇒ |B| ≤ |A|$  
Falls $B ⊆ A und A ⊆ C ⇒ B ⊆ C$

**Beispiel:**  
$A = {1,2,3,4}, B = {2,3} ⇒ |A|=4, |B|=2$

**Klausurhinweis:**  
- Kardinalität von Teilmengen bestimmen  
- Mengengleichungen nutzen

---

## 0.3 Teilmenge
**Definition:**  
$B$ ist eine **Teilmenge** von $A (B ⊆ A)$, wenn $∀x ∈ B ⇒ x ∈ A$.

**Klausurhinweis:**  
- Teilmengenbeziehung prüfen  
- In Beweisen oft notwendig

---

## 0.4 Mengengleichheit
**Definition:**  
$A = B ⇔ A ⊆ B **und** B ⊆ A$  

**Intuition:**  
Zwei Mengen sind gleich, wenn sie **die gleichen Elemente enthalten**.

**Klausurhinweis:**  
- Mengengleichheit durch zwei Teilmengenbeziehungen beweisen

---

## 0.5 Vereinigungsmenge
**Definition:**  
$A ∪ B := {x ∈ U | x ∈ A oder x ∈ B}$  
Für Familie $(Ai)ᵢ: ⋃_{i=1}^{n} Ai = A₁ ∪ A₂ ∪ ... ∪ Aₙ$

**Beispiel:**  
$A = {1,2}, B = {2,3} ⇒ A ∪ B = {1,2,3}$

---

## 0.6 Schnittmenge
**Definition:**  
$A ∩ B := {x ∈ U | x ∈ A und x ∈ B}$
Für Familie $(Ai)ᵢ: ⋂_{i=1}^{n} Ai = A₁ ∩ ... ∩ Aₙ$

**Beispiel:**  
$A = {1,2}, B = {2,3} ⇒ A ∩ B = {2}$

---

## 0.7 Komplement
**Definition:**  
$¬A := {x ∈ U | x ∉ A}$ (Komplement)  
$A \ B := {x ∈ A | x ∉ B}$ („A ohne B“)

**Sätze:**  
- $A ∩ B = ¬A ∪ ¬B$  
- $A ⊆ B ⇒ ¬B ⊆ ¬A$ (Antitonie)

---

## 0.8 Kartesisches Produkt
**Definition:**  
Für Mengen $A₁,...,Aₙ$:  
$$
\bigotimes_{i=1}^{n} A_i = A_1 × ... × A_n = \{(a_1,...,a_n) | a_i ∈ A_i\}
$$

**Beispiel:**  
$A = {1,2}, B = {x,y}$
$A × B = {(1,x),(1,y),(2,x),(2,y)}$

**Klausurhinweis:**  
- Tupel korrekt angeben  
- Reihenfolge beachten

---
