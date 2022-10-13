package JAVA_HierarchicalInheritance_9Oct;

public class Seltos extends KIA   
{
	public void Seltos_Model()
	{
		System.out.println(" The Model of the Seltos is ZXI ");
	}
	
	public void Seltos_Color()
	{
		System.out.println(" The Color of the Seltos is Dark Grey ");
	}
	
	public static void main(String[] args) 
	{
		Seltos obj = new Seltos();
		// Calling the method of the Parent Class "KIA"
		obj.Showroom();
		// Calling the method of the Parent Class "KIA"
		obj.Price();
		// Calling the method of the Child 1 Class "Seltos"
		obj.Seltos_Color();
		// Calling the method of the Child 1 Class "Seltos"
		obj.Seltos_Model();
	}
}
