
public class Smartphone extends Telefon implements Camera, Clock  {
	
	public Smartphone (String marca, String model) {
		super (marca, model);
	}
	
	// Getters and setters inherited
	
	public void TakePictures() {
		System.out.println("S'esta fent una foto"); 
	}
	
	public void Alarm() {
		System.out.println("Esta sonant l'alarma"); 
	}
	
	
	
}
