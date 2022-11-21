
public class App {

	public static void main(String[] args) {
		Instruments vent1, corda1, percussio1;
		
		vent1 = newInstrumentVent("Flauta", 19.99);
		percussio1 = newInstrumentPercussio("Tambor", 150);
		corda1 = newInstrumentCorda("violi", 230);
		
		// I play the instruments
		vent1.playInstrument();
		percussio1.playInstrument();
		corda1.playInstrument();
		
		// I call the methods in static way
		InstrumentsCorda.playInstruments();
		InstrumentsPercussio.playInstruments();
		InstrumentsCorda.playInstruments();
		

	}
	
	
	static InstrumentsVent newInstrumentVent(String name, double price) {
		InstrumentsVent vent1 = new InstrumentsVent(name, price);
		return vent1;
	}
	static InstrumentsPercussio newInstrumentPercussio(String name, double price) {
		InstrumentsPercussio percussio1 = new InstrumentsPercussio(name, price);
		return percussio1;
	}
	static InstrumentsCorda newInstrumentCorda(String name, double price) {
		InstrumentsCorda corda1 = new InstrumentsCorda(name, price);
		return corda1;
	}

}
