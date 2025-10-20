
public class StandardFahrt extends Fahrstunde {

    public static final int TYP = 0;
	public static final String TYP_NAME = "Standard";
	private double preis = 27.0;

	public StandardFahrt(long datum, int anzahl) {
		super(datum, anzahl);
	}
	public StandardFahrt(int anzahl) {
		super(anzahl);
	}

	@Override
	public double berechnePreis() {
		if (super.getFastLane() == true) {
			preis = 50 * super.anzahl;
		} else {
			preis = 27 * super.anzahl;
		}
		return preis;
	}

	@Override
	public void ausgeben() {
		String ausgabeFahrt = super.getDatum() + ": " + TYP_NAME + "-Fahrt Stunden " + super.anzahl;
        if (super.getFastLane()) {
            ausgabeFahrt += " fastLane";
        }
        System.out.println(ausgabeFahrt);		
	}

}
