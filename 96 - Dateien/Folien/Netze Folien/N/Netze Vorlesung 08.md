#netze/vorlesung 
# 28.5.2024
[[Netze Vorlesung 08.pdf]]
## 08
### Grundlagen TCP/UDP
#### Zwischenfazit
![[Netze OSI vs TCP vs Lecture.png]]
- 1: Physical Layer
	- Physische Übertragung der Daten
	- Umwandelung bits in Elektrische/Optische/Elektromagnetische Signale
- 2: Data Link Layer
	- Lokale Zustellung von Frames im gleichen Netzwerk
	- MAC-Addresse
	- Ethernet-Frames
- 3: Nework Layer
	- IP
	- Übertragung von Paketen zwischen Nodes in unterschiedlichen Netzwerken
	- Absender kennt nur Addresse des Empfängers
	- Netzwerk findet Weg selbstständig (Routing)
- 4: Transport Layer
	- Ende-zu-Ende Kommunikation zwischen Prozessen auf Nodes
	- Segmentierung
	- Ports
	- TCP/UDP (/QUIC)
#### Einführung
Zwei Zentrale Internet-Transportprotokolle

Transmission Control Protocol (TCP)
- Verbindungsorientiert
- Zuverlässige Übertragung
- Korrekte Reihenfolge
- Flusskontrolle (Flow Control)
- Überlastungskontrolle (Congestion Control)

User Datagram Protocol (UDP)
- Verbindungslos
- Best-Effort (wie IP)

#### Ports
TCP/UDP-Pakete sind für bestimmte Applikationen auf Geräten
Welche Applikation wird bestimmt über Ports

Wichtiger Bestandteil des Multiplexen/Demultiplexen bei Sender und Empfänger (Mehrere Verbindungen auf einem Kanal/Kabel)

Prozesse verwenden "Sockets" zum Senden/Empfangen von Daten
Multiplexing beim Sender: Transportschicht-Header (mit Port)
Demultiplexing beim Empfänger: Auslesen Transportschicht-Header um korrekte Socket/Prozess zu finden

Verbindungslos (UDP):
- Empfänger verwendet nur Zielportnummer zum Socket finden

Verbindungsorientiert (TCP):
- Empfänger verwendet 4-tupel zum Socket finden
	- Quell-IP, Quellport, Ziel-IP, Zielport
- Effekt: Es kann mehrere Sockets auf dem gleichen Port geben

Ports 0-1023 sind für gängige anwendungen reserviert ("Well-Known Ports")

#### UDP
Verbindungslos und nicht Zuverlässig
Segmente können verloren gehen oder in falscher Reihenfolge zum Prozess gelangen
Kein Handshake
keine abhängigkeit zwischen individuellen UDP-Segmenten

Vorteile:
- Keine Start-Latenz durch Verbindungsaufbau
- Einfach, kein speichern von State nötig
- Kleiner Overhead wegen kleinem Paket-Header

Beispielanwendungen
- Media Streaming
	- Verlorene Segmente sind Ok
- Gaming
	- Primär bei Spielen wo Reaktionszeit sehr wichtig ist
