#netze/übung
# 01
[[Netze Übung 01.pdf]]
## 1.1
Topologieen

Vollvermaschtes Netz
Jeder Knoten ist zu Jedem Verbunden
Teuer, Schwer zu ändern, Sehr Ausfallresistent, Schnell

Teilvermaschtes Netz
Alle knoten sind zu einigen Verbunden
Mittelteuer, Mittelschwer zu Ändern, Medium Ausfallresistent, Relativ schnell

Bus
Alle Knoten liegen an einer gemeinsamen Verbindung
Sehr Günstig, Leicht zu ändern, Wenig Ausfallresistent, Sehr Langsam

Stern
Alle Knoten sind zu einem Hauptknoten Verbunden
Günstig, Leicht zu Ändern, Wenig Ausfallresistent, Mittelschnell

Baum
Teilvermaschtes Netz Ohne Kreise
Relativ Günstig, Leicht zu Ändern, Wenig Ausfallresistent, Mittelschnell

Einfacher, Gerichteter Ring
Kanten sind in einem gerichteten Ring verbunden
Sehr Günstig, Relativ leicht zu ändern, Nicht Ausfallresistent, Sehr Langsam

Doppelter, Gegenläufiger Ring
Kanten sind durch zwei Gegengesetzte Gerichtete Ringe verbunden
Relativ Günstig, Mittelschwer zu ändern, Wenig Ausfallresistent, Relativ Langsam
## 1.2
### 1.2.a)
Grundidee des OSI-Modells
Abkapseln der verschiedenen Ebenen eines Protokolls um die Komplexität von jedem einzelnen Teil zu reduzieren
### 1.2.b)
Ein Offenes Netz laut OSI-Modell
Offene Schnittstelle:
- herstellerunabhängig
- architekturunabhängig
- netzunabhängig
## 1.3
---- philosophen übersetzung bullshit
## 1.4
7 Schichten des OSI-Referenzmodells
- 7: Anwendungsschicht / Aplication Layer
- 6: Darstellungsschicht / Presentation Layer
- 5: Sitzungsschicht / Session Layer
- 4: Transportschicht / Transport Layer
	- TCP / UDP
- 3: Vermittlungsschicht / Network Layer
	- IPv4, IPv6
- 2: Sicherungsschicht / Data Link Layer
	- MAC, Ethernet-Frame
- 1: Bitübertragungsschicht / Physical Layer
	- Bits auf Medium abbilden
## 1.5
a) Falsch, keine Referenzimplementierungen
b) Wahr, mit niedrigeren schichten kann nicht direkt interagiert werden
c) Falsch, die kommunkiation funktioniert über kapsulieren in den niedrigeren Schichten
d) Falsch
e) Falsch
f) Falsch, RFCs sind ein genereller Begriff aus vielen Bereichen und in vielen Firmen
g) Falsch, Request for Comment
h) Falsch, Das OSI-Modell beschreibt nicht selbst das konkrete Verhalten der Protokolle/Dienste
i) Wahr
j) ? Das OSI-Modell beschreibt nicht selbst die Physischen Eigenschaften der Medien, sondern wie sie für die Bitübertragung genutzt werden.
k) Wahr
l) Falsch, Schicht 2 übernimmt nur die Lokale Addressierung von benachtbarten Systemen. Ende-zu-Ende-Adressierung wird durch IP-Addressen auf Schicht 3 übernommen
m) Falsch, Schicht 3 (Primär IPv4/IPv6) garantiert nicht die Zuverlässigkeit von Verbindungen
n) Wahr, Schichten 5,6,7 werden meist direkt durch Applikationen übernommen und werden auch als "Application Layer" zusammengefasst
o) Falsch, der (N-1)-SAP *(Nicht N)* erlaubt Schicht N das Nutzen von Diensten der Schicht (N-1)
![[Netze SAP.png]]
p) Wahr, z.B. LAN-Karte
q) Wahr
r) Wahr(?), (N)-PDU = Daten im Format eines Protokolls der Schicht (N)
- Schicht N kommuniziert, in dem es Daten im Format eines Protokolls der Schicht N sendet
s) ?
t) Wahr, siehe Graph oben
u) Falsch, Protokolle werden strikt definiert inkl "Syntax, Semantik und Timing"
