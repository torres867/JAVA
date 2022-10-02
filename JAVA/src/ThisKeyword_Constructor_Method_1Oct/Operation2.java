package ThisKeyword_Constructor_Method_1Oct;

public class Operation2 
{
	public void method_1()
	{   this.method_4(10,20,30);
		System.out.println(" Default Method ");
	}
	public void method_2(int a)
	{   this.method_1();
		System.out.println(" One Parameterized Method ");
	}
	public void method_3(int a,int b)
	{   this.method_2(10);
		System.out.println(" Two Parameterized Method ");
	}
	public void method_4(int a, int b, int c)
	{
		System.out.println(" Three Parameterized Method ");
	}
	public void method_5(int a, int b, int c, int d)
	{   this.method_3(10,20);
		System.out.println(" Four Parameterized Method ");
	}

	public static void main(String[] args) 
	{
		Operation2 op = new Operation2();
		op.method_5(10,20,30,40);
	}
}
