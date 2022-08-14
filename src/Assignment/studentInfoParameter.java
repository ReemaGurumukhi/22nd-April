package Assignment;

public class studentInfoParameter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 
	studentInfoParameter sip = new studentInfoParameter();    //called nonstatic method from same class with zero parameter
	sip.studentInfo();   
	
	StudentMarks();    //called static method in main method with zero parameter
	
	
	   
	nonStaticParamter nsp= new nonStaticParamter();           //called nonstatic method from differnt class with parameter
	nsp.infostud("Amay",29,170,'M',"Akola","Maharashtra",456789);
		
	
	nonStaticParamter.StudentMarks(60,70,80);    //called static method from differnt class with parameter
	
	
	nsp.infostud("Suraj",32,10,'M',"Ahmedabad","Gujarat",7564468);  //called nonstatic method from differnt class with parameter
	nonStaticParamter.StudentMarks(76,90,89);    //called static method from differnt class with parameter
	
	nsp.infostud("Swati",32,10,'F',"Jaipur","Rajasthan",679008);  //called nonstatic method from differnt class with parameter
	nonStaticParamter.StudentMarks(100,100,98);    //called static method from differnt class with parameter
	
	}

	
	//studentinfo()----with parameter/ without parameter ---Non Static method
	//name,age,rollnum,gender,city,state,pincode
	
	public void studentInfo()    //created Non static method in same class
	{
		String name="Reema",city="Pune",state="Maharashtra";
		int age= 30,rollnum=150, pincode=897657;
		char gender='F';
		
		System.out.println("================================");
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("RollNum: "+rollnum);
		System.out.println("Gender: "+gender);
		System.out.println("City: "+city);
		System.out.println("State: "+state);
		System.out.println("Pincode: "+pincode);
		System.out.println("===========================");
	}
	
	//studentmarks()--with parameter /without prameter
	//sub1,sub2,sub3,sub4
	public static void StudentMarks()    ////created static method in same class
	{
		int sub1=90, sub2= 89, sub3= 99;
		System.out.println("Marks in Maths: "+sub1);
		System.out.println("Marks in English: "+sub2);
		System.out.println("Marks in Science: "+sub3);
		System.out.println("===========================");
	}
	
}