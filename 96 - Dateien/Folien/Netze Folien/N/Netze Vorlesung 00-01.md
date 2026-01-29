#netze/vorlesung
# 09.04.2024
[[Vorlesung-01.pdf]]

## Topologieen
- Bus
	- Gerade Linie
	- Keine Knoten (Steuerungszentrale)
	- Vorteile: Einfache verkabelung, Geringe kosten und Ausfall eines Nodes hat keine konsequenzen fürs netz
	- Nachteile: Begrenzt Skalierbar, Leistungsbruch führt zu Netzausfall, Übetragungen können abgehört werden, Aufwendinge Zugriffsmethoden (Wer sendet wann?) 
- Ring
	- Alle Nodes werden mit genau zwei weiteren Nodes zu einem geschlossen ring verbunden
	- Vorteile: Große Neztausdehnung, Geringer Kabelzuwachs
	- Nachteile: Störung eines Nodes führt zu Netzausfall, Aufwendige Fehlersuche (Wo ist der Defekt?), Mehr Nodes verlängert die dauer der Übertragten Nachrichten
- Stern
	- Switch in der Mitte
	- Vorteile: Leichte Fehlersuche, Einfache verkabelung, Keine Störung wenn ein Node ausfällt
	- Nachteil: Singe Point of Failure (SPoF): Neztausfall bei Ausfall oder Überlastung des Knotens
- Mesh
	- Alle Nodes mit einer Vielzahl anderer Nodes direkt verbunden
	- Vollvermaschung: Wenn alle Nodes miteinander verbunden sind 
	- Teilvermaschung: Wenn nicht alle Nodes direkt miteinander verbunden sind
	- Diese Topologie bildet sich z.B bei unkontrollierten bzw. ad-hoc aufgebauten Netzwerke
	- Vorteile: Hohe Ausfallsicherheit und Leistungsfähigkeit
	- Nachteile: Sehr hohe Kosten für Leistungen, Aufwendige Verfahren für die Wegfindung der Daten
- Baum
	- Hierarchish angerordnete Stern-Topologie (Mehrer Sterne zusammen)
	- Vorteile: Der Ausfall eines "Blatts" hat keine Konsequenzen, Gute Struktur für Erweiterung, Große Entfernung realisierbar
	- Nachteile: Bei Ausfall eines Zentralen Knotens ist der Ganze "Ast" betroffen, Lange Dauer für Nachrichtenübermittelung bei sehr tiefen Bäumen, Skalierbarkeit ist definiert durch die Wurzel Knoten


Kommunikationsfluss
- Unicast
- Broadcast
- Multicast
- Anycast
	- Multicast aber es reicht wenn eines der Ziele das Paket erhält
## 01
Standartisierung
durch Gremien (ISO, IEEE, ITU-T, IETF, W3C)

Idee des OSI-Modell
