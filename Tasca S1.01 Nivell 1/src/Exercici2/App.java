package Exercici2;

public class App {

	public static void main(String[] args) {
		// Declare variables
		Car myCar, myCar2, myCar3;
		double power;
		
		// Assign value to variables
		
		power = 150.5;
		myCar = newCar(power); 
		myCar2 = newCar(120);
		myCar3 = newCar(140);
		
		// Calling methods
		// For each non-static method, you must type the object and call the method, on the other way, for each static method
		// you only have to type the class, independently on how many objects you have.
		myCar.accelerar();
		myCar2.accelerar();
		myCar3.accelerar();
		Car.frenar();
	}
	
	
	static Car newCar(double power) {
		Car myCar = new Car(power);
		return myCar;
	}

}
