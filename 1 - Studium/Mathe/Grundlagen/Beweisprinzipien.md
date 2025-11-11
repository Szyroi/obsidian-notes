


---

## 1️⃣ Direkter Beweis

### Idee
Man zeigt die Wahrheit einer Implikation  
> „Wenn A, dann B“  
direkt durch logisches Schließen von den Voraussetzungen (A) auf die Behauptung (B).

### Vorgehensweise
1. Setze die Voraussetzungen (A) voraus.  
2. Verwende Definitionen, bekannte Sätze und logische Schlüsse.  
3. Leite die Behauptung (B) ab.

### Beispiel
> **Behauptung:** Ist \( n \) gerade, dann ist \( n^2 \) gerade.  
> **Beweis:**  
> Sei \( n = 2k \) mit \( k \in \mathbb{Z} \).  
> Dann ist \( n^2 = (2k)^2 = 4k^2 = 2(2k^2) \).  
> Also ist \( n^2 \) gerade. ■

---

## 2️⃣ Beweis durch Kontraposition

### Idee
Anstatt „Wenn A, dann B“ direkt zu zeigen, beweist man die **kontrapositive Aussage**:  
> „Wenn nicht B, dann nicht A“.

Beide Aussagen sind **logisch äquivalent**.

### Vorgehensweise
1. Formuliere die Kontraposition:  
   \( A \Rightarrow B \) ⇔ \( \neg B \Rightarrow \neg A \)  
2. Beweise die kontrapositive Aussage.

### Beispiel
> **Behauptung:** Wenn \( n^2 \) ungerade ist, dann ist \( n \) ungerade.  
> **Kontraposition:** Wenn \( n \) gerade ist, dann ist \( n^2 \) gerade.  
> **Beweis:**  
> Sei \( n = 2k \). Dann \( n^2 = 4k^2 = 2(2k^2) \), also gerade.  
> Damit ist auch die ursprüngliche Behauptung bewiesen. ■

---

## 3️⃣ Widerspruchsbeweis

### Idee
Man nimmt das **Gegenteil** der zu beweisenden Aussage an und zeigt, dass daraus ein **logischer Widerspruch** folgt.

### Vorgehensweise
1. Nimm an, die Behauptung sei falsch.  
2. Leite daraus eine unmögliche oder widersprüchliche Aussage ab.  
3. Schließe daraus, dass die ursprüngliche Behauptung wahr sein muss.

### Beispiel
> **Behauptung:** \( \sqrt{2} \) ist irrational.  
> **Beweis:**  
> Angenommen, \( \sqrt{2} \) ist rational ⇒ \( \sqrt{2} = \frac{p}{q} \) mit teilerfremden \( p, q \in \mathbb{Z} \).  
> Dann \( 2q^2 = p^2 \).  
> ⇒ \( p^2 \) ist gerade ⇒ \( p \) ist gerade ⇒ \( p = 2k \).  
> ⇒ \( 2q^2 = 4k^2 \Rightarrow q^2 = 2k^2 \) ⇒ \( q \) gerade.  
> Widerspruch, da \( p, q \) beide gerade ⇒ nicht teilerfremd.  
> Also ist \( \sqrt{2} \) irrational. ■

---

## 4️⃣ Vollständige Induktion

### Idee
Verwendet man für Aussagen über natürliche Zahlen.  
Man zeigt, dass eine Aussage für alle \( n \in \mathbb{N} \) gilt, indem man sie zuerst für den Anfangswert beweist und dann zeigt, dass ihre Gültigkeit für \( n \) auch die Gültigkeit für \( n+1 \) impliziert.

### Vorgehensweise
1. **Induktionsanfang (IA):** Zeige, dass die Aussage für \( n = n_0 \) gilt.  
2. **Induktionsvoraussetzung (IV):** Nimm an, sie gilt für ein beliebiges \( n \).  
3. **Induktionsschritt (IS):** Zeige, dass daraus folgt, dass sie auch für \( n + 1 \) gilt.  
4. **Schluss:** Damit gilt die Aussage für alle \( n \ge n_0 \).

### Beispiel
> **Behauptung:** Für alle \( n \in \mathbb{N} \) gilt  
> \( 1 + 2 + \dots + n = \frac{n(n+1)}{2} \).  
>
> **IA:** Für \( n=1 \): \( 1 = \frac{1(1+1)}{2} = 1 \). ✔️  
>
> **IV:** Angenommen, die Formel gilt für \( n \).  
> **IS:** Dann gilt für \( n+1 \):  
> \( 1 + 2 + \dots + n + (n+1) = \frac{n(n+1)}{2} + (n+1) = \frac{(n+1)(n+2)}{2} \).  
> ✔️  
>
> Also gilt die Behauptung für alle \( n \in \mathbb{N} \). ■

---

## 🧩 Vergleich der Beweisprinzipien

| Prinzip | Typische Anwendung | Vorgehensweise | Beispiel |
|----------|-------------------|----------------|-----------|
| Direkter Beweis | Logische Implikationen | Von A zu B schließen | „Gerade → Quadrat gerade“ |
| Kontraposition | Wenn Negation einfacher ist | „Nicht B ⇒ Nicht A“ | „Wenn \( n^2 \) ungerade → \( n \) ungerade“ |
| Widerspruch | Beweis durch Unmöglichkeit | Angenommen Gegenteil → Widerspruch | „√2 irrational“ |
| Induktion | Aussagen über ℕ | Anfang + Schritt | Summenformel |

---

**📘 Merksatz:**  
> Jeder mathematische Beweis basiert auf logischer Folgerichtigkeit — das gewählte Prinzip hängt von der Struktur der Aussage ab.
