#netze/vorlesung 
# 14.05.2024
[[Netze Vorlesung 06.pdf]]
## 05
### LAN-Komponenten
Hierarchische Netzstrukturen - Welche Komponente ist wo als Verbindungsknoten geeignet?
#### Repeater
Arbeitet auf OSI-Schicht 1 (Signal)
Taktgerechte Signalregenerierung.

Kollosionen werden nicht begrenzt.
Redundante Signalverbindung zwischen zwei Repeatern ist nicht möglich
- Kreisförmig -> Pakete laufen für immer im Kreis zwischen den Repeatern 
#### Switch
*AKA Bridge*
- Historischer Begriff, primär zum Verbinden verschiedener Technologieen (2 Ports)
Arbeitet auf OSI-Schicht 2 (MAC)
Teilt Netz in mehrere Teile (Kollisionsdomäne) auf.

Filtert Ungültige Frames raus (CRC-Prüfsumme)
Merkmale von Switches
- Viele Ports
- Hohe Leistung
- VLAN-Support
- Store-And-Forward / Cut-Through Switching
- Microsegmentierung
	- Einzelne Station an einen Switchport Verbinden
	- Keine Kollisionen möglich (falls Vollduplex = eine Leitung pro Richtung)

Pakete werden immer nur an das Netz gesendet, in dem der Zielrechner ist (Frame Filtering)
-> Addresstabelle
- Beim Erhalt von Frames wird Quell-IP und Quell-Netz in Addresstabelle Vermerkt
- Beim Senden wird in der Addresstabelle nach Ziel-IP gesucht
	- Wenn nicht gefunden, wird Paket in alle Netze gesendet

Für Angeschlossene Stationen ist der Switch transparent
**Broadcast und Multicast werden immer Weitergeleitet**

Redundante Verbindung zwischen zwei Switches ist möglich
- aber Ports der redundanten Verbindung muss im Switch Deaktiviert werden
	- Spanning Tree Protocol
		- Unterdrücken von Schleifen durch deaktivierung von Ports bis das Netzwerk eine Baumstruktur hat
#### VLAN
Virtuelles LAN, auf logischer ebene Definiert
Jedes VLAN benötigt eigenen IP-Addressbereich

Jedes VLAN
- hat eigene Broadcast-Domäne
- verhält sich so, als wären alle geräte mit einem Switch verbunden

Kommunikation zwischen VLANs ist nur über einen Router möglich

Verwendungszwecke
- Flexibilität bei Integration von Endgeräten
- Priorisierung von Datenverkehr
- Sicherheit

Portbasierte VLANs
Zur Kommunikation zwischen VLANs: Router an Switch-Ports für verschiedene VLANs anschließen

Tagged VLANs
Frames werden Markiert mit Info, zu welchem VLAN sie gehören
Neue 4 Byte im Ethernet-Frame zwischen MAC und Typenfeld