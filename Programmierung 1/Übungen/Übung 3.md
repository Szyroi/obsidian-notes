![[u03.pdf|u03]]


## **Aufgabe 1**

###  **a)** $110 001 101 011_{2}$
### $Dezimal: 1 \cdot 2^{11} + 1 \cdot 2^{10} + 0 \cdot 2^{9} + 0 \cdot 2^{8} + 0 \cdot 2^{7} + 1 \cdot 2^{6} + 1 \cdot 2^{5} + 0 \cdot 2^{4} + 1 \cdot 2^{3} + 0 \cdot 2^{2} + 1 \cdot 2^{1} + 1 \cdot 2^{0} = 3179_{10}$

#### $Oktal:110001101011_{2} = 06153_{8}$

#### $Hexadezimal: 1100 0110 1011 \rightarrow C6B_{16}$

## **Aufgabe 2**

Taschenrechner: 7.249.210.214.400
Java: -694581248
Warum?:  Weil der Positive Wertebereiche überschritten wird in Java und der Taschenrechner mit Gleitkommazahlen arbeitet.

## **Aufgabe 3 BitExtraktion **In Zukunft für Praktomaten die den Code so schreiben das er automatisch ohne eingaben des Benutzers benutz wird.

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
