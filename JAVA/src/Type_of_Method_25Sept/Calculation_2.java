//(((10*2)-2)+2)-2)/2) //

package Type_of_Method_25Sept;
public class Calculation_2 
{
	public int sum(int a, int b)
	{
		int c;
		c = a+b;
		System.out.println(" The Addition Result is " +c);
		return c;
	}
	public int sub(int a, int b)
	{
		int c;
		c = a-b;
		System.out.println(" The Subtraction Result is " +c);
		return c;
	}
	public int mul(int a, int b)
	{
		int c;
		c = a*b;
		System.out.println(" The Multiplication Result is " +c);
		return c;
	}
	public void div(int a, int b)
	{
		int c;
		c = a/b;
		System.out.println(" The Division Result " +c);
	}
	public static void main(String[] args) {
		Calculation_2 cal = new Calculation_2();
		int mulresult = cal.mul(10,2);
		int subresult = cal.sub(mulresult,2);
		int sumresult = cal.sum(subresult,2);
	   int subresult2 = cal.sub(sumresult,2);
	    cal.div(subresult2,2);
	}
}
