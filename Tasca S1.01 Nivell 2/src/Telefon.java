
public class Telefon {
	protected String marca;
	protected String model;
	
	public Telefon(String marca, String model) {
		this.marca = marca;
		this.model = model;		
	}
	
	// Getters
	public String getMarca() {
		return marca;
	}
	public String getModel() {
		return model;
	}
	
	// Setters 
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public void setModel(String model) {
		this.model = model;
	}
	
	// Class methods
	public void call(String phoneNumber) {
		System.out.println("You are calling " + phoneNumber);  
	}


}
