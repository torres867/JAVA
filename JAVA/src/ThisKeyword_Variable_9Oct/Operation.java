// Declaring the Global Variable and Local Variable without using This Keyword

package ThisKeyword_Variable_9Oct;

public class Operation 
{
	int FCB = 123;   // Declaring a Global Variable inside the class
	
	public void method_m1(int BVB)    // Declaring a Local Variable inside the method
	{
		FCB = BVB;   // Giving the Value of the Local Variable to the Global Variable
	}
	
	public static void main(String[] args) 
	{
		Operation obj = new Operation();
		obj.method_m1(987);
		System.out.println(" So the Printed Value is " +obj.FCB);
	}
}
