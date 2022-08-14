package MethodStudty0305;

public class NonStaticMethod {
	
	 //Regular Static Method created in same class(main program)
	public static void Static()  
	{
		int a=25,b=90, c=a+b;
	System.out.println("A+B is: "+c);
	}
	
	
	////////NonStatic Regular Method created in Same class (main program)
	public void NonStatic()      
	{
	int r=50, s=25, t=r-s;
	System.out.println("R-S is: "+t);
	
	
	}
		
	
	
//////MAIN METHOD (MAIN PROGRAM)
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Static();           //Calling Regular static method from same class
		
		NonStaticMethod msn =new NonStaticMethod();
		msn.NonStatic();   //-----called nonstatic regular method in static regular method
		System.out.println("Calling Regular Static method from smae class----Static()");
		
		StaticMethod m =new StaticMethod();   //an object created for of a class--m
		m.NonStatic();                       //called an object of a class
		
		Velocity1.Static1();    //called static regular method from 2nd class created(class) in same program
	}
}
 class Velocity1   //created differnt class in same program
{
	 public static void Static1()
	 {
		System.out.println("Created differnt class in same program");
	}
} 


