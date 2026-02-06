---
type: konzept
modul: Mathematische Grundlagen und Lineare Algebra
tags:
  - mengen
  - grundlagen
klausur: true
---

# Mengen

## 0.1 Menge 
**Definition:**
Eine Menge ist eine Sammlung verschiedener Objekte, auch Elemente genannt, die aus einem Universum z.B. den Ganzen Zahlne Stammen Man schreibt $a \in A$, wenn $a$ ein Element der Menge $A$ ist, anderfalls $a \notin A$.

Aufzählenden Darstellung:
- $A = \{ a,b,c,d \}$
- $A = \{ a,b,c\dots,z \}$
- $A = \{ 1,2,3,4,\dots\}$
Beschreibende Darstellung:
- $A = {x \in U \mid x \text{ hat bestimmet Eigenschaft p}}$
- $A = \{ x \in U \mid x \notin B  \}$

## 0.2 Leere Menge
**Definition:**  
Die **leere Menge** $\emptyset = \{\} := {x \mid x \neq x}$ enthält **keine Elemente**.  
$\forall x \in Universum \text{ } U: x \notin \emptyset$

**Intuition:**  
∅ ist die Menge ohne Elemente – das „Nichts“.

**Beispiel:**  
∅, {}  

**Klausurhinweis:**  
- Leere Menge als Teilmenge jeder Menge  
- Nicht mit {∅} verwechseln (das ist eine Menge mit einem Element ∅)

---

## 0.3 Kardinalität
**Definition:**  
Die **Kardinalität** $|A|$ einer Menge $A$ ist die **Anzahl ihrer Elemente**.

**Satz 0.1:**  
Falls $B ⊆ A ⇒ |B| ≤ |A|$  
Falls $B ⊆ A \text{ und } A ⊆ C ⇒ B ⊆ C$

**Beispiel:**  
$A = \{1,2,3,4\} \text{ } B = \{2,3\} ⇒ |A|= 4, |B| = 2$

**Klausurhinweis:**  
- Kardinalität von Teilmengen bestimmen  
- Mengengleichungen nutzen

---

## 0.4 Teilmenge
**Definition:**  
$B$ ist eine **Teilmenge** von $A (B ⊆ A)$, wenn $∀x ∈ B ⇒ x ∈ A$.

**Klausurhinweis:**  
- Teilmengenbeziehung prüfen  
- In Beweisen oft notwendig

---

## 0.5 Mengengleichheit
**Definition:**  
$A = B ⇔ A ⊆ B \text{ und } B ⊆ A$  

**Intuition:**  
Zwei Mengen sind gleich, wenn sie **die gleichen Elemente enthalten**.

**Klausurhinweis:**  
- Mengengleichheit durch zwei Teilmengenbeziehungen beweisen

---

## 0.6 Vereinigungsmenge
**Definition:**  
$A ∪ B := {x ∈ U \mid x ∈ A \text{ oder } x ∈ B}$  
Für Familie $A_{i}: ⋃_{i=1}^{n} A_{i} = A₁ ∪ A₂ ∪ ... ∪ Aₙ$

**Beispiel:**  
$A = {1,2}, B = {2,3} ⇒ A ∪ B = {1,2,3}$

---

## 0.7 Schnittmenge
**Definition:**  
$A ∩ B := {x ∈ U | x ∈ A und x ∈ B}$
Für Familie $(Ai)ᵢ: ⋂_{i=1}^{n} Ai = A₁ ∩ ... ∩ Aₙ$

**Beispiel:**  
$A = {1,2}, B = {2,3} ⇒ A ∩ B = {2}$

---

## 0.8 Komplement
**Definition:**  
$¬A := {x ∈ U | x ∉ A}$ (Komplement)  
$A \ B := {x ∈ A | x ∉ B}$ („A ohne B“)

**Sätze:**  
- $A ∩ B = ¬A ∪ ¬B$  
- $A ⊆ B ⇒ ¬B ⊆ ¬A$ (Antitonie)

---

## 0.9 Kartesisches Produkt
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
