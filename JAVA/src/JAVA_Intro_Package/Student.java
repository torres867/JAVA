package JAVA_Intro_Package;

public class Student  // Creation of the Class
{
	// Boundary (Body) of the Class
	
	int Roll_No, Age;  // Declaring the Variable
	
	 public void Display_1() 
	 {
		 // Boundary (Body) of the Method
		 System.out.println(" Welcome to all of you ");
	 }
	 
	 public void Display_2()
	 {
		 System.out.println(" Automation is very easy ");
	 }
	 
	 public static void main(String[] args) // Creation of the Main Method
	 {
		Student FCB = new Student(); // Creation of the Object inside the Main Method
		FCB.Display_1();    // Calling the Method
		FCB.Age = 23;       // Calling the Variable
		System.out.println(FCB.Age); //Calling and Printing the Variable
		
		FCB.Display_2();
		FCB.Roll_No = 27;
		System.out.println(FCB.Roll_No);
	}
	 

}
