package JAVA_SingleInheitance_9Oct;

public class VitaraBrezza extends Suzuki   // VitaraBrezza is a child class and extends is used for the Inheritance
{
   public void Modal()
   {
	   System.out.println(" The Modal of the Car is ZXI ");
   }
   public void Color()
   {
	   System.out.println(" The Color of the Car is Grey ");
   }
   
   public static void main(String[] args) 
   {
	   VitaraBrezza obj = new VitaraBrezza();
	   obj.price();     // Calling the Method of the Parent Class "Suzuki"
	   obj.Modal();     // Calling the Method of the Child Class "VitaraBrezza"
	   obj.Color();     // Calling the Method of the Child Class "VitaraBrezza"
   }
	
}

