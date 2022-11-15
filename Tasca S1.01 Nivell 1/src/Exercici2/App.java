package Exercici2;

public class App {

	public static void main(String[] args) {
		// Declare variables
		Car myCar;
		double power;
		
		// Assing value to varibales
		
		power = 150.5;
		myCar = newCar(power); 
		
		// Calling methods
		
		myCar.accelerar();
		Car.frenar();
	}
	
	
	static Car newCar(double power) {
		Car myCar = new Car(power);
		return myCar;
	}

}
