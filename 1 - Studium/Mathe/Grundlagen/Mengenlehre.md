## Grundlagen der Mengenlehre

Eine Menge ist eine Sammlung verschiedener Objekte, genannt Elemente, die aus einem Universum stammen.

> [!definition] Definition (Menge)  
> Eine Menge \( A \) ist eine Sammlung verschiedener Objekte, auch Elemente \( a, b, c, \ldots \) genannt, die aus einem Universum \( U \) stammen.  
> Man schreibt \( a \in A \), wenn \( a \) ein Element der Menge \( A \) ist, andernfalls \( a \notin A \).

**Beispiel:**  
- \( A = \{1, 2, 3, 4\} \)  
- \( B = \{ x \in \mathbb{N} \mid x \text{ gerade} \} = \{2, 4, 6, 8, \ldots\} \)

---

## Leere Menge

> [!definition] Definition (Leere Menge)  
> Die Menge  
> \[
> \emptyset = \{\} := \{ x \mid x \neq x \}
> \]  
> heißt leere Menge.  
> Für alle \( x \) gilt: \( x \notin \emptyset \).

**Beispiel:**  
Es gibt keine natürliche Zahl, die gleichzeitig größer und kleiner als 0 ist, also ist diese Menge leer.

---

## Kardinalität und Teilmengen

> [!definition] Definition (Kardinalität)  
> Die Kardinalität \( |A| \) einer Menge \( A \) ist die Anzahl ihrer Elemente.

> [!definition] Definition (Teilmenge)  
> Eine Menge \( B \) ist Teilmenge von \( A \), falls  
> \[
> \forall x \in B : x \in A
> \]  
> geschrieben als \( B \subseteq A \).

**Beispiele:**  
- \( \{1, 2\} \subseteq \{1, 2, 3\} \)  
- \( \emptyset \subseteq A \) für jede Menge \( A \)

---

## Mengengleichheit

> [!definition] Definition (Gleiche Mengen)  
> Zwei Mengen \( A \) und \( B \) sind gleich, wenn  
> \[
> \forall x : (x \in A \iff x \in B)
> \]

**Beispiel:**  
\( \{a, b, c\} = \{c, b, a\} \), da dieselben Elemente enthalten sind.

---

## Vereinigungsmenge

> [!definition] Definition (Vereinigung)  
> Für Mengen \( A \) und \( B \) gilt:  
> \[
> A \cup B = \{ x \in U \mid x \in A \text{ oder } x \in B \}
> \]

**Beispiel:**  
\( A = \{1, 2, 3\}, B = \{3, 4, 5\} \)  
\( A \cup B = \{1, 2, 3, 4, 5\} \).

---

## Schnittmenge

> [!definition] Definition (Schnittmenge)  
> Für Mengen \( A \) und \( B \) gilt:  
> \[
> A \cap B = \{ x \in U \mid x \in A \text{ und } x \in B \}
> \]

**Beispiel:**  
\( A = \{1,2,3\}, B = \{3,4,5\} \)  
\( A \cap B = \{3\} \).

---

## Komplement einer Menge

> [!definition] Definition (Komplement)  
> Für Menge \( A \) ist das Komplement  
> \[
> \overline{A} = \{ x \in U \mid x \notin A \}
> \]

> [!definition] Definition (Differenz)  
> Für Mengen \( A \) und \( B \) ist  
> \[
> A \setminus B = \{ x \in A \mid x \notin B \}
> \]

**Beispiel:**  
Sei \( U = \{1,2,3,4,5\} \), \( A = \{1,2,3\} \), \( B = \{2,3\} \)  
Dann:  
\[
\overline{A} = \{4,5\} \quad \text{und} \quad A \setminus B = \{1\}
\]

---

## Kartesisches Produkt

> [!definition] Definition (Kartesisches Produkt)  
> Für Mengen \( A, B \) ist  
> \[
> A \times B = \{ (a,b) \mid a \in A, b \in B \}
> \]

**Beispiel:**  
\( A = \{1,2\} \), \( B = \{x,y\} \)  
\[
A \times B = \{ (1,x), (1,y), (2,x), (2,y) \}
\]

---

Diese Notiz verwendet LaTeX so, dass sie mit dem Obsidian LaTeX Suite Plugin optimal dargestellt wird.
