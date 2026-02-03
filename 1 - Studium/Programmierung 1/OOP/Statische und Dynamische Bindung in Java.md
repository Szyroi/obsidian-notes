## **Statische Bindung (Early Binding)**

- **Zeitpunkt**: Zur Kompilierzeit (Compile-Time)
- **Verwendet für**: Methoden, die zur Kompilezeit auflösbar sind
- Betrifft:
    - `private` Methoden
    - `static` Methoden (Klassenmethoden)
    - `final` Methoden
    - Variablen (immer statisch gebunden)

## **Dynamische Bindung (Late Binding/Runtime Polymorphism)**

- **Zeitpunkt**: Zur Laufzeit (Runtime)
- **Verwendet für**: Methoden, die zur Laufzeit aufgelöst werden
- **Betrifft**: 
	- Überschriebene (overridden) 
	- Instanzmethoden