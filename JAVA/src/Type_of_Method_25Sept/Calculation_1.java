// ((((10+2)-2)+2)*2)/2) //

package Type_of_Method_25Sept;
public class Calculation_1 
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
		System.out.println(" The Subtraction Result " +c);
		return c;
	}
	public int mul(int a, int b)
	{
		int c;
		c = a*b;
		System.out.println(" The Multiplication Result " +c);
		return c;
	}
	public void div(int a, int b)
	{
		int c;
		c = a/b;
		System.out.println(" The Divison Result " +c);
	}
	public static void main(String[] args) 
	{
		Calculation_1 cal = new Calculation_1();
		int sumresult = cal.sum(10,2);
		int subresult = cal.sub(sumresult,2);
		int sumresult2 = cal.sum(subresult,2);
		int mulresult = cal.mul(sumresult2,2);
		cal.div(mulresult,2);
	}
}
