import java.util.ArrayList;

public class FahrSchueler {

	//Attribute
	private String name;
	private double gebuehr;
	private boolean fastLane;
	private ArrayList<Fahrstunde> fahrstunden = new ArrayList<>();
	

	//Konstruktor
	public FahrSchueler(String name, double gebuehr) {
		this.name = name;
		this.gebuehr = gebuehr;
	}
	
	//Methoden
	
	public boolean eintragen(Fahrstunde neu) {
	    if (neu == null) {
	        return false; // Fehlerfall
	    }
	    // fastLane weitergeben
	    if (fastLane) {
	        neu.setFastLane(this.fastLane);
	    }
	    // Fahrstunde speichern
	    fahrstunden.add(neu);
	    return true;
	}

	
	public void ausgebenStatus() {
	    System.out.println("Name: " + name);
	    System.out.println("Grundgebühr: " + gebuehr);

	    int standardCount = 0;
	    int sonderCount = 0;
	    double standardPreis = 0.0;
	    double sonderPreis = 0.0;

	    // Fahrstunden ausgeben
	    for (Fahrstunde f : fahrstunden) {
	        f.ausgeben(); // Datum, TypName, Anzahl, ggf. fast lane

	        if (f instanceof StandardFahrt) {
	            standardCount += f.anzahl;
	            standardPreis += f.berechnePreis();
	        } else if (f instanceof SonderFahrt) {
	            sonderCount += f.anzahl;
	            sonderPreis += f.berechnePreis();
	        }
	    }

	    System.out.println("Anzahl Standard-Fahrten: " + standardCount + " Preis: " + standardPreis);
	    System.out.println("Anzahl Sonder-Fahrten: " + sonderCount + " Preis: " + sonderPreis);
	    System.out.println("Gesamtpreis: " + (gebuehr + standardPreis + sonderPreis));

	    // Prüfungsvoraussetzung
	    if (standardCount >= 24 && sonderCount >= 12) {
	        System.out.println("Prüfungsberechtigt");
	    } else {
	        System.out.println("Mindeststundenzahl noch nicht erreicht.");
	    }
	}

        
	public void setFastLane(boolean fastLane) {
        if (this.fastLane != fastLane) {
            this.fastLane = fastLane;
            this.gebuehr += 75; // Aufschlag beim Tarifwechsel
        }
	}

	public boolean isFastLane() {
		return fastLane;
	}
	
}