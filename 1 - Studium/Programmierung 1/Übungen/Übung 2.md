![[u02.pdf]]

## **Aufgabe 1**

### 1 & 2)
1. aa: S -> aA A -> a 
2. ba: S -> bB B -> aB
3. bb: S -> bB B -> b

### 3)
Alle Wörter starten mit einem a oder b und enden mit a oder b

### 4)
Diese Grammatik ist eine Typ 3 Grammatik da sie nur ein Terminal gefolgt von nur einem Nichtterminal enthält.


## **Aufgabe 2**

1. 0x1
2. 0XAf3L

## **Aufgabe 3**

## **Aufgabe 10 👾 Bestimmung von logischen Ausdrücken**


```Java
public class BoolExpression {
    public static void main(String[] args) {
  
        boolean wert1 = false;
        boolean wert2 = true;

        System.out.println(!wert1 & (wert1 | wert2));
        wert1 = true;
        System.out.println(!wert1 & (wert1 | wert2));

    }
}
```
