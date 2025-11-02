![[u03.pdf]]


## **Aufgabe 1**

###  **a)** $110 001 101 011_{2}$
### $Dezimal: 1 \cdot 2^{11} + 1 \cdot 2^{10} + 0 \cdot 2^{9} + 0 \cdot 2^{8} + 0 \cdot 2^{7} + 1 \cdot 2^{6} + 1 \cdot 2^{5} + 0 \cdot 2^{4} + 1 \cdot 2^{3} + 0 \cdot 2^{2} + 1 \cdot 2^{1} + 1 \cdot 2^{0} = 3179_{10}$
#### $Oktal:110001101011_{2} = 06153_{8}$

#### $Hexadezimal: 1100 0110 1011 \rightarrow C6B_{16}$

## **Aufgabe 2**

Taschenrechner: 7.249.210.214.400
Java: -694581248
Warum?:  Weil der Positive Wertebereiche überschritten wird in Java und der Taschenrechner mit Gleitkommazahlen arbeitet.

## **Aufgabe 3 BitExtraktion👾**In Zukunft für den Praktomaten den Code so schreiben das er automatisch ohne eingaben des Benutzers benutz wird.

```Java
public class BitExtraktion {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Bitte drei Argumente übergeben: x y a");
            return;
        }
        
        try {
        
            int x = Integer.parseInt(args[0]);
            int y = Integer.parseInt(args[1]);
            int a = Integer.parseInt(args[2]);
            
            if (x < 0 || x > 31 || y < 0 || y > 31 || x == y || a < 0) 
            {
                System.out.println("Ungültige Eingabe!");
                return;
            }

            int bitX = (a >> x) & 1;
            int bitY = (a >> y) & 1;
  
            System.out.println(bitX + bitY);

        } catch (NumberFormatException e) {
            System.out.println("Ungültige Zahleneingabe!");
        }
    }
}
```

## **Aufgabe 4**
Das erster Einser komplement ist nicht gleich dem Zweierkomplement
Bsp: f41e1e -> 1111 0100 0001 1110 0001 1110
Einserkomplement: 0000 1011 1110 0001 1110 0001
Zweierkomplment: 0000 1011 1110 0001 1110 0010
Hex: 0be1e2
$0001 \neq 0010$ der Rest bleibt gleich bildung des Zweierkomplements
Beim vergleichen der RGB werte kommt ein Problem auf mit dem Zweierkomplement.
Da der Komplement von f41e1e (244,30,30) eigentlich (11,225,225) beträgt und in Hex 0be1e1 ist bedeutet das dass Zweier Komplement nicht zur bildung der Komplementär Farbe geeignet ist sondern nur der Einser Komplement.

## **Aufgab 5 Prüfbit👾**

```Java
public class ParityBit {
    public static void main(String[] args) {

        int wert = 0x17;
        int nutzBits = (wert >> 1) & 0b1111;

        int summe = 0;
        for (int i = 0; i < 4; i++) {
            summe += (nutzBits >> i) & 1;
        }
        int parityBit = summe % 2;
        int pruefBitImWert = wert & 1;

        System.out.println(parityBit == pruefBitImWert);
        System.out.println(summe);
        System.out.println(parityBit);

    }
}
```

## **Aufgabe 6**

1. 000.001 = 0,001
2. 111.111 = 7,7

## **Aufgabe 7**
Wandeln Sie die Zahl 3,5 in eine 32 Bit IEEE-754 Fließkommadarstellung um. Geben Sie dabei jeden Zwischenschritt im Umwandlungsprozess an. Die Darstellung des Endresultats enthält also 32 Bit.

Schritt 1: 3,5 3 = 11,01
Schritt 2: 1,101
Schritt 3: 11,01 = 1,101 $\dot{}$

