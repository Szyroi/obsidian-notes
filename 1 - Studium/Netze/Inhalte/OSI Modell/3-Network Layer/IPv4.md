https://de.wikipedia.org/wiki/IPv4

- 4 byte = 32 bit, 4 segmente
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
## **IP Header**
- **Version**: 4/6
- **IHL (Internet Header Lenght)**:
	- Länger des I
	-  Header Length, Normal 5 -> keine Optionen
- **ToS (Type of Service)**:
	- Heute als **Differentiated Services Code Point (DSCP)** und **Explicit Congestion Notification (ECN)** genutzt.
- **Kennung (Identification)**: ID/nummerierung der fragmente
- **Flags**:
	- DF=1 "do not fragment"
	- MF=1 "more fragments exist"
- **TTL**:
	- Wird vom router decremented
	- TTL = 0 -> paket wird verworfen
	- Vorsorge gegen z.B. im kreis routen
- Protokoll
	- Was ist auf der schicht darüber?
	- oft: 6 = tcp, 17 = udp