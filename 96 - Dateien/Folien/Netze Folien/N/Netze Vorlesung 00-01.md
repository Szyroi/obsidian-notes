#netze/vorlesung
# 09.04.2024
[[Netze Vorlesung 00.pdf]]
[[Netze Vorlesung 01.pdf]] bis S.13
## 00
Topologieen von Netzen
- Bus
	- Gerade Linie
	- Keine Knoten (Steuerungszentrale)
	- Vorteile: Einfache verkabelung, Geringe kosten und Ausfall eines Nodes hat keine konsequenzen fürs netz
	- Nachteile: Begrenzt Skalierbar, Leistungsbruch führt zu Netzausfall, Übetragungen können abgehört werden, Aufwendinge Zugriffsmethoden (Wer sendet wann?) 
- Stern
	- Switch in der Mitte
	- Vorteile: Leichte Fehlersuche, Einfache verkabelung, Keine Störung wenn ein Node ausfällt
	- Nachteil: Singe Point of Failure (SPoF): Neztausfall bei Ausfall oder Überlastung des Knotens
- Mesh
	- Alle Nodes mit einer Vielzahl anderer Nodes direkt verbund
- Baum
- Vollvermascht
- Teilvermascht
- Einfacher gerichteter Ring
	- Token Ring System
- Doppelter gegenläufiger Ring
	- Wie 2 Ringe in verschiedene Richtungen
- Hierarchnisches Netz
	- Sterntopologie aber Mitte ist in mehrere Geräte geteilt

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
