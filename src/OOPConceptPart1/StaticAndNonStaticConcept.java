package OOPConceptPart1;

public class StaticAndNonStaticConcept {
	
	//Scope of global variable will be available across all the functions with some conditions. 

	String name = "Shoaib"; // Non Static Global variables
	static int age = 27; // Static Global Variable
	double price= 100.00;

	public void sendMail() {// Non Static Method
		System.out.println("Send Mail Method");
	}

	public static void sum() {// Static Method
		System.out.println("Sum Method");

	}

	public static void main(String[] args) {
		// How to call Static Methods
		// Direct Calling
		sum();
		// Calling by Class Name
		StaticAndNonStaticConcept.sum();

		// How to call Static Vars
		System.out.println(age);
		System.out.println(StaticAndNonStaticConcept.age);

		//How to call Non Static Methods
		StaticAndNonStaticConcept obj = new StaticAndNonStaticConcept();
		obj.sendMail();
		
		//How to call Non Static variables
		StaticAndNonStaticConcept obj1 = new StaticAndNonStaticConcept();
		System.out.println(obj1.name);
		
		//Can I access Static Methods by using object reference? Yes
		obj.sum(); //Warning is displayed
		
	}
}
