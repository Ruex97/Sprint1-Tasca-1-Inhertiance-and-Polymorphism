
public class InstrumentsPercussio extends Instruments{
	
	public InstrumentsPercussio(String name, double price) {
		super(name, price);
	}
	
	// Getters and Setters inherited
	
	// Class methods
	public void playInstrument() {
		System.out.println("S'esta tocant un instrument de percussio");
	}
	
	public static void playInstruments() {
		System.out.println("S'esta tocant un instrument de corda");
	}


}
