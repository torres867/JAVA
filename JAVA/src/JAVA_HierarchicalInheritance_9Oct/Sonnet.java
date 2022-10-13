package JAVA_HierarchicalInheritance_9Oct;

public class Sonnet extends KIA
{
	public void Sonnet_Model()
	{
		System.out.println(" The Model of the Sonnet is VXI ");
	}
	
	public void Sonnet_Color()
	{
		System.out.println(" The Color of the Sonnet is Black ");
	}

	public static void main(String[] args) 
	{
		Sonnet obj2 = new Sonnet();
		// Calling the method of the Parent Class "KIA"
		obj2.Showroom();
		// Calling the method of the Parent Class "KIA"
		obj2.Price();
		// Calling the method of the Child 2 Class "Sonnet"
		obj2.Sonnet_Color();
		// Calling the method of the Child 2 Class "Sonnet"
		obj2.Sonnet_Model();
    }
}
