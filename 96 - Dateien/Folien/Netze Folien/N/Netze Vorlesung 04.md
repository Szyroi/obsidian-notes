#netze/vorlesung 
# 30.04.2024
[[Netze Vorlesung 04.pdf]]
## 04
### OSI Modell: Schicht 3
Wichtigstes Protokoll auf Schicht 3: IP (Internet Protokoll).
2 Versionen:
- IPv4
	- 4 byte = 32 bit, 4 segmente
	- 123.255.0.1
- IPv6
	- 16 byte = 128 bit, 8 segmente
Verbindungslos, Ohne Fehlerkorrektur, Ohne Empfangsbestätigung, Ohne Reihenfolge

#### IPv4
2^32 = 4 billionen Addressen (Mittlerweile zu wenige)

Ursprünglich aufgeteilt in 3 teile:
- Klasse (verschiedene Netzgrößen)
	- A: Prefix "0"; 7 bit Netz / 24 bit Rechner
	- B: Prefix "10"; 14 bit Netz / 16 bit Rechner
	- C: Prefix "110"; 21 bit Netz / 8 bit Rechner
	- (D: Prefix "1110"; 28 bit multicast; nur Lokal Gültig)
	- (E: Prefix "1111"; +28 bit, Reserviert)
- Netzadresse
- Rechner-/Hostadresse

Netzmaske = Bereich der Netzaddresse + Klasse hat 1-bits
z.B. 255.255.255.0 -> nur letzte 8 bit für Rechner

Gerichtete Broadcast-Addresse: Hostteil = nur 1er bits
- "Alle Rechner in dem Netz"
Begrenzte Broadcast-Addresse: nur 1er bits
- 255.255.255.255
- "Alle Rechner im Lokalen Netz"
Loopback-Addresse: Präfix 127
- 127.0.0.1; 127.123.123.123
- "An den eigenen Rechner"
Konvention: Router erhalten Hostteil addresse 1
- 192.168.0.1
Private IP-netze
- nicht Routed
- A: 10.0.0.0 - 10.255.255.255
- B (16 möglich): 172.x.0.0 - 127.x+15.255.255
- C (255 möglich): 192.x.0.0 - 192.x.255.255

Weil addressen immer knapper wurde, sollten irgendwann mehr als 3 Netzgrößen möglich sein.
Seitdem werden immer IP-Addresse und Netzmaske (als anzahl der Netzaddressbits) geschrieben:
- 12.10.1.64/26
	- Wäre eigendlich ein Class-A Netz
	- 26 bit netz, 6 bit rechner

##### IPv4-Frame
![[Netze IPv4 Frame.png]]
Max. Größe: 65535 Byte

Version: 4/6
IHL: Header Length, Normal 5 -> keine Optionen
Kennung: ID/nummerierung der fragmente
Flags
- DF=1 "do not fragment"
- MF=1 "more fragments exist"
TTL:
- Wird vom router decremented
- TTL = 0 -> paket wird verworfen
- Vorsorge gegen z.B. im kreis routen
Protokoll
- Was ist auf der schicht darüber?
- oft: 6 = tcp, 17 = udp
##### Subnetting
Router benötigt pro Interface eine eigene Netzaddresse.
Broadcasts sollten in größeren Organisationen nicht an alle Clients gehen.

Kleinere Teilnetze/Subnetze werden im Vorgegebenen Addressbereich definiert.
Bits die zur Kodierung der Rechneraddresse vorgesehen sind, werden für Addressierung von Teilnetzen verwendet.

Zu Beachten:
- Anzahl der benötigten Subnetze
- Anzahl der Rechner im größten Subnetz
#### Adressauflösung
3 Arten von Adressen:
- MAC-/Hardware Adressen
- IP-/Netz Adressen
- Namen (Domain Name)

Auflösung:
- Domain->IP: DNS
- IP->MAC: ARP (Address Resolution Protocol)

Ziel-IP entspricht dem finalen Empfänger
Ziel-MAC gilt nur im lokalen Netz, adressiert den nächsten "Knoten"
#### ARP
*AKA Address Resolution Protocol*

Steps:
- Prüfe ob Ziel-IP im lokalen netz befindet; wenn nein: verwende Standard Gateway hier als Ziel-IP
- Prüfe ob IP-Mac paar im ARP Cache (heute Neighbor Cache) des Senders gespeichert ist
	- Wenn Nein, wird ARP-Request broadcasted
		- Alle Rechner prüfen ob sie Besitzer der Ziel IP sind
		- Besitzer antwortet mit ARP reply und sendet seine MAC Adresse
		- Absender des ARP Request speichert antwort in Cache
- Paket wird Versendet
#### ICMP
Dient übermittlung von Fehler- und Statusmeldungen
Wird zur IP-Schicht gerechnet

Besteht aus Typ und Code

Wichtige Typen:
- Ziel nicht Erreichbar
- Zeitüberschreitung (TTL=0)
- Echo Request/Reply (Ping)

ICMP Fehlernachrichten werden niemals erzeugt als reaktion auf
- ICMP Fehlermeldung
- IP Broadcast
- Layer 2 Broadcast
- IP Fragmente
- IP nachricht mit Source-IP: 0.0.0.0 / Loopback / Multicast

##### ICMP Ping
![[Netze ICMP Ping.png]]
Echo Request = Type 8
Echo Reply = Type 0
Kennung und Sequenznr werden echoed