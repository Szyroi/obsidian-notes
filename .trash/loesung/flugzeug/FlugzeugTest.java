package oop.flugzeuge;

/**
 * Test der Flugzeug-Klassen.
 * 
 * @author Rudolf Berrendorf
 * @version 1.0
 */
public class FlugzeugTest {
    public static void main(String[] args) {
        // Ein Segelflugzeug mit 17m Spannweite erzeugen
        Segelflugzeug sf = new Segelflugzeug(17.0);
        System.out.println(sf.toString());

        // Ein Passagierflugzeug mit 10,97m Spannweite, 4 Plätze und 1,3kN Schub erzeugen
        Passagierflugzeug pg = new Passagierflugzeug(10.97, 4, 1.3);
        System.out.println(pg.toString());

        // Eine A380 erzeugen (Jede A380 sieht gleich aus.)
        A380 a380 = new A380();
        System.out.println(a380.toString());

        // Anzahl Flugzeuge jeder Kategorie ausgeben
        System.out.println("Anzahl Flugzeuge: " + Flugzeug.getAnzahl());
        System.out.println("Anzahl Segelflugzeuge: " + Segelflugzeug.getAnzahl());
        System.out.println("Anzahl Passagierflugzeuge: " + Passagierflugzeug.getAnzahl());
        System.out.println("Anzahl A380: " + A380.getAnzahl());
    }
}