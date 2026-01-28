#netze/vorlesung 
# 25.6.2024
[[Netze Vorlesung 12.pdf]]
## 12
QUIC

Durch die Abstraktion der Schichten voneinander, können Obere schichten untere nicht beeinflussen -> Optimierungen nicht möglich, unnötiger Overhead 

Großteil des Internetverkehrs besteht aus
- HTTP + TLS + TCP + IP
Idee: Durch Kombination von Protokollen kann Performance verbessert werden

### QUIC
QUIC ersetzt TCP und TLS

Bietet gleiche Services wie TCP
- Zuverlässigkeit, Flow Control, Congestion Control
und zusätzlich
- Authentifizierung, Verschlüsselung

Aber
- QUIC läuft in der Anwendung (user-space) nicht im Betriebssystem (kernel space)
- QUIC nutzt UDP zur Übertragung

UDP erlaubt der Anwendung mehr Kontrolle über Pakete
- Auf UDP aufbauen erlaubt direkten Support ohne Updates zur Unterstützung auf Routern, Firewalls, ...
QUIC implementiert Zuverlässigkeit über Bibliothek anstatt es dem Betriebssystem zu Überlassen
- Erlaubt Anwendungen, QUIC zu integrieren ohne sich auf Updates vom Betriebssystem zu verlassen

TLS kann Key Exchange erst *nach* dem TCP-Handshake beginnen
QUIC-Handshake vereinigt beides und Reduziert Latenz beim Verbindungsaufbau

QUIC verwendet Verbindungs-IDs um Verbindung wieder aufzunehmen
- Auch bei Änderung der IP, z.B. Client wechselt von WiFi zu 4G/5G
- TCP hätte Timeout und Neuaufbau
![[Netze QUIC Header.png]]
### Autokonfiguration
Netzwerkgeräte benötigen eine Konfiguration
- IP-Addressen
- Default-Router (Default-Gateway)
- DNS-Server-IP
Manuelle Konfiguration ist unpraktisch

Autokonfiguration
Bei IPv4:
- DHCP(v4) (Dynamic Host Configuration Protocol)
	- Client fragt Konfiguration an und DHCP-Server sendet Konfiguration an Client
bei IPv6:
- SLAAC (Stateless Address Autoconfiguration)
	- Client generiert IPv6-Addresse eigenständig
	- Kein Server benötigt
- DHCPv6
	- DHCP für IPv6
- Beide werden in Kombination verwendet
#### DHCPv4
DHCP Client-Dienst fragt Konfiguration an
DHCP Server stellt auf Anfrage Information bereit (minimum):
- IP-Addresse
- Subnetzmaske
- Standard-Gateway-Addresse
IP-Addressen meist aus Pool vergeben
Mehrere Anfragen des selben Clients führt normalerweise zur Vergabe der gleichen Addresse

![[Netze DHCP.png]]
- Discover
	- Lokaler Broadcast (255.255.255.255) Mit Quelle 0.0.0.0
- Offer
	- Mögliche IP-Addresse, Gültigkeitsdauer, Maske, IP des DHCP-Servers
- Request
	- Broadcast, Client fordert eine der IP-Addressen (und ggf weitere Info) an
- ACK
	- Broadcast, bestätigt Auswahl
Discover, Offer, Request, Ack = DORA
#### SLAAC
*AKA Stateless Address Autoconfiguration*
IPv6

Ablauf
- Erzeugung Link-Local IPv6
	- Aus MAC
	- `FE80::<InterfaceIdentifier>`
- (Optional) Aufspüren von Routern im lokalen Netz
	- Router-Solicitation an Link-Local-Multicast Addresse "Alle Router"
	- `FF02::2`
- Router verteilt IPv6-Präfixe
	- Router-Advertisement mit geeignetem Präfix an Link-Local-Multicast "Alle Nodes"
	- `FF02::1`

Hierbei fehlen dem Client aber info wie DNS- und NTP-Server IPs
#### DHCPv6
Verwenden Multicast statt Broadcast

#### NAT
*AKA Network Address Translation*
Es gibt nicht genug IPv4-Addressen
Für Zugriff ins Internet hat nicht jeder Client eine eigene öffentliche IP
Router ersetzt lokale Client-IP mit seiner eigenen IP für anfragen, und übersetzt bei Antworten wieder zurück