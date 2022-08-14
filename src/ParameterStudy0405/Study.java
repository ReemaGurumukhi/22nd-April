package ParameterStudy0405;

public class Study {

	
	//name, age, gender,city,state,pincode
	public void Info()         //Non static method created with out parameterized method
	{
		String name, city, state;
		int age,pincode;
		char gender;
		
		name="Reema";
		age= 30;
		gender='F';
		city="Pune";
		state="Maharastra";
		pincode= 456798;
		
		System.out.println("=========================");
		System.out.println("calling nontatic method to static main method from differnt class with zero parameter");
		System.out.println("My name is: "+name);
		System.out.println("Age: "+age);
		System.out.println("Gender: "+gender);
	    System.out.println("City: "+city);
	    System.out.println("State: "+state);
	    System.out.println("PinCode: "+pincode);
		System.out.println("=========================");
	}
	
	//created static method using parameter 
		public static void Info(String name,int age,char gender,String city,String state, int pincode)
		{
			
			System.out.println("=========================");
			System.out.println("called static method to main method from differnt class with parameter");
			System.out.println("My name is: "+name);
			System.out.println("Age: "+age);
			System.out.println("Gender: "+gender);
		    System.out.println("City: "+city);
		    System.out.println("State: "+state);
		    System.out.println("PinCode: "+pincode);
			System.out.println("=========================");
		}
		
}

