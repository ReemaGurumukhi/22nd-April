package NonStaticStudy;

public class NonStaticMethodStudy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello");
		
		//classname objectname= new classname();
		//We have to create object for class
		
		//to call non static regular methods from same class
		// objectname.methodname();
		
		NonStaticMethodStudy m= new NonStaticMethodStudy(); // created object of a class
		m.NonStaticMethod(); 							   // //calling non static method from same class
		
		
		// calling non static method of another class--> need to create object of that class
		
		//created object different class (DifferentClassNonStaticMethod)
		DifferntClassNonStaticMethod n =new DifferntClassNonStaticMethod();
		
		//to call non static method-->objectname.methodName();
        n.DifferentClass(); // calling non static method from another class
	}
	
public void NonStaticMethod() {    // non static regular method
	System.out.println("NonStatic Regular method calling from same class");
	
	
}

}
