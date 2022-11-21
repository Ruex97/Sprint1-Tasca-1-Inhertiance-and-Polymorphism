
public class App {

	public static void main(String[] args) {
		// Declaration of variables 
		Smartphone myPhone;
		String phoneNumber;
		
		// Assign value to variables
		phoneNumber = "664552123";		
		myPhone = newPhone("Iphone", "12");
		
		// I call the methods call, alarm and takePictures
		myPhone.call(phoneNumber);
	    myPhone.Alarm(); 
		myPhone.TakePictures();


	}
	
	static Smartphone newPhone(String name, String model) {
		Smartphone myPhone = new Smartphone(name, model);
		return myPhone;
	}

}
