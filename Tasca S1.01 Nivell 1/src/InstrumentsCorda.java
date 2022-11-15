
public class InstrumentsCorda extends Instruments{
	
	public InstrumentsCorda(String name, double price) {
		super(name, price);
	}
	
	// Getters and Setters inherited
	
	// Class methods
	public void playInstrument() {
		System.out.println("S'esta tocant un instrument de corda");
	}

}
