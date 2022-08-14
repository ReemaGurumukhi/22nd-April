package Assignment;

public class nonStaticParamter {

	//studentinfo()----with parameter/ without parameter ---Non Static method
	//name,age,rollnum,gender,city,state,pincode

public void infostud(String name, int age, int rollnum, char gender, String city, String state, int pincode)
{
	
	System.out.println("===========================");
	System.out.println("Name: "+name);
	System.out.println("Age: "+age);
	System.out.println("RollNum: "+rollnum);
	System.out.println("Gender: "+gender);
	System.out.println("City: "+city);
	System.out.println("State: "+state);
	System.out.println("Pincode: "+pincode);
	System.out.println("===========================");
}

public static void StudentMarks(int sub1,int sub2,int sub3)    ////created static method in same class
{
	
	System.out.println("Marks in Maths: "+sub1);
	System.out.println("Marks in English: "+sub2);
	System.out.println("Marks in Science: "+sub3);
	System.out.println("===========================");
}
}

