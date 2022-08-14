package NonStaticStudy;

public class Study {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
											//create object for class
		//classname objectname=new classname();
		Study n=new Study();   
											// to call method we have to call object
		//objectname.classname();
		n.add();   
		
  
		// to call nonstatic method from different class
		//create object for differnt class
		//classname objectname=new classname();
		DiffClass m=new DiffClass();
		
		// to call method from differnt class we have to call object
				//objectname.classname();
		m.sub();
		
		mul();    //call Static method from same class
		
	}
public void add()   //Non Static regular Method
{
	// non static regular method
			int a,b,add;
			a=60;
			b=10;
			add=a+b;
			System.out.println("Call Nonstatic Method from same class");
				System.out.println("Addition of a+b is: "+add);
				System.out.println("--------------------------------");
}



public static void mul()    //Static Regular Method
{
	int e,f,Mul;
	e=7;
	f=9;
	Mul=e*f;
	    System.out.println("Call Static Method From sme class");
	    System.out.println("Multiplication of e&f is: "+Mul);
	    System.out.println("--------------------------------");
}
}
