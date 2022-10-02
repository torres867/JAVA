package ThisKeyword_Constructor_Method_1Oct;

public class Operation1 
{
	public Operation1() 
	{
		this(10,20,30);
		System.out.println(" Default Constructor ");
	}
	public Operation1(int a)
	{
		this(10,20);
		System.out.println(" One Parameterized Constructor ");
	}
	public Operation1(int a, int b)
	{
		this();
		System.out.println(" Two Parameterized Constructor ");
	}
    public Operation1(int a, int b, int c)
    {
    	System.out.println(" Three Parameterized Constructor ");
    }
    
    public static void main(String[] args) 
    {
		Operation1 op = new Operation1(10);
	}
}
