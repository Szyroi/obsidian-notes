# Mengenlehre – Formale Definitionen

> [!definition] Definition: Menge
> 
> Eine **Menge** \(A\) ist eine wohlbestimmte Sammlung von **unterscheidbaren Objekten** \(x\), die als **Elemente** von \(A\) bezeichnet werden.  
> 
> - Notation: \(A = \{x_1, x_2, \dots, x_n\}\)  
> - \(x \in A \iff x\) ist Element von \(A\)  
> - \(x \notin A \iff x\) ist kein Element von \(A\)

> [!definition] Definition: Teilmenge
> 
> Sei \(A\) und \(B\) Mengen.  
> 
> - \(A \subseteq B \iff \forall x (x \in A \implies x \in B)\)  
> - \(A \subset B \iff (A \subseteq B) \wedge (A \neq B)\)

> [!definition] Arten von Mengen
> 
> - **Endlich:** Eine Menge \(A\) heißt endlich, wenn sie eine **endliche Anzahl von Elementen** besitzt.  
> - **Unendlich:** Eine Menge \(A\) heißt unendlich, wenn sie nicht endlich ist.  
> - **Leere Menge:** Die Menge ohne Elemente, bezeichnet als \(\emptyset = \{\}\).  
> - **Universum:** Eine Menge \(U\), die alle betrachteten Elemente enthält.

> [!definition] Mengenoperationen
> 
> Seien \(A, B\) Mengen.  
> 
> - **Vereinigung:** \(A \cup B = \{x \mid x \in A \lor x \in B\}\)  
> - **Schnitt:** \(A \cap B = \{x \mid x \in A \land x \in B\}\)  
> - **Differenz:** \(A \setminus B = \{x \mid x \in A \land x \notin B\}\)  
> - **Komplement:** \(A^c = \{x \in U \mid x \notin A\}\)  
> - **Kartesisches Produkt:** \(A \times B = \{(a,b) \mid a \in A, b \in B\}\)

> [!definition] Gesetze der Mengenlehre
> 
> Seien \(A, B, C\) Mengen.  
> 
> - **Kommutativgesetze:**  
> \(A \cup B = B \cup A, \quad A \cap B = B \cap A\)  
> - **Assoziativgesetze:**  
> \((A \cup B) \cup C = A \cup (B \cup C), \quad (A \cap B) \cap C = A \cap (B \cap C)\)  
> - **Distributivgesetze:**  
> \(A \cap (B \cup C) = (A \cap B) \cup (A \cap C), \quad A \cup (B \cap C) = (A \cup B) \cap (A \cup C)\)  
> - **De Morgansche Gesetze:**  
> \((A \cup B)^c = A^c \cap B^c, \quad (A \cap B)^c = A^c \cup B^c\)

> [!definition] Spezielle Mengen
> 
> - **Natürliche Zahlen:** \(\mathbb{N} = \{1, 2, 3, \dots\}\)  
> - **Ganze Zahlen:** \(\mathbb{Z} = \{\dots, -2, -1, 0, 1, 2, \dots\}\)  
> - **Rationale Zahlen:** \(\mathbb{Q} = \left\{\frac{p}{q} \mid p \in \mathbb{Z}, q \in \mathbb{N}\right\}\)  
> - **Reelle Zahlen:** \(\mathbb{R}\)  
> - **Komplexe Zahlen:** \(\mathbb{C}\)
