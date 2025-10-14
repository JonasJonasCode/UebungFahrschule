
import java.util.Calendar;

abstract public class Fahrstunde { 
	
	// TODO Erg�nzen sie die Klasse Fahrstunde anhand der Aufgabenstellung
	
	//Attribute
	private long datum;
	protected int anzahl;
	private boolean fastLane;
	private int typ;
	private String name;
	
	//Konstruktor
	public Fahrstunde (long datum, int anzahl) {
		this.datum = datum;
		this.anzahl = anzahl;
	}
	public Fahrstunde (int anzhal) {
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
		
	}
	
	public int getTyp() {
		return typ;
	}
	
	public String getName() {
		return name;
	}
	
	public double berechnePreis() {
		return anzahl;
	}
	
	public void setFastLane() {
		
	}
	
	public boolean isFastLane() {
		return true;
	}
}
