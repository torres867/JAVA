package JAVA_MultiLevelInheritance_9Oct;

public class ZXI extends Seltos
{
	public void RearVent()
	{
		System.out.println(" Seltos ZXI has Rear Vent AC ");
	}
	
	public void sunroof()
	{
		System.out.println(" Seltos ZXI has Sunroof");
	}
	
	public static void main(String[] args) 
	{
		ZXI obj = new ZXI();
		// Calling the method of the Grandfather Class "KIA"
		obj.Price(); 
		// Calling the method of the Parent Class "Seltos"
		obj.Color(); 
		// Calling the method of the Parent Class "Seltos"
		obj.Modal(); 
		// Calling the method of the Child Class "ZXI"
		obj.RearVent(); 
		// Calling the method of the Child Class "ZXI"
		obj.sunroof(); 
	}
}
