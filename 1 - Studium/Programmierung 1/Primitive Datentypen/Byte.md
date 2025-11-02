%% Notiz: Einführung in die Programmierung - Bitoperationen, Fließkommazahlen, Zeichenketten
%% Seiten 1-7
$$
\section*{Bitoperationen}

\subsection*{Grundlagen}
- Ganzzahlige Werte werden in Bits dargestellt (32 Bits = 4 Bytes).
- Das niederwertigste Bit hat die Index 0, das höchstwertige Bit Index 31.
- Beispiel: int x = 5 wird binär als 000...0101 kodiert.

\subsection*{Bit-Shift-Operationen}
\begin{itemize}
  \item Links-Shift (<<): Bits werden nach links verschoben, rechts werden Nullen eingefügt.
  \item Rechts-Shift (>>): Bits werden nach rechts verschoben, mit Vorzeichenbehandlung (bei negativen Zahlen).
  \item Rechts-Shift ohne Vorzeichen (>>>): Rechts-Shift, wobei links Nullen ergänzt werden, unabhängig vom Vorzeichen.
\end{itemize}

\subsection*{Bitweise Operatoren}
\begin{itemize}
  \item \textasciitilde{} (Negation): Bitweise Negation aller Bits.
  \item \& (Und): Bitweises UND zweier Werte.
  \item | (Oder): Bitweises ODER zweier Werte.
  \item \textasciicircum{} (Exklusives Oder, XOR): Bitweises XOR zweier Werte.
\end{itemize}

\subsection*{Beispiel: Bitmaske und Bitwert extrahieren}
- Isolieren und Auslesen der niederwertigen Bits eines int-Werts mit Masken:
  \begin{enumerate}
    \item Wert \& 0x1 isoliert das 0. Bit.
    \item Wert >> 1 verschiebt Bits um eine Position nach rechts.
    \item Wert \& 0x1 danach isoliert das 1. Bit.
  \end{enumerate}

\section*{Überlauf bei ganzzahligen Operationen}

- Arithmetik mit ganzzahligen Typen liefert exakte Resultate, außer bei Überlauf.
- Beispiel: byte mit 8 Bits überläuft bei Addition über den maximalen Wert (127 + 1 führt zu -128).
- Programmierer müssen Überlauf selbst vermeiden.

\section*{Zusammenfassung ganze Zahlen in Java}

\begin{tabular}{ll}
Typ & Beschreibung \\
\hline
byte, short, int, long & Ganze Zahlen mit 1, 2, 4 oder 8 Bytes, Zweierkomplement \\
Konstanten & Dezimal, Oktal, Hexadezimal, seit Java 7 auch binär \\
Operatoren & +, -, *, /, %, ... \\
Besonderheiten & Berechnungen exakt außer bei Überlauf \\
\end{tabular}

\section*{Fließkommazahlen}

\subsection*{Darstellung von reellen Zahlen}
- Reelle Zahlen werden als Kombination von Vorkomma- und Nachkommaanteil in Bits dargestellt.
- Halblogarithmische Schreibweise (Mantisse, Exponent, Vorzeichen) erlaubt größere Wertebereiche.
- Fließkommazahlen haben die Form: \(value = (-1)^V \times M \times B^E\), mit Vorzeichen V, Mantisse M, Exponent E und Basis B.

\subsection*{IEEE 754 Standard}
- Definiert Formate für Fließkommazahlen, häufig genutzt sind 32-Bit (float) und 64-Bit (double).
- 32 Bit: 1 Bit Vorzeichen, 8 Bit Exponent, 23 Bit Mantisse.
- 64 Bit: 1 Bit Vorzeichen, 11 Bit Exponent, 52 Bit Mantisse.
- Fehler bei Darstellung durch Begrenzung der Mantisse und Rundungsfehler.

\subsection*{Beispielrechnung und Probleme}
- Fließkommazahlen können bei Operationen wie Addition, Subtraktion und Division Rundungsfehler erzeugen.
- Beispiel: Addition von Werten mit sehr unterschiedlicher Größe kann Genauigkeitsverluste verursachen.

\subsection*{Fließkommatypen in Java}
- Üblich wird double als Datentyp für reelle Werte verwendet.
- float ist einfacher und hat weniger Speicherbedarf, double ist genauer.

\section*{Zeichendarstellung und Zeichenketten}

\subsection*{Zeichenkodierungen}
- ASCII: 7 Bits, 128 Zeichen (lateinische Buchstaben, Ziffern, Steuerzeichen).
- ISO-8859-1: Erweiterung auf 8 Bit für westeuropäische Zeichen (u.a. Umlaute).
- Unicode: bis 21 Bits, standardisiert weltweit alle Schriftzeichen.
- UTF-8, UTF-16, UTF-32: Kodierungsformate zur Speicherung von Unicode-Zeichen.

\subsection*{Java Zeichen und Strings}
- Datentyp \texttt{char}: Ein einzelnes 16-Bit Unicode-Zeichen (UTF-16-Kodierung).
- String: Klasse für beliebig lange Zeichenketten, keine primitiven Datentypen.
- Escape-Sequenzen (z.B. '\\n','\\t') werden unterstützt.
- Strings sind unveränderlich (immutable); Verkettung erfolgt über + Operator, der neue Strings erzeugt.

\subsection*{Wichtige String-Methoden}
\begin{itemize}
  \item \texttt{length()}: Länge des Strings.
  \item \texttt{charAt(index)}: Zeichen an Position index.
  \item \texttt{substring(start, end)}: Teilstring.
  \item \texttt{equals(String)}: Vergleich auf inhaltliche Gleichheit.
\end{itemize}$$

