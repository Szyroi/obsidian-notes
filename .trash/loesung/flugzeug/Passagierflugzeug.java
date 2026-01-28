package oop.flugzeuge;

/**
 * Passagierflugzeug.
 * 
 * @author Rudolf Berrendorf
 * @version 1.0
 */
public class Passagierflugzeug extends Flugzeug {
	// Klassenvariable
	static int anzahl;

	// Instanzvariablen
	private double schub;

	// Konstruktor
	public Passagierflugzeug(double spannbreite, int platz, double schub) {
		super(spannbreite, platz);
		this.schub = schub;
		// Ein Passagierflugzeug mehr
		anzahl++;
	}
}
