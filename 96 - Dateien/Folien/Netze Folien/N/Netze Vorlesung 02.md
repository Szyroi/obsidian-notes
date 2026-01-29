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

**Logarithmische Größen (dimensionslos)**
$x=10log_{10}(X)$
**Rechenregeln:**
- $log(x/y)=log(x)-log(y)$
- $log(xy)=log(x)+log(y)$
- $log(x^y)=y\;log(x)$
- $log_z(x)=\frac{log_{10}(x)}{log_{10}(z)}$
- $z^{log_z(x)}=x$

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

# Kanalkapazität


Bandbreite
Frequenzbereich der gut übertragen werden kann
Analoges Telefon braucht ~4kHz

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
$\frac{S_{P}}{N_{0}}$:







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




Near End Cross Talk (Übersprechen)
$NEXT=10log_{10}(P_{in}/P_{noise})$
Wie viel noise ein input auf anliegender Leitung erzeugt

Attenuation to Cross-talk Ration
$ACR=NEXT-a$
ACR größer = Kabel hat höhere Qualität



Baudrate
Schrittgeschwindigkeit = Zahl der Zustandswechsel
Bei 2 Signalwerten: Bitrate = Baudrate

Signal to Noise Ratio $SNR$
$SNR=10\;log_{10}(P_s/P_n)$
log von: Leistung signal / Leistung noise



#### Übertragungsmedien

Verdrillte Kupferkabel (Twisted Pair)
Shielded/Foiled/Unshielded/Screened-Shielded

#### Strukturierte Verkabelung
Primärbereich = zwischen Gebäuden
Sekundärbereich = zwischen Stockwerken
Teritärbereich = innerhalb Stockwerken