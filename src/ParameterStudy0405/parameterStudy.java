package ParameterStudy0405;

public class parameterStudy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Study s= new Study();   //calling non static method of differnt class in static method with zero parameter  
		s.Info();
		
		parameterStudy ps= new parameterStudy();  //called non static method from same class with paramter
		ps.info("Vraj",38,'M',"Akola","MAharshtra",897654);
		
		
		Info();    //Called static method in main method from same class with zero parameter
		Study.Info("Yuvraj",45,'M',"Wardha","Maharsthra",788754);//calledstatic method from different class using parameter
	}
		
		//name, age, gender,city,state,pincode
	public static void Info()   //craeted static method with zero paramter

	{
		String name, city, state;
		int age,pincode;
		char gender;
		
		name="Ananya";
		age= 70;
		gender='F';
		city="Akola";
		state="Maharastra";
		pincode= 789798;
		
		System.out.println("=========================");
		System.out.println("Called Static method to main method from same class with zero parameter");
		System.out.println("My name is: "+name);
		System.out.println("Age: "+age);
		System.out.println("Gender: "+gender);
	    System.out.println("City: "+city);
	    System.out.println("State: "+state);
	    System.out.println("PinCode: "+pincode);
		System.out.println("=========================");
	}
	
	
	
	
	//Craeted non static method in same class with paramter
	public void info(String name,int age,char gender,String city,String state, int pincode)

	{
		System.out.println("=========================");
		System.out.println("calling non static method from same class with parameter");
		System.out.println("My name is: "+name);
		System.out.println("Age: "+age);
		System.out.println("Gender: "+gender);
	    System.out.println("City: "+city);
	    System.out.println("State: "+state);
	    System.out.println("PinCode: "+pincode);
		System.out.println("=========================");
	}
}

