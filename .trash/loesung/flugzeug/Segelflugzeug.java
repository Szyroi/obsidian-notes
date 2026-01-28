package oop.flugzeuge;

/**
 * Segelflugzeug.
 * 
 * @author Rudolf Berrendorf
 * @version 1.0
 */
public class Segelflugzeug extends Flugzeug {
	// Klassenvariable
	static int anzahl;

	// Konstruktor
	public Segelflugzeug(double spannbreite) {
		// Segelflugzeuge haben immer nur einen Sitzplatz
		super(spannbreite, 1);

		// Ein Segelflugzeug mehr
		anzahl++;
	}

	public String toString() {
		return super.toString() + " (Segelflugzeug)";
	}

}