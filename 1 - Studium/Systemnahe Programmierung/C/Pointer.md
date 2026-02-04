## Grundlagen

### Was sind Pointer?

Pointer (Zeiger) sind Variablen, die Speicheradressen anderer Variablen speichern.

```c
#include <stdio.h>

int main() {
    int zahl = 42;
    int *zeiger = &zahl;  // & = Adressoperator
    
    printf("Wert von zahl: %d\n", zahl);
    printf("Adresse von zahl: %p\n", &zahl);
    printf("Wert von zeiger: %p\n", zeiger);
    printf("Wert, auf den zeiger zeigt: %d\n", *zeiger);  // * = Dereferenzierungsoperator
    
    return 0;
}
```

## Deklaration und Initialisierung


```c
// Verschiedene Arten, Pointer zu deklarieren
int *ptr1;          // Pointer auf int
char *ptr2;         // Pointer auf char
double *ptr3;       // Pointer auf double
void *ptr4;         // Generischer Pointer

// Initialisierung
int x = 10;
int *ptr = &x;      // Pointer auf die Adresse von x

// Null-Pointer
int *null_ptr = NULL;  // Sicheres Initialisieren
```

## Pointer-Arithmetik


```c
#include <stdio.h>

int main() {
    int numbers[] = {10, 20, 30, 40, 50};
    int *ptr = numbers;
    
    printf("Startadresse: %p\n", ptr);
    printf("Wert: %d\n", *ptr);
    
    ptr++;  // Geht zum nächsten int (4 Bytes weiter typischerweise)
    printf("Nach ptr++: %p\n", ptr);
    printf("Wert: %d\n", *ptr);
    
    ptr += 2;  // 2 ints weiter
    printf("Nach ptr += 2: %p\n", ptr);
    printf("Wert: %d\n", *ptr);
    
    return 0;
}
```

## Pointer und Arrays


```c
#include <stdio.h>

int main() {
    int array[5] = {1, 2, 3, 4, 5};
    int *ptr = array;  // array ist bereits ein Pointer auf erstes Element
    
    printf("Erstes Element: %d\n", array[0]);
    printf("Erstes Element via Pointer: %d\n", *ptr);
    printf("Zweites Element: %d\n", *(ptr + 1));
    printf("Drittes Element: %d\n", ptr[2]);  // Pointer kann wie Array verwendet werden
    
    // Array durchlaufen mit Pointer-Arithmetik
    for(int i = 0; i < 5; i++) {
        printf("Element %d: %d\n", i, *(ptr + i));
    }
    
    return 0;
}
```

## Pointer auf Pointer


```c
#include <stdio.h>

int main() {
    int value = 100;
    int *ptr = &value;
    int **ptr_to_ptr = &ptr;  // Pointer auf einen Pointer
    
    printf("Wert von value: %d\n", value);
    printf("Wert via ptr: %d\n", *ptr);
    printf("Wert via ptr_to_ptr: %d\n", **ptr_to_ptr);
    
    return 0;
}
```

## Pointer in Funktionen (Call by Reference)


```c
#include <stdio.h>

// Call by Reference (arbeitet mit Original)
void swap_by_reference(int *a, int *b) {
    int temp = *a;
    *a = *b;
    *b = temp;
}

int main() {
    int x = 5, y = 10;
    
    printf("Vor swap: x=%d, y=%d\n", x, y);
    swap_by_reference(&x, &y);
    printf("Nach swap: x=%d, y=%d\n", x, y);
    
    return 0;
}
```

## Dynamische Speicherallokation


```c
#include <stdio.h>
#include <stdlib.h>

int main() {
    // Array dynamisch allozieren
    int size = 5;
    int *array = (int*)malloc(size * sizeof(int));
    
    if(array == NULL) {
        printf("Speicherallokation fehlgeschlagen!\n");
        return 1;
    }
    
    // Array initialisieren
    for(int i = 0; i < size; i++) {
        array[i] = i * 10;
    }
    
    // Array ausgeben
    for(int i = 0; i < size; i++) {
        printf("array[%d] = %d\n", i, array[i]);
    }
    
    // Speicher freigeben
    free(array);
    
    return 0;
}
```

## Pointer und Strings


```c
#include <stdio.h>

int main() {
    char text[] = "Hallo Welt";
    char *ptr = text;
    
    // String durchlaufen mit Pointer
    while(*ptr != '\0') {
        printf("%c ", *ptr);
        ptr++;
    }
    
    return 0;
}
```

## Häufige Fehler


```c
// 1. Nicht initialisierte Pointer (Wild Pointer)
int *wild_ptr;  // Gefährlich!

// 2. Dereferenzierung von NULL-Pointer
int *null_ptr = NULL;
// printf("%d\n", *null_ptr);  // Segmentation Fault!

// 3. Memory Leak
int *ptr = (int*)malloc(sizeof(int));
// Vergessen: free(ptr);

// 4. Verwendung nach free()
free(ptr);
// printf("%d\n", *ptr);  // Undefiniertes Verhalten!
```

## Best Practices

1. **Immer initialisieren**: Pointer auf NULL oder gültige Adresse setzen
2. **NULL-Checks**: Vor Dereferenzierung prüfen
3. **Gültigkeitsbereich beachten**: Nicht auf lokale Variablen außerhalb ihres Scopes zeigen
4. **Speicher freigeben**: Jeden malloc/calloc mit free paaren
5. **Nach free() NULL setzen**: Verhindert "dangling pointers"

## Visualisierung

```c
Variable:    zahl = 42
Adresse:     0x7ffd2a8b4c

Pointer:     zeiger = 0x7ffd2a8b4c
             |
             v
            [42]  (an Adresse 0x7ffd2a8b4c)
```

## Typische Anwendungsfälle

1. **Dynamische Datenstrukturen**: Listen, Bäume, Graphen
2. **String-Verarbeitung**: Effiziente String-Manipulation
3. **Arrays dynamischer Größe**: Zur Laufzeit Speicher allozieren
4. **Funktionsparameter**: Call by Reference für große Daten
5. **Systemprogrammierung**: Direkter Speicherzugriff

## Memory Layout


```c
+-----------------+
|    Stack        |  // Lokale Variablen,automatische Speicherverwaltung
+-----------------+
|    Heap         |  // Dynamischer Speicher (malloc/free)
+-----------------+
|    Data         |  // Globale/statische Variablen
+-----------------+
|    Text/Code    |  // Programmiercode
+-----------------+
```