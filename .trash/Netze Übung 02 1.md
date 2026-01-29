#netze/übung 
# 2
[[Netze Übung 02.pdf]]
## 2.1
Dämpfung $a$
$a=10\cdot \log_{10}(P_{in}/P_{out})$
mit $P$ leistung Watt eingang/ausgang, oder
$a=20\cdot \log_{10}(U_{in}/U_{out})$
mit $U$ Spannung Volt eingang/ausgang

20m 10v->5v
### 2.1.a)
$a=20 \log_{10}(10/5)$
$a=6.0206$ (dB/20m)
### 2.1.b)
$a_2 = a/20*100$
$a_2= 30.103$
### 2.1.c)
Dämpfung für 100m:
$a_3=a_2/2=15.0515$

Formel für Dämpfung aufstellen
$a=20 \log_{10}(10/U_{out})$
Wir kennen $a$
$15.0515=20 \log_{10}(10/U_{out})$
$0.7525=\log_{10}(10/U_{out})$
Definition von log: $\log_a(a^b)=b$
$10^{0.7525}=10^{\log_{10}(10/U_{out})}$
$10^{0.7525}=10/U_{out}$
$5.6568=10/U_{out}$
$5.6568\cdot U_{out}=10$
$U_{out}=1.7677$
## 2.2
Ping in 100m Kupferkabel
Signale in Kupferkabel reisen mit ca $0.6c$ wobei $c=300000km/s$ lichtgeschwindigkeit
$100m / (0.6c)=0.000000556s=0.000556 ms=0.556\mu s$
0.556 Mikrosekunden
## 2.3
ACR-Wert
ACR = Attenuation-to-Crosstalk Ratio
Zusammenfassung von Übersprechen und Dämpfung
Insgesamt Qualitätswert für das Kabel (höher = besser)
## 2.4
4kHz = 4000Hz = 4000 Pulse pro Sekunde, aber pro Puls werden 2 Signale übertragen
64kbit/s = 64000bit/s = 64000 bit pro Sekunde
also $64000/(2*4000)=8$ bit pro Puls
Um 16 bit darzustellen müsste es $2^{8}=256$ Signalebenen geben
Dies ist relativ viel, wodurch schon kleine Störungen das Signal verfälschen könnten.

Zur absicherung gegen störung könnte
- ein Sehr gutes kabel verwendet werden
- Fehlerkorrektur verwendet werden
- eine Leitung mit höherer bandbreite beschafft werden
## 2.5
Maximaler Rauschabstand für 2.4

Gesetz von C. Shannon (physikalisch max. mögliche Übertragungsrate)
$C = B \log_2 (1+ P_S/P_n)$ bit
($P_s$ = Signalleistung, $P_n$ Noiseleistung, $C$ Kanalkapazität, $B$ bandbreite)

$64000 = 4000 \log_2 (1+ P_S/P_n)$
$16 = \log_2 (1+ P_S/P_n)$
$2^{16} = 2^{\log_2 (1+ P_S/P_n)}$
$2^{16} = 1+ P_S/P_n$
$65535 = P_S/P_n$

Rauschabstand $SNR$
$SNR=10\log_{10}(P_S/P_n)$

$SNR=10\log_{10}(65535)$
$SNR=10\log_{10}(65535)$
$SNR=48.1647$
## 2.6
Erst output-leistung bei $a=4dB$ bestimmen
$a=10\log_{10}(P_{in}/P_{out})$

$4=10\log_{10}(P_{in}/P_{out})$
$0.4=\log_{10}(P_{in}/P_{out})$
$10^{0.4}=10^{\log_{10}(P_{in}/P_{out})}$
$2.51189=P_{in}/P_{out}$
$2.51189P_{out}=P_{in}$
$P_{out}=0.3981P_{in}$

$8\cdot 0.3981=3.1848$
Also Nutzleistung am Ausgang ist $3.18$ mal so Stark wie Noiseleistung
$P_S/P_n=3.1848$

$SNR=10\log_{10}(P_S/P_n)$
$SNR=10\log_{10}(3.1848)$
$SNR=5.0308$

ALTERNATIV:
Rauschabstand $SNR$ am Sender
$SNR=10\log_{10}(8)=9.0309dB$
Dämpfung von 4dB bedeutet auch, dass der Rauschabstand am Ausgang 4dB kleiner ist als am Eingang
$SNR=9.0309-4=5.0309$
