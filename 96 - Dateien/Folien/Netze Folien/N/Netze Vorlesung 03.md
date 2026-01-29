#netze/vorlesung 
# 23.04.2024
[[Netze Vorlesung 03.pdf]]
# Ethernet und WLAN
# Data Link Layer/Sicherungsschicht
## Ethernet
IEE 802.3
LAN = Local Area Network
Frame/Rahmen besteht aus
- Präambel: 01010101... (für Synchronisation)
- Frame Delimiter: 10101011
- Nutzdaten (Layer 2 Frame)

## WLAN
IEE 802.11
Wireless LAN

Infrastruktur-Netzwerk (Client-AP)
vs Ad hoc Netzwerk (Client-Client)

Trägersignal (z.B. 2.4GHz)
Amplitude, Frequenz oder Phase eines Trägersignals werden verändert, um Daten zu übertragen ("Modulation")
- AM = Amplitude Modulation
- FM = Frequenz Modulation
- PM = Phase Modulation


Frame besteht aus
- Präambel
- Start of Frame Delimiter
- Header (Size, Datenrate, Checksum)
- Nutzdaten (Layer 2 Frame)
## OSI Modell: Schicht 2
Adressierung MAC-Schicht
MAC = Medium Access Controll
48 bit (6 byte)
- 24 bit Hersteller-ID (links)
	- 6 bit ID
	- Flag: Is Software-configured address
	- Flag: Is group/broadcast
	- 16 bit ID
- 24 bit Station-ID (rechts)

#### Layer 2 Frame
Verschieden für Ethernet/WLAN

Ethernet:
- Zieladdresse
- Quelladdresse
- Type/Length
- Nutzdaten (46 - 1500 byte)
- CRC-Checksum

WLAN:
- Frame Control (Version, Type, Fragmentierung, Bedeutung Address-Fields)
- Duration/ID: Entweder Dauer us oder Station ID
- Address x4: Sender, Empfänger, Wlan-Bezeichnung, ...
- Sequence Control (Für Reihenfolge)
- Nutzdaten (0 - 3212 Byte)
- CRC-Checksum

Problem WLAN: Mehrere Geräte im gleichen Frequenzbereich
- CSMA/CD (Carrier Sense Multiple Access / Collision Detection)
	- Für Ethernet Entwickelt
	- Falls Frei: Senden
	- Falls Belegt: Random Wait
	- Kollision möglich: Beim Writen wird weiter Gelesen, bei Kollision gestoppt und Störsignal gesendet
- CSMA/CA (... / Collision Avoidance)
	- Für Wireless Angepasst
	- nicht deterministisch
	- Keine garantierte Antwortzeit
	- Normale Antenne kann beim Writen nicht lesen
	- 3 Verschiedene Delays je nach Prio + Random Time ("Wettbewerbsfenster")
		- SIFS: Short Inter Frame Spacing (ACK)
		- PIFS: Zeitbegrenzte Dienste
		- DIFS: Datendienste
	- Optional: Vor Übertragung RTS (Request to Send) und CTS (Clear to Send) austauschen
		- Stations können einander evtl nicht sehen; So wissen sie trotzdem dass kanal Belegt ist

## Loakale Adressierung MAC 