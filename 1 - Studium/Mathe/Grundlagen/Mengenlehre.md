# Mengenlehre

## Grundlagen der Mengenlehre

Eine Menge ist eine Sammlung verschiedener Objekte, genannt Elemente, die aus einem Universum stammen.

> [!definition] Definition (Menge)  
> Eine Menge \( A \) ist eine Sammlung verschiedener Objekte, auch Elemente \( a, b, c, \ldots \) genannt, die aus einem Universum \( U \) stammen.  
> Man schreibt \( a \in A \), wenn \( a \) ein Element der Menge \( A \) ist, andernfalls \( a \notin A \).

Man unterscheidet zwischen aufzählender Darstellung und beschreibender Darstellung von Mengen:  
- Aufzählend: \( A = \{a, b, c, d\} \)  
- Beschreibend: \( A = \{x \in U \mid x \text{ hat die Eigenschaft } p\} \)

---

## Leere Menge

> [!definition] Definition (Leere Menge)  
> Die Menge  
> \[
> \emptyset = \{\} := \{x \mid x \neq x\}
> \]  
> heißt leere Menge.  
> Für alle Elemente \( x \) des Universums gilt: \( x \notin \emptyset \). 

---

## Kardinalität und Teilmengen

> [!definition] Definition (Kardinalität)  
> Die Kardinalität \( |A| \) einer Menge \( A \) ist die Anzahl ihrer Elemente.

> [!definition] Definition (Teilmenge)  
> Eine Menge \( B \) ist eine Teilmenge der Menge \( A \), wenn alle Elemente von \( B \) auch in \( A \) enthalten sind, d.h.  
> \[
> \forall x \in B : x \in A.
> \]  
> Schreibweise: \( B \subseteq A \).

**Satz:**  
- Falls \( B \subseteq A \), so gilt \( |B| \leq |A| \).  
- Falls \( B \subseteq A \) und \( A \subseteq C \), so gilt auch \( B \subseteq C \).

---

## Mengengleichheit

> [!definition] Definition (Gleiche Mengen)  
> Zwei Mengen \( A \) und \( B \) heißen gleich, wenn sie dieselben Elemente besitzen, also  
> \[
> \forall x (x \in A \iff x \in B)
> \]
> oder äquivalent  
> \[
> A \subseteq B \text{ und } B \subseteq A.
> \]

---

## Vereinigungsmenge

> [!definition] Definition (Vereinigungsmenge)  
> Für Mengen \( A \) und \( B \) ist die Vereinigungsmenge definiert als  
> \[
> A \cup B := \{x \in U \mid x \in A \text{ oder } x \in B\}.
> \]

Für eine Familie von Mengen \( (A_i)_{i \in I} \) ist  
\[
\bigcup_{i \in I} A_i = \{x \in U \mid \exists i \in I : x \in A_i\}.
\]

---

## Schnittmenge

> [!definition] Definition (Schnittmenge)  
> Für Mengen \( A \) und \( B \) ist die Schnittmenge definiert als  
> \[
> A \cap B := \{x \in U \mid x \in A \text{ und } x \in B\}.
> \]

Für eine Familie von Mengen \( (A_i)_{i \in I} \) ist  
\[
\bigcap_{i \in I} A_i = \{x \in U \mid \forall i \in I : x \in A_i\}.
\]

---

## Komplement einer Menge

> [!definition] Definition (Komplement)  
> Für eine Menge \( A \) ist das Komplement definiert als  
> \[
> \overline{A} := \{x \in U \mid x \notin A\}.
> \]

Zusätzlich definiert man  
\[
A \setminus B := \{x \in A \mid x \notin B\} \quad \text{(gesprochen: } A \text{ ohne } B\text{)}.
\]

**Satz:**  
- \( A \cap B = \overline{\overline{A} \cup \overline{B}} \) (De Morgan)

---

## Kartesisches Produkt

> [!definition] Definition (Kartesisches Produkt)  
> Für Mengen \( A_1, A_2, \ldots, A_n \) ist das kartesische Produkt definiert als  
> \[
> A_1 \times A_2 \times \cdots \times A_n := \{ (a_1, a_2, \ldots, a_n) \mid a_i \in A_i \text{ für } i=1,\ldots,n \}.
> \]

---

Diese Notiz fasst die grundlegenden Begriffe und Definitionen der Mengenlehre übersichtlich zusammen und verwendet Callouts, um die formell-mathematischen Definitionen hervorzuheben. Du kannst sie in Obsidian als eigenständige Wiki-Seite nutzen.
