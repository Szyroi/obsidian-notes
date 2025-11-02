## **Definitionen der Grammatik**

---

> [!definition] Definition: Alphabet
> Ein Alphabet ist eine endliche nicht leere Menge $\sum = \{{a_{1},\dots,a_{n}\}}$ von Symbolen


> [!definition] Definition: Wort
> Ein Wort $\omega$ ist eine endliche Sequenz von Symbolen aus dem gewählten Alphabet $\sum$


> [!definition] Definition: Menge aller Wörter
> Die Menge aller Wörter über einem Alphabet $\sum$ (Bezeichnung: $\sum^{*}$) ist induktiv definiert durch:
> 1. $\epsilon \in \sum^{*}$ (leeres Wort)
> 2.  $\text{a}\in \sum \implies \text{a} \in \sum^{*}$ (einzelne Symbole sind Wörter)
> 3. $x,y \in \sum^{*} \implies yx \in \sum^{*}$ (zusammengesetzte Wörter)


> [!definition] Definition: Länge eines Wortes
> Die Länge eines Wortes $\omega \in \sum^{*}$ (Anzahl der Symbole) bezeichnet man mit $|\omega|$


> [!definition] Definition: Formale Sprachen
> Sei $\sum$ ein Alphabet. $L \subseteq \sum^{*}$ heißt formale Sprache über $\sum$

---
## Grammatiken in der Theoretischen Informatik

Eine formale Grammatik \( G \) ist ein Tupel
\[
G = (\Sigma, N, P, S)
\]
mit
- \(\Sigma\): Alphabet (Terminalsymbole)
- \(N\): Menge der Nichtterminalsymbole
- \(P\): Menge der Produktionsregeln
- \(S \in N\): Startsymbol 

## Chomsky-Hierarchie der Grammatiken

| Typ  | Eigenschaften                      | Produktionsregeln-Beispiel                       | erzeugte Sprache      |          |                           |
| ---- | ---------------------------------- | ------------------------------------------------ | --------------------- | -------- | ------------------------- |
| Typ0 | Allgemeine Grammatiken             | \( \alpha \to \beta \) (beliebig)                | rekursiv aufzählbar   |          |                           |
| Typ1 | Kontextsensitiv                    | \( \alpha A \beta \to \alpha \gamma \beta \), \( | \gamma                | \geq 1\) | kontextsensitive Sprachen |
| Typ2 | Kontextfrei                        | \( A \to \gamma \)                               | kontextfreie Sprachen |          |                           |
| Typ3 | Regulär (rechts- oder linkslinear) | \( A \to aB \) oder \( A \to a \)                | reguläre Sprachen     |          |                           |

## Beispiel einer regulären Grammatik:

\[
\begin{cases}
S \to aA \mid bB \\
A \to bA \mid a \\
B \to aB \mid b
\end{cases}
\]

Mögliche Wörter sind z.B. \(aba\), \(bab\), \(abbbbbba\), \(baaaab\).

---

## Wichtige LaTeX-Mathe-Symbole in Obsidian

- Konjunktion (UND): \(\land\) — `$\\land$`
- Disjunktion (ODER): \(\lor\) — `$\\lor$`
- Negation (NICHT): \(\neg\) — `$\\neg$`
- Implikation: \(\to\) — `$\\to$`
- Äquivalenz: \(\leftrightarrow\) — `$\\leftrightarrow$`
- Allquantor: \(\forall\) — `$\\forall$`
- Existenzquantor: \(\exists\) — `$\\exists$`

Zum Einfügen von Formeln in Obsidian:
- Inline-Mathe: `$ ... $`
- Block-Mathe: `$$ ... $$`

---

