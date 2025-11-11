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

1. 
```Java
public class Leibniz_Reihe {
    public static void main(String[] args) {

        int n = 100000;
        double s = 0.0;
        int vorz = 1;

        for (int i = 0; i < n; i++) {

            s += vorz * (1.0 / (2 * i + 1));

            vorz = -vorz;

        }

        double pi = 4 * s;

        System.out.println(pi);

    }

}

```
