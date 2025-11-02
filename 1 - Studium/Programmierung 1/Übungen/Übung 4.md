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

## **Aufgabe 4**

## **Aufgabe 5 👾**