package MethodStudy2804;

public class MethodStudy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Main method is running");
		demo();      //  static method call from same class 
		            // to call static method from same class --> directly call static method ie. methodname();
	DifferentClass.display();		
	}
		
		public static void demo()  // defining  static method 
		{
			System.out.println("hi i am demo method from same class");

	}
	}



