package ParameterStudy0405;

public class UniversityStudents {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
						
		UniversityStudents us= new UniversityStudents();  //created object of a class to call non static method
		us.studentInfo();                                 //called non static method without parameter called from same class
		
		us.StudentInfo("Katraj","U57347938","Testing","Automation",'M',2018,60.5f);  //Non static method called using parameter called from same class
	}

	//name, PRN, Branch, Dept, gender, passout year, weight  (student info)
	
	//Non Static method created with parameterized method
	public void StudentInfo(String Name,String PRN,String Branch, String Dept, char Gender, int passoutyear, float weight)
	{
		System.out.println("==================================");
		System.out.println("My name is: "+Name);
		System.out.println("My PRN is: "+PRN);
		System.out.println("My branch is: "+Branch);
		System.out.println("My Department is: "+Dept);
		System.out.println("Gender: "+Gender);
		System.out.println("Passout Year: "+passoutyear);
		System.out.println("Weight: "+weight);	
		System.out.println("==================================");
	}
	
	
	public void studentInfo()     //Non static methed created-----without PARAMETERIZED METHOD (Zero Parameterized method)
	{
		String Name;
		Name="Velocity";
		
		String PRN;
		PRN="U78489Y7898";
		
		String Branch;
		Branch="E&TC";
		
		String Dept;
		Dept="HOD";
		
		char Gender;
		Gender='F';
		
		int passoutyear;
		passoutyear= 2009;
		
		float weight;
		weight= 57.67f;
		
		System.out.println("==================================");
		System.out.println("My name is: "+Name);
		System.out.println("My PRN is: "+PRN);
		System.out.println("My branch is: "+Branch);
		System.out.println("My Department is: "+Dept);
		System.out.println("Gender: "+Gender);
		System.out.println("Passout Year: "+passoutyear);
		System.out.println("Weight: "+weight);	
		System.out.println("==================================");
	}
}
