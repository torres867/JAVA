// Using This Keyword to differentiate between Global Variable and Local Variable

package ThisKeyword_Variable_9Oct;

public class Operations 
{
	int FCB = 321; // Declaring Global Variable inside the Class
	
	public void Method_2(int FCB)
	{
		this.FCB = FCB;  // Giving the Value of Local Variable to the Global Variable
	}
	
	public static void main(String[] args) 
	{
		Operations obj = new Operations();
		obj.Method_2(654);
		
		System.out.println(" So the Printed Value is " +obj.FCB);
	}

}
