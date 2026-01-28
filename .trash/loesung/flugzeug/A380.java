package oop.flugzeuge;

/**
 * A380.
 * 
 * @author Rudolf Berrendorf
 * @version 1.0
 */
public class A380 extends Passagierflugzeug {
	// Klassenvariable
	static int anzahl;

	// Konstruktor
	public A380() {
		// Alle A380 haben eine feste Spannbreite, Sitzplatz und Schub
		super(79.8, 558, 4 * 320.0);
		// Ein A380 mehr gebaut
		anzahl++;
	}
}
