#netze/vorlesung 
# 16.4.2024
[[Vorlesung-02.pdf]]

### OSI Modell: Schicht 1
Bitübertragungsschicht - Physical Layer

# Signale
- Auf der Bitübertragungsschicht werden Daten gesendet, indem ein Signal erzeugt und dieses Signal über ein Medium übertragen wird.
- **Signal**: Ein Signal ist ein physikalisches Phänomen mit welchem sich verschiedene Zustände (bspw. 0 oder 1) darstellen lassen.
### **Ein empfangenes Signal unterscheidet sich von einem gesendeten Signal.** 
Die signifikantesten Unterschiede werden verursacht durch: 
- **Dämpfung** (engl. Attenuation) Das Signal verliert an **Intensität** auf dem Weg vom Sender zum Empfänger.
- **Verzerrung** (engl. Distortion) Das Signal wird auf dem Weg vom Sender zum Emp- fänger **deformiert**. 
- (**Rauschen**) (engl. Noise) Das empfangene Signal enthält **Komponenten**, die nicht vom Sender übertragen wurden.


## Dämpfung und Dezibel
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
$$P_{RX} = P_{TX} - L_{M_{1}} + P_{A} - L_{M_{2}}$$


# Kanalkapazität
Beispiele Übertragungsmedien
- Koaxialkabel
- Glasfaser
- Elektromagnetische Wellen (in der Luft)

Relevante Parameter
- Delay / Signallaufzeit
	- Kupfer: 0.6 * light speed
	- Bei Twisted Pair: Delay Skew (max delay diff zwischen kabeln, 10% von delay)
- Kompatabilität: Wellenwiederstand
	- Änderungen führen zu Reflektionen des Signals
	- Miteinander verbundene Kabel müssen gleichen Wellenwiederstand haben
- Leistungsverlust des Signals
- Störanfälligkeit durch andere Signale
- Maximale Datenrate

Logarithmische Größen (dimensionslos)
$x=10log_{10}(X)$
Rechenregeln
- $log(x/y)=log(x)-log(y)$
- $log(xy)=log(x)+log(y)$
- $log(x^y)=y\;log(x)$
- $log_z(x)=\frac{log_{10}(x)}{log_{10}(z)}$
- $z^{log_z(x)}=x$

Formel: Dämpfung $a$
$P$: Leistung des Signals
$U$ Spannung des Signals
$a=10log_{10}(P_{in}/P_{out})$
oder $a=20log_{10}(U_{in}/U_{out})$
Üblich: $dB/100m$
Dämpfung eines 100m leitungsstücks

Near End Cross Talk (Übersprechen)
$NEXT=10log_{10}(P_{in}/P_{noise})$
Wie viel noise ein input auf anliegender Leitung erzeugt

Attenuation to Cross-talk Ration
$ACR=NEXT-a$
ACR größer = Kabel hat höhere Qualität

Bandbreite
Frequenzbereich der gut übertragen werden kann
Analoges Telefon braucht ~4kHz

Kanalkapazität $C$
Bits pro Sekunde
Mit Bandbreite $B$
$C=2B$
Kann mehr als 2 Signalebenen haben (Mehrere verschiedene Werte möglich)
Bei $M$ signalebenen
$C=2B\;log_2(M)$

Baudrate
Schrittgeschwindigkeit = Zahl der Zustandswechsel
Bei 2 Signalwerten: Bitrate = Baudrate

Signal to Noise Ratio $SNR$
$SNR=10\;log_{10}(P_s/P_n)$
log von: Leistung signal / Leistung noise

Gestz von C.Shannon
Physikalisch Max. Mögliche Übertragunsrate


#### Übertragungsmedien

Verdrillte Kupferkabel (Twisted Pair)
Shielded/Foiled/Unshielded/Screened-Shielded

#### Strukturierte Verkabelung
Primärbereich = zwischen Gebäuden
Sekundärbereich = zwischen Stockwerken
Teritärbereich = innerhalb Stockwerken