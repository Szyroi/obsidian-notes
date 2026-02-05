#datenbanken/vorlesung 
# 21.5.2024
[[Datenbanken Vorlesung 07.pdf]]
## 07
Logisches Schema -> Datenbankschema (SQL)

Verwendung der Datendefinitionssprache (DDL) von SQL
### Datenbankmodell
Systemspezifische Darstellung für konkretes Datenbanksystem
Normalerweise durch Textuelle Sprache wie SQL

Oft ist die Ableitung aus einem Logischen Modell (teilweise) automatisiert möglich.

Arten von Datenbanksprachen
- Hierarchische Datenbanksprachen
- Netzwerk Datenbanksprachen
- **Relationale Datenbanksprachen** (Am Relevantesten)
- Objektorientierte Datenbanksprachen
- NoSQL

#### Views
*AKA Sichten*
Scheinbare (virtuelle) Relationen (entitätstypen)
Erlauben automatisches Zusammensetzen von den vielen kleinen Relationen welche aus der Normalisierung folgen.
Auch andere transformationen möglich.

Machen Anwendungen weniger von der konkreten Datenbankstruktur abhängig
(Datenunabhängigkeit)