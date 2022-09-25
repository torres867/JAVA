package JAVA_Intro_Package;

public class Student1  // Creation of Class
{
	// Boundary(Body) of the Class
	int a;             // Declaring a Variable
	public void  abc()
	{
		// Boundary(Body) of the  Method
		System.out.println(" Welcome to Automation Classes ");
		
	}
	public static void main(String[] args)  // Creation of the Main Method
	{
	
		Student1 torres = new Student1();   // Creating an object inside the Main Method
		torres.abc();     //Calling the Method in the Class
		torres.abc();
		torres.a = 23;    //Calling the Variable in the Class
		System.out.println( torres.a );
		torres.a = 24;
		System.out.println( torres.a ); // Calling and Printing the Variable
	}
	 
}
