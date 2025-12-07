
## **Methode um einen Array zu Rotieren**

```Java
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        Scanner sc = new Scanner(System.in);
        System.out.print("Gebe eine Zahl ein: ");
        int zahl = sc.nextInt();
        for (int x : arr = arrayRotieren(arr, zahl)) {
            System.out.printf("[%d]", x);
        }
        sc.close();
    }

    public static int[] arrayRotieren(int[] s, int k) {
        int[] tmp = new int[s.length];

        for (int i = 0; i < s.length; i++) {
            tmp[(i + (k % s.length)) % s.length] = s[i];
        }

        return tmp;
    }
}
```
