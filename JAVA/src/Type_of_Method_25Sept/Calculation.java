//(10+2)(10-2)//

package Type_of_Method_25Sept;

public class Calculation 
{
	public int sum(int a, int b)
	{
		int c;
		c = a+b;
		System.out.println(" The Addition Result is " +c);
		return c;
	}
	
	public int sub (int a, int b)
	{
		int c;
		c = a-b;
		System.out.println(" The Subtraction Result is " +c);
		return c;
	}
	
	public void mul(int a, int b)
	{
		int c;
		c=a*b;
		System.out.println(" The Multiplication result is " +c);
	}
	
	public static void main(String[] args) 
	{
		Calculation cal = new Calculation();
		int sumresult = cal.sum(10,2);
		int subresult = cal.sub(10, 2);
		cal.mul(sumresult,subresult);
		
	}
	
}
