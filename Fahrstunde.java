
import java.util.Calendar;

abstract public class Fahrstunde { 
	
	// TODO Erg�nzen sie die Klasse Fahrstunde anhand der Aufgabenstellung
	
	//Attribute
	private long datum;
	protected int anzahl = 2;
	private boolean fastLane;
	
	
	//Konstruktor
	public Fahrstunde (long datum, int anzahl) {
		this.datum = berechneDatum();
		this.anzahl = anzahl;
	}
	public Fahrstunde (int anzahl) {
		this.anzahl = anzahl;
	}
	//Methoden
	
	// Hilfsfunktion zum bestimmen des aktuellen Datum als Zahl
	// im Format yyyymmdd
	public static long berechneDatum() {
		Calendar ziel = Calendar.getInstance();
		int y = ziel.get(Calendar.YEAR);
		int m = ziel.get(Calendar.MONTH);
		int d = ziel.get(Calendar.DAY_OF_MONTH);
		long date = y * 10000 + (m + 1) * 100 + d;

		return date;
	}
	
	public void ausgeben() {
		System.out.println(berechnePreis());
	}
	
	abstract public double berechnePreis();
	
	public void setFastLane() {
		this.fastLane = fastLane;
	}
	
	public boolean isFastLane() {
		return fastLane;
	}
}
