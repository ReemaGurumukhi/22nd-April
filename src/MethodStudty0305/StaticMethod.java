package MethodStudty0305;

public class StaticMethod {

	public static void Static()   //Regular Static Method created in same class(main program)
	{
		int a=25,b=90, c=a+b;
	System.out.println("A+B is: "+c);
	//StaticMethod sm = new StaticMethod();
	//sm.NonStatic();
	
	}
	
	public void NonStatic()      //NonStatic Regular Method created in Same class (main program)
	{    
	int r=50, s=25, t=r-s;
	System.out.println("R-S is: "+t);
	//Static();
	}
		
	
	
	///Main Method---main program
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		Static();           //Calling Regular static method from same class
		System.out.println("A+B is called from Static regular Method to Static Regular method");
		System.out.println('\n');    //new line
		
		Velocity.Station();     //calling Regular static method from differnt class in same program
		System.out.println("Calling Regular Static method from same class----Static()");
		System.out.println('\n');    //new line
		
		StaticMethod m =new StaticMethod();     //an object created for of a class--m
		m.NonStatic();                           //called an object of a class
		System.out.println("R-S is called from NonStatic regular method to Static regular method");
	}

	
}
//// created 2nd class in same program(regular static method)---multiple class in same program
class Velocity
{
	 public static void Station()
	 {
	
		System.out.println("Created different class in same program");
	}
}