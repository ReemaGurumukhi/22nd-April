package MethodStudy2904;

public class Employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Details of Employee");	
		System.out.println("---------------------------");
		
		//ClassName objectname= new ClassName();
		//object name.Methodname();
		
		Employee n= new Employee();    
		n.EmployeeDetail();     //Called non static method from same class
		
		DifferentClass m= new DifferentClass(); 
		m.Emp1();        //called nonstatic method from differnt class
		
		Detail o= new Detail(); 
		o.Emp1();        //called nonstatic method from differnt class
		
		Emp3();  //called Static Method from same class
		

	}
public void EmployeeDetail() {
int empid;
String empName;

empid= 170;
empName="Reema Gurumukhi";

System.out.println("Employee Id: "+empid);
System.out.println("Employee Name: "+empName);
System.out.println("---------------------------");
}


public static void Emp3()
{
	System.out.println("This are all details of one of our Employee.");
}
}