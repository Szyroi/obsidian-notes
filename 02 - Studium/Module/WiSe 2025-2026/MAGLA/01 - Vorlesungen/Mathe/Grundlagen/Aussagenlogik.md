
## 🧠 Grundidee
Die **Aussagenlogik** befasst sich mit **Aussagen**, die entweder **wahr (W)** oder **falsch (F)** sind, sowie mit **logischen Verknüpfungen** zwischen diesen Aussagen.  
Ziel ist es, komplexe Aussagen formal zu analysieren und ihre Wahrheitswerte zu bestimmen.

---

## 🔹 Aussagen

Eine **Aussage** ist ein Satz, der **entweder wahr oder falsch** ist.

**Beispiele:**
- „3 ist eine Primzahl.“ ✅ → wahr  
- „5 ist gerade.“ ❌ → falsch  
- „$x > 2$” → **keine Aussage**, da der Wahrheitswert von $x$ abhängt.

---

## 🔸 Aussagevariablen

Aussagen werden meist mit Buchstaben bezeichnet:

$$
A, B, C, p, q, r, \dots
$$

**Beispiel:**
$$
p: \text{„Es regnet.“}, \quad q: \text{„Ich nehme einen Schirm mit.“}
$$

---

## ⚙️ Logische Verknüpfungen

|        Symbol         | Name        | Bedeutung              | Wahrheit                                       |
| :-------------------: | :---------- | :--------------------- | :--------------------------------------------- |
|       $\neg A$        | Negation    | „nicht A“              | kehrt den Wahrheitswert um                     |
|      $A \land B$      | Konjunktion | „A und B“              | wahr nur, wenn beide wahr                      |
|      $A \lor B$       | Disjunktion | „A oder B“ (inklusiv)  | falsch nur, wenn beide falsch                  |
|   $A \Rightarrow B$   | Implikation | „Wenn A, dann B“       | falsch nur, wenn A wahr und B falsch           |
| $A \Leftrightarrow B$ | Äquivalenz  | „A genau dann, wenn B“ | wahr, wenn beide denselben Wahrheitswert haben |

---

## 🧮 Wahrheitstabellen

### Beispiel: Implikation $A \Rightarrow B$

| $A$ | $B$ | $A \Rightarrow B$ |
| :-: | :-: | :---------------: |
|  W  |  W  |         W         |
|  W  |  F  |         F         |
|  F  |  W  |         W         |
|  F  |  F  |         W         |

👉 Nur **falsch**, wenn $A$ wahr und $B$ falsch.

---

## 🧱 Logische Gesetze (Äquivalenzen)

| Gesetz                |                                                       Formel                                                       |
| :-------------------- | :----------------------------------------------------------------------------------------------------------------: |
| **Doppelte Negation** |                                          $\neg(\neg A) \Leftrightarrow A$                                          |
| **Kommutativgesetz**  |                                       $A \land B \Leftrightarrow B \land A$                                        |
| **Distributivgesetz** |                         $A \land (B \lor C) \Leftrightarrow (A \land B) \lor (A \land C)$                          |
| **De Morgan**         | $\neg(A \land B) \Leftrightarrow (\neg A \lor \neg B)$ <br> $\neg(A \lor B) \Leftrightarrow (\neg A \land \neg B)$ |
| **Implikation**       |                                 $A \Rightarrow B \Leftrightarrow (\neg A \lor B)$                                  |
| **Äquivalenz**        |                  $A \Leftrightarrow B \Leftrightarrow (A \Rightarrow B) \land (B \Rightarrow A)$                   |

---

## 🧩 Tautologie, Kontradiktion & Kontingenz

| Begriff           | Definition                       | Beispiel          |
| :---------------- | :------------------------------- | :---------------- |
| **Tautologie**    | Immer wahr                       | $A \lor \neg A$   |
| **Kontradiktion** | Immer falsch                     | $A \land \neg A$  |
| **Kontingenz**    | Je nach A und B wahr oder falsch | $A \Rightarrow B$ |

---

## 🔍 Beweise in der Aussagenlogik

Beweise in der Mathematik beruhen auf logischen Gesetzen.  
Die Aussagenlogik ist die Grundlage für Beweisprinzipien wie:
- **Direkter Beweis**
- **Kontraposition**
- **Widerspruchsbeweis**
- **Induktion**

**Beispiel (logische Form):**
$$
\text{gerade}(n) \Rightarrow \text{gerade}(n^2)
$$
**Beweisidee:**  
Aus  $n = 2k \Rightarrow n^2 = 4k^2 = 2(2k^2) \Rightarrow \text{gerade}$

---

## 🧠 Anwendungen

- Formales Schließen in der Mathematik  
- Digitale Schaltungen (Logikgatter)  
- Programmverifikation  
- Künstliche Intelligenz / Logikprogrammierung  

---

## 🗂️ Zusammenfassung

| Konzept       | Symbol                | Bedeutung            |
| ------------- | --------------------- | -------------------- |
| Negation      | $\neg A$              | Nicht A              |
| Konjunktion   | $A \land B$           | A und B              |
| Disjunktion   | $A \lor B$            | A oder B             |
| Implikation   | $A \Rightarrow B$     | Wenn A, dann B       |
| Äquivalenz    | $A \Leftrightarrow B$ | A genau dann, wenn B |
| Tautologie    | —                     | Immer wahr           |
| Kontradiktion | —                     | Immer falsch         |

---

