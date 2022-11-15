package Exercici2;


/* final means constant, static means equal for every object of the Class. I understand this exercice as I'm
 * working for a particular brand (so this atribute will never change) and we do cars of a particular model.
 * 
 * This model is the same for all cars we do, but we can choose the power (for instance having different
 * models like sports, family...) 
 */
public class Car {
	private static final String brand = "Renault";
	private static String model = "Megane";
	private final double power;
	
	public Car(double power) {
		this.power = power;
		
	}
	
	//Getters 
	public String getBrand() {
		return brand;
	}
	public String getModel() {
		return model;
	}
	public double getPower() {
		return power;
	}
	
	// Setters
	public void setModel(String model) {
		this.model = model;
	}
	
	// Class methods
	public static void frenar() {
		System.out.println("El vehicle esta frenant");
	}
	
	public void accelerar() {
		System.out.println("El vehicle esta accelerant");
	}
	
	
}
