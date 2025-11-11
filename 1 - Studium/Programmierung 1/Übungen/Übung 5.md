![[u05.pdf]]

## **Aufgabe 2 Bitquersumme 👾**

```Java
public class BitQuersumme {
    public static void main(String[] args) {

        int zahl = Integer.parseInt(args[0]);
        int querSumme = 0;
        zahl = zahl & 0xFFFF;

        for (int i = 0; i < 16; i++) {

            querSumme += (zahl >> i) & 1;

        }
        System.out.println(querSumme);
    }
}

```

## **Aufgabe 3**

