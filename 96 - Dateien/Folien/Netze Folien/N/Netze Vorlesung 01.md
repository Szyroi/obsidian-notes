#netze/vorlesung

[[Vorlesung-01.pdf]]

## Grundbegriffe
- Node: **Nodes** sind physikalisch vorhandene (generische) aktive Komponenten in einem Netzwerk (bspw. Host, Client, Server, ...).

- Links (Verbindugen): **Links** sind physikalische Verbindungen bspw. durch Leitungen/Kabel oder Funkstrecken.

- Host: Ein **Host** ist ein Node ohne Weiterleitungs- funktion. Ein Host ist ein Endsystem, auf dem eine Netzwerkanwendung läuft (bspw. ein Cli- ent oder ein Server).

- Knoten: Ein **Knoten** ist ein Node. Der Knoten dient als Verzweiger in einem Kommunikationsnetzwerk, an dem mehrere Verbindungen zusammenlaufen (Router, Switch, Access Point).

- Client: Ein **Client** kann einen Dienst bei einem Server anfordern, der diesen Dienst bereitstellt. Ein Cli- ent ist ein Endgerät oder auch nur eine Software- Komponente auf einem Endgerät.

- Server: Ein **Server** ist ein Programm (Prozess) oder ein Computer, der mit einem Client, kommuniziert, um ihm Zugang zu einem Dienst zu verschaffen.

- Dienst: Ein Netzwerk-**Dienst** ist eine abstrahierte Funkti- on, die von einem Computernetzwerk den Anwen- dern bzw. teilnehmenden Geräten bereitgestellt wird.

- Router: Ein **Router** ist ein Knoten, der Pakete zwischen Netzwerken weiterleitet.

- Switch: Ein **Switch** ist ein Knoten, der Pakete innerhalb ei- nes einzelnen Netzwerkes weiterleitet.


## Topologieen

Definition: Die Netzwerk-**Topologie** definiert die Struktur, wie einzelne Nodes eines Netzwerks angeordnet und über Links physisch miteinander verbunden werden.

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


## Ausprägungen von Netze
- Personal Area Network (PANs)
	- In **Personal Area Networks (PANs)** kommunizieren Geräte über die ungefähre Reichweite einer Person.
	- Beispiele: Bluetooth (Kopfhörer), USB (Monitor, Keyboard, Maus)
- Local Area Network (LAN)
	- Ein **Local Area Network (LAN)** ist ein privates Netzwerk, das innerhalb und in der Nähe eines einzelnen Gebäudes wie einem Haus, einem Büro oder einer Fabrik operiert. Auch Campus-Netzwerke sind in der Regel LANs
	- Beispiele: Ethernet (IEEE 802.3), WLAN (IEEE 802.11)
- Metropolitan Area Network (MAN)
	- Ein **Metropolitan Area Network (MAN)** operiert in einer Stadt/Region.
	- Beispiele: Die Verbindung von verschiedenen Firmengebäuden mit dedizierten Kabeln oder per Richtfunk, Kabel-TV Provider mit einem Einspeisepunkt in der Stadt
- Wide Area Network (WAN)
	- Ein **Wide Area Network (WAN)** erstreckt sich über ein großes geografisches Gebiet, oft über ein Land oder einen Kontinent
	- Oft Zusammenschluss von mehreren Netzwerken


## ISO/OSI
### Application Oriented
- **Layer 7 bis 5 werden hier im Kurs als Application Layer zusammengefasst**
- **Zusammenfassung: Verschafft Anwendungen Zugriff auf das Kommunikationsnetz**
- **Verantwortlich für Data Stream Message**
- ### Application Layer 7
	- Interaktion mit Daten des Benutzers 
	- Client Software ist nicht Teil der Schicht
- ### Presentation Layer 6
	- Übersetzt Daten in ein Format und eine Syntax, die für andere Computer lesbar sind
	- Konvertiert ggf. verschiedene Repräsentationen der Daten
- ### Session Layer 5
	- Initiierung, Verwaltung und Terminierung der Verbindungen zwischen einer lokalen und entfernten Applikation
	- Kann Checkpoints verwalten, um eine abgebrochene Verbindung wieder nutzbar zu machen
---
### Transport Oriented
- ### Transport Layer 4
	- Ende-zu-Ende Kommunikation zwischen Prozessen auf Nodes 
	- Die Adressierung ist ein Port auf einem Node 
	- Verschiedene Prozesse können unterschiedliche Ports nutzen 
	- Bietet der **Anwendungsschicht** einen einheitlichen und vereinfachten Zugriff auf das Netz 
	- Zerlegung und Wiederzusammenführung der Daten in Segmente (engl. Segments) 
	- Flusssteuerung (engl. flow control): Der Sender überfordert nicht den Empfänger 
	- Stauvermeidung (engl. congestion control): Die Knoten im Netzwerk werden nicht überlastet 
	- Fehlererkennung: Fehlerhafte Daten werden erkannt und geeignet behandelt
	- Protokolle (bspw.): TCP, UDP, QUIC
- ### Network Layer 3
	- Übertragung/Weiterleitung von Paketen/Datagrammen zwischen Nodes in **unterschiedlichen** Netzwerken. 
	- Knoten (hier Router) leiten Pakete zwischen zwei Netzwerken weiter. 
	- Das Netzwerk findet den Weg selbstständig (Routing). 
	- Der Absender kennt nur die Adresse des Empfängers.
	- Protokolle (bspw.): IP
- ### Data Link Layer 2
	- Lokale Zustellung von Rahmen (engl. Frames) zwischen Nodes im gleichen Netzwerk. 
	- Knoten (hier Switche) leiten Pakete zwischen Nodes weiter. 
	- Gewährleistung einer weitestgehend fehlerfreien Übertragung auf dem physikalischen Medium (häufig). 
	- Zugriff auf das Übertragungsmedium regeln. 
	- Die Adressierung ist eine MAC-Adresse der Netzwerkkarte.
	- Protokolle (bspw.): Ethernet, Point-to-Point-Protocol (PPP), Wireless Local Area Network (WLAN)
- ### Physical Layer 1