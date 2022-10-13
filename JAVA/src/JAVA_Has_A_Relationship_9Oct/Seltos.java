package JAVA_Has_A_Relationship_9Oct;

public class Seltos 
{
	public void Model()
	{
		System.out.println(" The model of the Seltos is ZXI");
	}
	
	public void Color()
	{
		System.out.println(" The Color of the Seltos is Dark Grey ");
	}
	
	public static void main(String[] args) 
	{
		// Calling the Object of the "KIA" Class in " Seltos" Class
		KIA obj = new KIA();
		obj.showroom();
		obj.carname();
		obj.price();
		
		Seltos obj2 = new Seltos();
		obj2.Model();
		obj2.Color();
	}

}
