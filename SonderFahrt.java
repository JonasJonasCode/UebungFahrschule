
public class SonderFahrt extends Fahrstunde{

	public static final int TYP = 1; //Sinn?
	public static final String TYP_NAME = "Sonder";
	
	public SonderFahrt(long datum, int anzahl) {
		super(datum, anzahl);
	}
	public SonderFahrt(int anzahl) {
		super(anzahl);
	}


	@Override
	public double berechnePreis() {
		double preis;
		if (super.getFastLane() == true) {
			preis = 31*1.90 * super.anzahl;
		} else {
			preis = 31 * super.anzahl;
		}
		return preis;
	}

	@Override
	public void ausgeben() {
		String ausgabeFahrt =super.getDatum() + ": " + TYP_NAME + "-Fahrt Stunden " + super.anzahl;
		if (super.getFastLane()) {
            ausgabeFahrt += " fastLane";
			}
	System.out.println(ausgabeFahrt);
	}
}