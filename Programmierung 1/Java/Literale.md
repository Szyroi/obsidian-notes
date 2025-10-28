# Java Literale Übersicht

| **Kategorie**           | **Typ / Schreibweise**             | **Beispiel**           | **Beschreibung**                                 |
| ----------------------- | ---------------------------------- | ---------------------- | ------------------------------------------------ |
| 🔢 **Ganzzahlen**       | **Dezimal**                        | `int a = 42;`          | Standarddarstellung ohne Präfix                  |
|                         | **Binär**                          | `int b = 0b1010;`      | Seit Java 7, Präfix `0b` oder `0B`               |
|                         | **Oktal**                          | `int o = 075;`         | Führende `0` bedeutet Oktal                      |
|                         | **Hexadezimal**                    | `int h = 0x1F;`        | Präfix `0x` oder `0X`, Basis 16                  |
|                         | **Mit Unterstrichen**              | `int n = 1_000_000;`   | Zur besseren Lesbarkeit, seit Java 7             |
|                         | **Long-Wert**                      | `long l = 123L;`       | Suffix `L` oder `l` für long                     |
| 🧮 **Fließkommazahlen** | **Dezimal**                        | `double d = 3.14;`     | Standard-Fließkommawert                          |
|                         | **Float**                          | `float f = 2.5f;`      | Suffix `f` oder `F` für float                    |
|                         | **Wissenschaftlich (Exponential)** | `double e = 1.2e3;`    | `e` oder `E` steht für „×10^“                    |
| 🧵 **Zeichen**          | **Einzelnes Zeichen**              | `char c = 'A';`        | Zeichenliteral                                   |
|                         | **Escape-Sequenzen**               | `'\n'`, `'\t'`, `'\\'` | Sonderzeichen (Zeilenumbruch, Tab, etc.)         |
|                         | **Unicode**                        | `'\u03A9'`             | Unicode-Literal (z. B. Ω)                        |
| 🗒️ **Strings**         | **Textliteral**                    | `String s = "Hallo";`  | Folge von Zeichen in doppelten Anführungszeichen |
| ⚙️ **Boolean**          | **Wahrheitswerte**                 | `true`, `false`        | Nur diese zwei Werte erlaubt                     |
| 💡 **Nullwert**         | **Null-Literal**                   | `null`                 | Referenziert kein Objekt                         |
