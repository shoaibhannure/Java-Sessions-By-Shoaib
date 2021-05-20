package OOPConceptPart2;

public class TestCar {

	public static void main(String[] args) {
		// Static polymorphism or Compile Time Polymorphism

		// Create Object of BMW Class
		BMW bmw = new BMW();
		// Start method is in both Car as well as BMW.
		// Whenever method is common in child class and Parent Class (same
		// Argument),
		// preference will be given to Child Class Method.
		bmw.start();
		// Start method is in both Parent and Child
		// Preference will be given to Child
		// Compiler and go and check in Parent class also for same method with
		// same arg
		// This concept is called Method Over riding.

		// When same method is present in Parent Class as well as in Child Class
		// with Same Name and same no of arg, is called Method over-riding.

		bmw.stop();// Inherit from Parent Class since not present in Child Class
		bmw.engine();//Inheriting from Grand Parent

		System.out.println("********************************************");

		// Create Object of parent class
		Car car = new Car();
		car.start();
		car.stop();
		car.carRefuel();
		System.out.println("********************************************");

		//Top Casting
		Car c1 = new BMW();
		// Child Class Object can be referred by Parent Class reference
		// variable. This is called Dynamic Polymorphism---Run Time Polymorphism
		c1.start();
		c1.stop();
		c1.carRefuel();
		
	}
}
