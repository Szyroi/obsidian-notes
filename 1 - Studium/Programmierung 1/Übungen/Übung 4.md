![[u04.pdf]]

## **Aufgabe 1**

## **Aufgabe 2 👾**

```Java
Scanner scanner = new Scanner(System.in);
  int k = scanner.nextInt();
  char b = scanner.next().charAt(0);
  char verschluesselt = (char) ('A' + (b - 'A' + k) % 26);

   System.out.println(verschluesselt);

  scanner.close();
```


```Java

Scanner sc = new Scanner(System.in);

        int start = 0x41; // 65 = 'A'
        int end = 0x5A; // 90 = 'Z'
        int b;
        int k;

        System.out.println("Eingabe: ");
        k = sc.nextInt();
        b = sc.next().charAt(0);

        for (int i = 0; i < k; i = i + 1) {

            b = b + 1;
            if (b > end) {
                b = start;
            }
        }

        System.out.print("Ausgabe: \n" + (char) b);
        sc.close();
```


## **Aufgabe 3**

```Java
import java.util.Scanner;

public class Caesar {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        char b;
        int k = scanner.nextInt();
        String t = scanner.next();
        
        for (int i = 0; i < t.length(); i++) {
            b = t.charAt(i);
            char verschluesselt = (char) ('A' + (b - 'A' + k) % 26);
            System.out.println("Buchstabe " + b);
            System.out.println("Buchstabe " + verschluesselt);
        }

        scanner.close();
        
    }
}

```

## **Aufgabe 4**




## **Aufgabe 5 👾**

```Java
import java.util.Scanner;

public class DatumErweiterung {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int j, m, t, s, m1, m2;

        j = sc.nextInt();
        m = sc.nextInt();
        t = sc.nextInt();
        s = sc.nextInt();
        m1 = sc.nextInt();
        m2 = sc.nextInt();

        m1 += m2;

        if (m1 >= 60) {
            s += m1 / 60;
            m1 = m1 % 60;
        }

        if (s >= 24) {
            t += s / 24;
            s = s % 24;
        }

        int maxTage;
        if (m == 2) {
            maxTage = 28;

        } else if (m == 4 || m == 6 || m == 9 || m == 11) {
            maxTage = 30;
        } else {
            maxTage = 31;
        }

        if (t > maxTage) {
            t = 1;
            m++;
            if (m > 12) {
                m = 1;
                j++;
            }
        }
  
        System.out.printf("%d %d %d %d %d", j, m, t, s, m1);
        sc.close();
    }
}

```



```Java

import java.util.Scanner;

public class DatumErweiterung {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            int j, m, t, s, m1, m2;

            j = sc.nextInt();
            m = sc.nextInt();
            t = sc.nextInt();
            s = sc.nextInt();
            m1 = sc.nextInt();
            m2 = sc.nextInt();
            m1 += m2;

            if (m1 >= 60) {
                s += m1 / 60;
                m1 = m1 % 60;
            }

            if (s >= 24) {
                t += s / 24;
                s = s % 24;
            }

            int maxTage;
            maxTage = switch (m) {
                case 2 -> 28;
                case 4, 6, 9, 11 -> 30;
                default -> 31;
            };

            if (t > maxTage) {
                t = 1;
                m++;
                if (m > 12) {
                    m = 1;
                    j++;
                }
            }
        System.out.printf("%d %d %d %d %d", j, m, t, s, m1);
        }
    }
}
```
