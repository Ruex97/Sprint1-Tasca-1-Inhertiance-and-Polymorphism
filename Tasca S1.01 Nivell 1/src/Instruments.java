
public abstract class Instruments {
	protected String name;
	protected double price;
	
	public Instruments(String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	// Getters
	public String getName() {
		return name;
	}
	
	public double getPrice() {
		return price;
	}
	
	//Setters
	public void setName(String name) {
		this.name = name;
	}
	public void setPrice (double price) {
		this.price = price;
	}
	
	// Class methods
	public abstract void playInstrument();


}
