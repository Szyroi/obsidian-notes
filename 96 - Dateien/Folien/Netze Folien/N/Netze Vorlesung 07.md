#netze/vorlesung 
# 21.5.2024
[[Netze Vorlesung 07.pdf]]
[[Netze Vorlesung 07 Beispiel.pdf]]

## 7
### Router

Router als klassische Schicht-3 (IP) Komponente:
- Arbeitet auf Schicht 3
	- Wertet IP-Informationen aus
- Entscheidet, an welches Interface ein Paket geleitet wird
	- Basierend auf Routing-Tabellen
		- Zuordnung von IP-Addressen zu Interfaces
		- Fallback falls IP keinem Zugewiesen ist: Standard Gateway
		- Standard Gateway ist meist Zugang zum Internet
- Router begrenzen Broadcastdomänen: Router leiten Broadcasts nicht weiter

Router ist ähnlich zu normalem (headless) Computer
- (Boot-)ROM (? bios?)
- Flash Memory (Betriebssystem) 
- NVRAM (Non-Volatile RAM, Startup-Config)
- RAM

#### Konfiguration
Konfiguration des Interfaces:
- IP des Interfaces
- Netzaddresse & Maske des angeschlossenen Netzes
- (Routing-) Protokolle die über das Interface ausgetauscht werden sollen
- Schicht-2 Protokoll des Interfaces (mit parametern z.B. Ethernet (?))

Routingprotokoll Konfigurieren
- Welches Protokoll
- Welche Metrikwerte

Andere Protokolle
- z.B. DHCP, NAT

Zusätzlich:
Zugangsbeschränkung für das Interface
Interface auf bestimmtes Gerät locken
Sperren bestimmter Addressbereiche
### Routing-Protokolle

Im Internet werden Netze zu größeren Einheiten Zusammengeschlossen
Autonomous System = Administrative Einheit unter Kontrolle einer einzigen Firma/Instanz (->ASN!)

Internes Routing
- Routing *Innerhalb* eines Autonomous Systems
- Möglich via
	- Statisch, mit Tabellen
	- Dynamisch, mit (internen) Routingprotokollen

Externes Routing
- Routing *zwischen verschiedenen* Autonomous Systems
- Immer Dynamisch mit (externen) Routingprotokollen
- An Grenzgebieten werden Routing-Daten ausgetauscht
- Wichtiges Protokoll: Border Gateway Protocol (BGP)

#### Statisches Routing
Manuelle, feste einträge in Routing-Tabelle
Nur für kleine Netze mit wenigen Routern realistisch
Änderungen müssen manuell eingegeben werden

Addressen werden Interfaces Zugewiesen
Alles nicht zugewiesene geht ans Standard-Gateway (meist Internetzugang)

#### Dynamisches Routing
Routing auf basis von Routing-Protokollen
Topologieänderungen im Netzwerk werden automatisch erfasst
Routing-Protokolle belasten dafür Netzwerk und Router

Wichtige Protokolle
- Routing Information Protocol (RIP)
- Open Shortest Path First (OSPF)
- Interior Gateway Routing Protocol (IGRP)

![[Netze Routingprotokolle Übersicht.png]]

Routing-Informationen werden in regelmäßigen zeitlichen Abständen ümer die gleichen Interfaces und Netzverbindungen übertragen wie die Nutzdaten, quasi im Hintergrund

#### Verschiedene Routen
Router bilden ein Großes Netz
Es kann viele Mögliche Wege zwischen zwei geräten geben

Wege werden bewertet nach Metriken
Mögliche Parameter:
- Hop Count
- Bandbreite
- Verzögerung
- Belastung
- Zuverlässigkeit
- Kosten

### Link State Routing
Für Internes Routing.
Verwendetes Protokolle 
- Open Shortest Path First (OSPF)
- IntermediateSystem to Intermediate System (IS-IS)

Sendet Link State Pakete

Ein Link State Advertisement (LSA) enthält
- Quelladdresse des Routers
- Sequenznummer
- Timestamp
- Liste von direkten Nachtbarn des Routers, und Informationen über die Verbindung zu ihnen

Router machen "Nachtbarschaftserkundung"
Senden Info über Verbindung zu direkten Nachtbarn an alle
Routing-Tabelle mit Dijkstra-Algorithmus (Pathfinding)

Ablauf
- Ermittlung der Nachtbarn mit Hello-Paketen
- Bestimmung Übertragungsbandbreite/Kosten zu Nachtbarn
- LSA zusammenstellen und an alle Router verteilen
	- Via "Flooding": Ein Router verteilt ein neues empfangenes LSA an alle ausgänge ausser Empfänger
	- LSAs die ein Router schon Erhalten hat, werden nicht weiterverteilt (wegen Loops)
	- Ein LSA wird bei Netz-Änderung generiert
- Nach Empfang der LSAs unter Verwendung des Dijkstras Algorithmus den kürzesten Pfad zu allen Routern berechnen
- Jeder Router hat komplettes Bild des Netzes

Sehr Robust, aber höherer Speicherbedarf (als Distance-Vector-Routing-Protokolle)
und benötigt mehr Router-Rechenleistung

Dijkstra Algorithmus = Immer Pfad (von Nachtbar(?)) mit kleinsten gesamtkosten weiter exploren

### Distance-Vector-Routing
**Nicht Klausurrelevant**
Router tauschen ihre Routing-Tabellen mit **benachtbarten** Routern aus
Wird über mehrere Updates immer weiter aufgebaut
Häufig ist einzige Metrik Hop-Count

Reaktion auf Gute Nachrichten ist Schnell
Reaktion auf Schlechte Nachrichten (Ausfall) ist sehr Langsam
- Die veraltete Information über die ehemals-Funktionierende Route bleibt lange im Netz
- Info der toten Route wird immer weiter hin und hergereicht, mit immer weiter erhöhender Metrik
	- "Count to Infinity Problem"
	- Bei zu hoher Metrik wird die Route dann irgendwann verworfen

Router speichern nicht Modell des Gesamten Netzes, sondern nur:
- Welche IP-Range, Soll an welches Interface, Mit welchen Kosten
- An ihre Nachtbarn geben sie die Info für was sie Weiterleiten Können
	- Welche IP-Range, Mit welchen Kosten
- Nachtbarn aktualisieren damit dann ihre eigene Tabelle, falls die Kosten für eine IP-Range besser sind als was sie Vorher kannten

