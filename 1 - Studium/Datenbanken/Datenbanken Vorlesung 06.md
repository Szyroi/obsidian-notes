#datenbanken/vorlesung 
# 14.05.2024
[[Datenbanken Vorlesung 05_1.pdf]]
[[Datenbanken Vorlesung 05_2.pdf]]
## 05
### ER zu Relationales Schema
#### Beziehungen
0-1:1-1-Beziehungen:
Die 1-1-Seite erhält einen Fremdschlüssel auf den Primärschlüssel der 0-1-Seite 
Wenn beide Bedingt: Anwendungsspezifisch Entscheiden in welche Richtung.
Wenn beide Einfach: Anwendungsspezifisch Entscheiden ob Entities Mergen
![[Datenbanken Relationale 1zu1.png]]

0-n:1-m-Beziehungen:
Relation als eigenes Objekt (Beziehungsrelation) voller Fremdschlüssel
![[Datenbanken Relational n zu m.png]]

0-1:0-n-Beziehungen:
1-Seite erhält Fremdschlüssel zu n-Seite
![[Datenbanken Relational 1 zu n.png]]