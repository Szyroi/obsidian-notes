#netze/vorlesung 
# 11.6.2024
[[Netze Vorlesung 10.pdf]]

## 10
TCP Congestion / TCP Flow Control
![[Netze Congestion vs Flow Control.png]]
Flow Control
- Empfänger ist zu Langsam
Congestion Control
- Netzwerk ist zu Langsam
### Flow Control
Situation: Sender schickt schneller Daten als der Prozess beim Empfänger Daten aus dem Puffer lesen kann
Resultat: Puffer beim Empfänger läuft voll, Segmente müssen Verworfen und erneut gesendet werden

Empfänger teilt die größe des aktuell **freien** Puffers (receive window / rwnd) im Window-Feld des TCP-Heades mit
Sender limitiert Sendefenster basierend auf Puffergröße des Empfängers

Sonderfälle
- Zero Window Probing:
	- Empfänger meldet rwnd = 0
	- Sender schickt keine daten, erhält auch kein update über rwnd
	- Lösung: Warten und 1-Byte paket senden um neuen rwnd-Wert zu bekommen
- Silly Window Syndrom:
	- Segmente mit wenigen Daten sind Ineffizient
	- Volle buffer und langsames Lesen führt zu vielen kleinen Paketen
	- MSS (Max Segment Size): z.B. 536byte
	- Lösung: Empfänger wartet bis freier Puffer $\geq$ MSS bis er ein neues rwnd bekannt gibt
### Congestion Control
Situation: Viele sender schicken zu viele Daten zu schnell und überlasten Netzwerk
Resultat:
- Lange Verzögerungszeit (Warteschlange in Routern)
- Paketverlust (Volle Puffer in Routern)

Problem ist deutlich Komplexer als Flow Control

Ansätze
- Netzgestützte Congestion Control
	- Router meldet Überlastsituation an Sender und Empfänger
		- Via veränderung IP/TCP-Header
	- z.B. TCP-ECN
- Abgeleitete Congestion Control
	- Überlastsituation wird aus Verbindungsdaten abgeleitet
		- Segmentverlust, Verzögerung, ...
	- z.B. TCP(!)

#### AIMD
*AKA Additive Increase Multiplicative Decrease*
Grundidee
- Sender erhöhen Paketrate nach und nach
- Verringern diese bei Paketverlust (Congestion)

Additive Increase:
- Maximale Segmentgröße wird mit jeder erfolgreichen übertragung um Absoluten Wert erhöht
Multiplikative Decrease:
- Bei Verlust wird Maximale Segmentgröße um % verringert
![[Netze AIMD.png]]

Genaues Verhalten kommt auf Algorithmus an
(Cubic, Westwood, Reno, New Reno, Tahoe)

Sender Rate "Congestion Window"
Anzahl an Paketen bei Maximum Segment Size die gleichzeitig verschickt werden

TCP Slow Start
Initiale Rate ist Gering (1 * MSS)
Verdoppelung der Rate für jedes erfolgreiche Paket (Entgegen AIMD!)
Ab bestimmtem Wert "ssthresh" wird Rate nur noch um 1 MSS erhöht
Bei Fehler wird ssthresh auch reduziert

Verwendete Window Size ist min aus
- Congestion Window 
- Receiver Window rwnd