package oop.flugzeuge;

/**
 * Flugzeug.
 * 
 * @author Rudolf Berrendorf
 * @version 1.0
 */
public class Flugzeug {
	// Klassenvariablen
	static int anzahl;

	// Instanzvariablen
	private double spannweite;
	private int sitze;

	// Konstruktor
	public Flugzeug(double spannweite, int sitze) {
		// Ein Flugzeug mehr
		anzahl++;

		// Initialisieren Zustand des Objekts
		this.spannweite = spannweite;
		this.sitze = sitze;
	}

	// Klassenmethode
	public static int getAnzahl() {
		return anzahl;
	}

	public String toString() {
		return "Spannweite : " + spannweite + ", Sitze : " + sitze;
	}
}