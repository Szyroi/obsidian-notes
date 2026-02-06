---
type: konzept
modul: Mathematische Grundlagen und Lineare Algebra
tags: [aussagenlogik, formeln, grundlagen, klausur]
klausur: true
---

# Aussagenlogische Formeln

## 0.1 Aufbau
Aussagenlogische Formeln bestehen aus:  
- **Variablen:** A, B, C, … oder p, q, r …  
  → nehmen Werte **wahr (1)** oder **falsch (0)** an  
- **Operatoren (Junktoren):**  
  - ∧ : logisches **UND**  
  - ∨ : logisches **ODER**  
  - ⊕ : exklusives ODER (XOR)  
  - ¬ : **Negation**  
  - → , ⇒ : **Subjunktion / Implikation** („A ⇒ B“)  
  - ↔ , ⇔ : **Bijunktion / Äquivalenz** („A ⇔ B“)  

**Hinweis:** Runde Klammern dienen der Strukturierung.

---

## 0.2 Rechenregeln

### Idempotenz
- p ∨ p ⇔ p  
- p ∧ p ⇔ p

### Doppelnegation
- ¬(¬p) ⇔ p

### Tautologien
- 1 ∨ p ⇔ 1  
- p ∨ ¬p ⇔ 1

### Unerfüllbarkeit
- 0 ∧ p ⇔ 0  
- p ∧ ¬p ⇔ 0

### Absorption
- 0 ∨ p ⇔ p  
- 1 ∧ p ⇔ p

### Kommutativität
- p ∨ q ⇔ q ∨ p  
- p ∧ q ⇔ q ∧ p

### Assoziativität
- (p ∨ q) ∨ r ⇔ p ∨ (q ∨ r)  
- (p ∧ q) ∧ r ⇔ p ∧ (q ∧ r)

### Distributivität
- p ∨ (q ∧ r) ⇔ (p ∨ q) ∧ (p ∨ r)  
- p ∧ (q ∨ r) ⇔ (p ∧ q) ∨ (p ∧ r)

### de Morgan
- ¬(p ∨ q) ⇔ ¬p ∧ ¬q  
- ¬(p ∧ q) ⇔ ¬p ∨ ¬q

### Subjunktion / Implikation
- p ⇒ q ⇔ ¬p ∨ q  
- Kontraposition: ¬q ⇒ ¬p

### Bijunktion / Äquivalenz
- p ⇔ q ⇔ (p ⇒ q) ∧ (q ⇒ p)  
- Alternative Schreibweise: p ⇐ q statt q ⇒ p

---



