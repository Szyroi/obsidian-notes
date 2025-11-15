
## 1. Einführung
Die **Relationstheorie** untersucht binäre Relationen zwischen Elementen von (möglicherweise verschiedenen) Mengen. Eine Relation stellt Beziehungen zwischen Paaren von Elementen dar und verallgemeinert Funktionen, Ordnungen und Äquivalenzen.

> [!definition] Definition: Relation  
> 
> Sei $A$ und $B$ Mengen. Eine **Relation** $R$ von $A$ nach $B$ ist eine Teilmenge des kartesischen Produkts $A \times B$:  
> $$
> R \subseteq A \times B
> $$
> <u>Schreibweisen</u>: $(x,y) ∈ R$ oder $xRy \  \ (x ∈ X , y ∈ Y )$. 
> Eine Relation mit $\mathrm{dom}(R) = \mathrm{cod}(R)$ heißt ***homogen*** oder auch ***Endorelation***. 

> [!definition] Definition: Konverse Relation  
> 
>Für eine **Relation** $R: A \to B$ heißt  
> $$
> \mathrm{R^{-1}} := \{(y,x) \in B \times A \mid (x,y) \in R\}
> $$
> konverse Relation oder Konverse von $R: xR^{-1}y \Leftrightarrow yRx$

> [!definition] Definition: Domäne   
> 
> Die Menge $X$ heißt Domäne (Definitionsmenge) von $R: \mathrm{dom}(R) = X$.  
> $$
> \mathrm{dom}(R)=\{x\in A \mid \exists y\in B:\ (x,y)\in R\}
> $$ 
> **Alle Inputs**, für die die Relation „einen Wert hat“.

> [!definition] Definition: Kodomäne   
> 
> Die Menge $Y$ heißt Kodomäne (Zielmenge) von $R: \mathrm{cod}(R) = Y$.  
> $$
> \mathrm{cod}(R)=\{y\in A \mid \exists x\in B:\ (x,y)\in R\}
> $$  
>>[!warning] Achtung: 
>> Die Codomain ist **nicht** zwingend die Menge aller tatsächlich erreichten Werte – das ist die Bildmenge.

> [!definition] Definition: Bild   
> 
> Seien $A,B$ Mengen und $R: A \to B$ eine Relation. 
> $$
>  \mathrm{Bild}(R) = \mathrm{im}(R) := \{y\in B \mid \exists_{x\in A}\ (x,y)\in R\}
> $$  
> Das Bild von $R$ gibt alle möglichen **Outputs** der Relation die Tatsächlich vorkommen.

> [!definition] Definition: Urbild   
> 
> Seien $A,B$ Mengen und $R: A \to B$ eine Relation. 
> $$
>  \mathrm{Urbild}(R) = \mathrm{im}(R^{-1}) := \{x\in A \mid \exists_{y\in B}\ (x,y)\in R\}
> $$  
> Das Urbild von $R$ gibt alle möglichen **Elemente** wieder die auf ein Element in $B$ zeigen.
>> [!warning] Achtung:
>> Das Urbild und die Konverse Relation ist nicht das gleiche.
>> 
>> Das Urbild gibt alle Elemente von $A$ die auf $B$ zeigen.
>> 
>> Die Konverse Relation bildet eine neue Relation in der alle Paare umgedreht sind. 

---

## 2. Darstellung von Relationen

> [!definition] Darstellung als Menge von Paaren  
> 
> Eine Relation wird oft als Menge geordneter Paare dargestellt:  
> $$
> R=\{(a_1,b_1),(a_2,b_2),\dots\}
> $$

> [!definition] Adjazenzmatrix  
> 
> Für $A=\{a_1,\dots,a_n\}$ kann $R\subseteq A\times A$ durch eine $(n\times n)$-Matrix $(M)$ dargestellt werden mit  
> $$
> M_{ij} =
> \begin{cases}
> 1 & \text{falls }(a_i,a_j)\in R,\\
> 0 & \text{sonst.}
> \end{cases}
> $$

> [!definition] gerichteter Graph (Digraph)  
> 
> Relationen auf $A$ können als gerichtete Graphen mit Knoten $A$ und gerichteten Kanten $(x,y)\in R$ visualisiert werden.


---

## 3. Grundbegriffe und Operationen

> [!definition] Komposition (Verknüpfung)  
> 
> Für Relationen $R\subseteq A\times B$ und $S\subseteq B\times C$ ist die **Komposition** $S\circ R$ definiert durch  
> $$
> S\circ R = \{(x,z)\in A\times C \mid \exists y\in B:\ (x,y)\in R \land (y,z)\in S\}.
> $$

> [!definition] Identitätsrelation  
> 
> Auf $A$ ist die Identität:  
> $$
> \mathrm{Id}_A=\{(x,x)\mid x\in A\}.
> $$

> [!definition] Potenzen, transitive und reflexive Hülle  
> 
> - $R^1=R,\ R^{n+1}=R\circ R^n$.  
> - **Transitive Hülle**:  
> $$
> R^+ = \bigcup_{n\ge 1} R^n
> $$  
> - **Reflexiv-transitive Hülle**:  
> $$
> R^* = \bigcup_{n\ge 0} R^n \quad(\text{mit }R^0=\mathrm{Id}_A)
> $$


---

## 4. Eigenschaften von Endorelationen
> [!definition] [[Reflexivität]]
> 
> $R$ ist **Reflexiv**, falls  
> $$
> \forall x\in A:\ (x,x)\in R.
> $$

> [!definition] [[Irreflexivität]]  
> 
> $R$ ist **Irreflexiv**, falls  
> $$
> \forall x\in A:\ (x,x)\notin R.
> $$

> [!definition] [[Symmetrie]]  
> 
> $R$ ist **Symmetrisch**, falls  
> $$
> \forall x,y\in A:\ (x,y)\in R \implies (y,x)\in R.
> $$

> [!definition] [[Asymmetrie]]  
> 
> $R$ ist **asymmetrisch**, falls  
> $$
> \forall x,y\in A:\ (x,y)\in R \implies \neg yRx.
> $$

> [!definition] [[Antisymmetrie]]  
> 
> $R$ ist **antisymmetrisch**, falls  
> $$
> \forall x,y\in A:\ (x,y)\in R \ \land \ (y,x)\in R \implies x = y.
> $$

> [!definition] [[Transitivität]]  
> 
> $R$ ist **transitiv**, falls  
> $$
> \forall x,y,z\in A:\ ((x,y)\in R \land (y,z)\in R) \implies (x,z)\in R.
> $$

> [!definition] Totalität / Vergleichbar  
> 
> $R$ ist **total** (linear), falls  
> $$
> \forall x,y\in A:\ (x,y)\in R \lor (y,x)\in R.
> $$

> [!definition] FLIS-Eigenschaften
> Seien $A,B$ Mengen und $R: A \to B$ eine Relation
> $(i)$ $R$ heißt funktional (rechtseindeutig), 
> 
> $(ii)$ injektiv (linkseindeutig) falls jeder wert von der $\mathrm{dom(R)}$ genau einen wert der $\mathrm{cod(R)}$ zugeordnet ist.
> $$
> \forall_{x_{1},x_{2} \in A} \ \forall_{y \in B} \ x_{1}Ry \land x_{2}Ry \implies x_{1} = x_{2}.
> $$
> $(iii)$ surjektiv (rechtstotal) wenn alle werter von der $\mathrm{cod(R)}$ mindestens eine Zuordnung aus $\mathrm{dom(R)}$ haben.
> $$
> \forall_{y \in B} \exists_{x \in A} xRy \Leftrightarrow \mathrm{im(R) = cod(R) = B}.
> $$


> $(iv)$ Bijektiv
> $(v)$ linkstotal
---

## 5. Wichtige Relationstypen

> [!definition] Äquivalenzrelation  
> 
> Eine Relation $R\subseteq A\times A$ heißt **Äquivalenzrelation**, wenn sie reflexiv, symmetrisch und transitiv ist. Für $x\in A$ definiert man die Äquivalenzklasse:  
> $$
> [x]_R = \{y\in A \mid (x,y)\in R\}.
> $$  
> Die Menge aller Äquivalenzklassen bildet die **Quotientenmenge**:  
> $$
> A / R = \{[x]_R \mid x\in A\}.
> $$

> [!definition] Partielle Ordnung  
> 
> Eine Relation $R\subseteq A\times A$ ist **partiell geordnet**, falls sie   
>  - [[Reflexivität |reflexiv]]
>  - [[Antisymmetrie|antisymmetrisch]] 
>  - [[Transitivität|transitiv]] ist. 
> Man schreibt $(A,R)$ oder $(A,\le)$.

> [!definition] Totale (lineare) Ordnung  
> 
> Eine partielle Ordnung ist **total**, falls zusätzlich jede zwei Elemente vergleichbar sind (siehe Totalität).

> [!definition] Strikte Ordnung  
> 
> Eine **strikte** Ordnung $(<)$ ist irreflexiv und transitiv. Zu einer partiellen Ordnung $(\le)$ gehört die strikte Ordnung $(<)$ mit $$x<y \iff x\le y \land x\ne y$$

> [!definition] Funktion als spezielle Relation  
> 
> Sei $R\subseteq A\times B$. $R$ ist eine **Funktion** (Abbildung) $f:A\to B$ genau dann, wenn  
> $$
> \forall x\in A\ \exists! y\in B:\ (x,y)\in R.
> $$  
> für jedes $x$ existiert genau ein $y$ mit $(x,y)\in R$.

---

## 6. Beispiele

> [!definition] Gleichheitsrelation  
> 
> Auf jeder Menge \(A\):  
> $$
> (=)\ :=\{(x,x)\mid x\in A\}
> $$  
> ist eine Äquivalenzrelation.

> [!definition] Kongruenz modulo \(n\)  
> 
> Auf $\mathbb{Z}$: $a\equiv b\pmod n$ definiert durch  
> $$
> a\equiv b\pmod n \iff n \mid (a-b),
> $$  
> ist eine Äquivalenzrelation. Die Klassen sind die Restklassen modulo \(n\).

> [!definition] Teilbarkeitsrelation  
> 
> Auf $\mathbb{N}:$ $(a \mid b)$ ($a$ teilt $b$) ist [[Reflexivität|reflexiv]] und [[Transitivität|transitiv]], aber nicht symmetrisch. Auf $\mathbb{N}\setminus\{0\}$ ist sie [[Antisymmetrie |antisymmetrisch]] (wenn man passende Konventionen annimmt).

> [!definition] ≤ auf Zahlen  
> 
> Die Relation $(\le)$ auf $\mathbb{R}$ ist eine totale Ordnung ([[Reflexivität|reflexiv]], [[Antisymmetrie |antisymmetrisch]], [[Transitivität|transitiv]], total).


---

## 7. Operationen auf Relationen

> [!definition] Vereinigung und Schnitt  
> 
> Für $R,S\subseteq A\times B:$  
> $$
> R\cup S=\{(x,y)\mid (x,y)\in R \lor (x,y)\in S\},
> $$  
> $$
> R\cap S=\{(x,y)\mid (x,y)\in R \land (x,y)\in S\}.
> $$

> [!definition] Komplement (relativ zu $A\times B$)  
> 
> $$
> R^c=(A\times B)\setminus R=\{(x,y)\in A\times B\mid (x,y)\notin R\}.
> $$

> [!definition] Relationale Potenzen 
> 
> $$
> R^0=\mathrm{Id}_A,\quad R^{n+1}=R\circ R^n
> $$


---

## 8. Anwendungen und Bemerkungen

> [!definition] Anwendungen  
> 
> Relationen sind fundamental in der Mathematik und Informatik: Modellierung von Graphen, Datenbankrelationen, Ordnungen und Hierarchien, Typen in Programmiersprachen, Semantik von Programmen, Äquivalenzklassen (z. B. Restklassen) usw.

> [!definition] Hinweise zur Notation  
> 
> - Manche Autoren schreiben $xRy$ anstelle von $(x,y)\in R$.  
> - Achte bei Komposition auf die Reihenfolge: $S\circ R$ bedeutet erst $R$, dann $S$.


---

## 9. Kurze Zusammenfassung (Wichtige Formeln)
> [!definition] Wichtige Formeln  
> 
> $$
> R^{-1}=\{(y,x)\mid (x,y)\in R\}
> $$  
> $$
> S\circ R=\{(x,z)\mid \exists y:\ (x,y)\in R\land (y,z)\in S\}
> $$  
> $$
> R^+ = \bigcup_{n\ge 1} R^n,\qquad R^* = \bigcup_{n\ge 0} R^n
> $$

