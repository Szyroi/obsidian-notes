#netze/vorlesung 
# 16.4.2024
[[Vorlesung-02.pdf]]

### OSI Modell: Schicht 1
Bitübertragungsschicht - Physical Layer

# **Signale**
- Auf der Bitübertragungsschicht werden Daten gesendet, indem ein Signal erzeugt und dieses Signal über ein Medium übertragen wird.
- **Signal**: Ein Signal ist ein physikalisches Phänomen mit welchem sich verschiedene Zustände (bspw. 0 oder 1) darstellen lassen.
### **Ein empfangenes Signal unterscheidet sich von einem gesendeten Signal.** 
Die signifikantesten Unterschiede werden verursacht durch: 
- **Dämpfung** (engl. Attenuation) Das Signal verliert an **Intensität** auf dem Weg vom Sender zum Empfänger.
- **Verzerrung** (engl. Distortion) Das Signal wird auf dem Weg vom Sender zum Emp- fänger **deformiert**. 
- (**Rauschen**) (engl. Noise) Das empfangene Signal enthält **Komponenten**, die nicht vom Sender übertragen wurden.

**Logarithmische Größen (dimensionslos)**
$x=10log_{10}(X)$
**Rechenregeln:**
- $log(x/y)=log(x)-log(y)$
- $log(xy)=log(x)+log(y)$
- $log(x^y)=y\;log(x)$
- $log_z(x)=\frac{log_{10}(x)}{log_{10}(z)}$
- $z^{log_z(x)}=x$

## **Dämpfung und Dezibel**
- **dB ist ein logarithmisches Verhältnis von bspw. Leistungen**
$$
	\frac{P_{1}}{P_{2}}[dB] = 10\log_{10} \left( \frac{P_{1}[\text{W}]}{P_{\text{2}}[W]} \right)
$$

- **oder von Spannungen**
$$
\frac{U_{1}}{U_{2}}[dB] = 20\log_{10} \left( \frac{U_{1}[V]}{U_{2}[V]} \right)
$$

- **Beispiel für die Dämpfung (=Leistungsverlust) einer Leitung:**

$$
a = 10\log_{10}\left( \frac{P_{in}}{P_{out}} \right) = 20 \times \log_{10}\left( \frac{U_{in}}{U_{out}} \right)
$$

$P$ = Leistung des Signals
$U$ = Spannung des Signals
$a$ = Dämpfung (eng. attenuation). 
Typischerweise angegeben in dB/100m oder dB/km.

### Verlust/Gewinn in kaskadierten Pfaden
$$
P_{RX} = P_{TX} - L_{M_{1}} + P_{A} - L_{M_{2}}
$$
$P_{TX}$ = Transmitter
$P_{A}$ = Amplifier
$P_{RX}$ = Receiver
$L_{M}$ = Physical Medium

Beispiel:
$P_{TX}$ = 100 mW
$L_{M_{1}}$ = 40dB
$L_{M_{2}}$ = 30dB
$P_{A}$ = 10dB

$$
P_{RX} = 20dB - 40dB + 10dB - 30dB
$$

# **Kanalkapazität**

$$
C = B\log_{2}\left( 1 + \frac{S_{P}}{N_{0} \times B} \right)
$$
$$
C = B\log_{2}(1+\text{S/R})
$$
$C$: Kapazität (bits/s)
$B$: Bandbreite (Hz)
$N_{0}$: Rauschen (W/Hz)
$S_{P}$: Signal Stärke (W)
$\frac{S_{P}}{N_{0}\times B}$: S/R, ausgedrückt als lineares Leistungsverhältnis, nicht als logarithmische Dezibel

- Eine Erhöhung des **S/R**, erhöht die Kanalkapazität 
- Eine Erhöhung der Bandbreite, erhöht die Kanalkapazität 
- Je nachdem, ob B oder $S_{P}$ wichtiger/teurer ist, können wir das eine erhöhen und das andere verringern, und dennoch die gleiche Kapazität beibehalten 
- Jedoch, es existieren Grenzen


# **Modulation**
- Modulation: Modulation ist die Veränderung eines Si- gnalparameters (oder: mehrerer Parame- ter) eines “Trägersignals” durch ein mo- dulierendes Signal.
- Demodulation: Demodulation ist die Wiederherstellung des ursprünglichen Signals aus dem mo- dulierten Signal.
Bsp für Modulationen:
- Amplitude-Shift Keying (ASK) 
- Frequency-shift keying (FSK) 
- Phase-shift keying (PSK) 
- Quadrature Amplitude Modulation (QAM)

## **Amplitude-Shift Keying (ASK) — Amplitudenmodulation**
- “0” und “1” werden durch unterschiedliche Signalpegel dargestellt (bspw. Spannungspegel).
- Häufig ist der Signalpegel für 0, kein Signal (On-Off Keying (OOK))
Bsp: 
- Daten über Glasfaser verwendet (Lichtimpuls = 1, kein Licht = 0) 
- AM im Autoradio
- Ethernet (Kabel)

## **Frequency-shift keying (FSK) — Frequenzmodulation**
- “0” und “1”werden durch zwei verschiedene Frequenzen in der Nähe der Trägerfrequenz dargestellt.

# **Codierung**
- Kommunikation braucht Synchronisierung
	- Die Repräsentation eines binären, digitalen Signals wirkt trivial: 
		- “0”̂ = 0V̂ = licht aus
		- “1”̂ = 5V̂ = licht an
	- Für eine fehlerfreie Dekodierung muss der Empfänger das Signal zur richtigen Zeit evaluieren 
	- Bei häufigen Wechseln bekommt der Empfänger automatisch einen Takt 
	- Was passiert jedoch bei längeren Folgen von “0” oder “1”?
	
- **Strategien für eine Synchronisierung**
	1.  Spezielle **Start-** und **Stop-Bits** definieren
		- Dies kann bspw. ein spezielles Bitmuster (0110) sein, dass nicht verwendet wird. 
		- Zwischen den Übertragungen gibt es eine Zeit ohne Daten.
	2. Spezielle **Start**- und **Stop-Signale** definieren
		- Dies kann bspw. ein spezielles Signallevel (3V) sein, das sonst nicht verwendet wird. 
		- Zwischen den Übertragungen gibt es eine Phase ohne Daten.
	3. Eine zusätzliche **Codierungen** verwenden.
		- Viele verschiedene Varianten denkbar.

- **Manchester Codierung**
	- In der Mitte der Übertragung des Bits findet ein Übergang statt. 
	- Die Repräsentation eines binären, digitalen Signals in Manchester Codierung:
		- “0”: Erste Hälfte An, zweite Hälfte Aus 
		- “1”: Erste Hälfte Aus, zweite Hälfte An
	- **+** **Inhärenter Takt**, keine Probleme mit langen Folgen gleicher Bits
	- **-** heoretisch eine Halbierung der Kapazität


# Übertragungsmedien

## Link Kapazitäten
- Die beiden wichtigsten Parameter sind:
- **1.Datenrate** (Kapazität, Geschwindigkeit)
	- Gemessen in bits/s (Bits^-1)
- **2.Latenz** (Verzögerungszeit)
	- Gemessen in Sekunden
	- Übertragungsverzögerung
$$
UEV = \frac{M[bit]}{R[bit\text{/s}]}
$$
	- Zeit die ein Node benötigt, um ein Paket abzuschicken. 
	- Ist unabhängig von der physikalischen Länge des Mediums. 
	- Hängt von der Anzahl der Bits und der Datenrate ab.

- Ausbreitungsverzögerung
$$
AV = \frac{\text{Längen[m]}}{v[ms^-1]}
$$
- Zeit, welche die Bits brauchen, um beim Empfänger anzukommen. 
- Hängt von der physikalischen Länge des Mediums und der Ausbreitungsgeschwindigkeit ab. 
- Bei Kupferkabel ca. 0,6 * c (Lichtgeschwindigkeit)

$$
Latenz = UEV + AV
$$

## Kabel
### Twisted Pair
- Sehr verbreitet. Die Standardverkabelung 
- Die paarweise Verseilung vermindert störende Einflüsse von externen magnetischen Wechselfeldern 
- Diese werden durch andere stromführende Kabel bspw. im selben Schacht hervorgerufen 
- Außerdem wird eine Störung (Rauschen) zwischen benachbarten Adern-paaren innerhalb des Kabels reduziert
### Koaxial Kabel (Co-ax)
- Ebenfalls sehr verbreitet. In Deutschland oft bekannt als “Antennenkabel” 
- Sehr gute Eigenschaften (Distanz und Durchsatz oft besser als bei Twisted Pair) Schwierig zu installieren. 
- Die Kabel sind nur begrenzt biegsam und die Verbindungen empfindlich
### Glasfaser (Lichtwellenleiter)
- Übertragung via Lichtimpulse (optische Signale) in einem sehr dünnen Glasstrang 
- Im einfachsten Fall eine LED und eine Photodiode 
- **Extrem hoher Durchsatz und extrem hohe Entfernungen möglich** 
- Schwierige Installation (bspw. “splicing”)
#### Verschiedene Typen
- **Monomode/Singlemode:**
	- Ausbreitung einer einzigen Mode 
	- Sehr geringer Durchmesser des Kerns 9𝜇m 
	- Schwierig zu fertigen und zu verarbeiten 
	- Betrieb mit einem Laser 
	- Lange Distanzen möglich, sehr hohe Datenraten
- **Multimode:**
	- Prinzip der Totalreflexion 
	- Größere Durchmesser des Kerns 50𝜇m/62,5𝜇m 
	- Einfacher zu fertigen 
	- Betrieb mit einer LED möglich 
	- Kann auf kurzen Strecken eingesetzt werden
## Drahtlos
- Drahtlose Kommunikation: Drahtlose Kommunikation ist die Übertragung von Informationen zwischen zwei oder mehr Punkten, die nicht durch einen elektrischen Leiter verbunden sind, unter Verwendung **mo- dulierter elektromagnetischer Wellen**.
$$
c[m\text{/s}] = \lambda[m] \cdot f[Hz]
$$
- $c = 3 * 10^8[m\text{/s}]$ im Vacuum.
### Ausbreitung von Elektromagnetischen Wellen
- Im freien Raum (Vakuum, keine Hindernisse) nimmt die Signalstärke am Empfänger ($P_{R}$) **quadratisch** mit der Entfernung vom Sender ab.
$$
\frac{P_{T}}{P_{R}} = \left[ \frac{4\pi d^2}{\lambda} \right] = [4\pi df^2]
$$