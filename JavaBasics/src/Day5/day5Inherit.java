package Day5;
class Vehicle
{
protected String brand = "Ford";
public void honk() 
{
  System.out.println("Tuut, tuut!");
}
}

class Car extends Vehicle {
 String modelName = "Mustang";
 public void honk() 
 {
   System.out.println("Tuutuuu, tuut!");
 }
}
public class day5Inherit {

	   public static void main(String[] args) {
		    Car myFastCar = new Car();
		   
		    myFastCar.honk();
		    System.out.println(myFastCar.brand + " " + myFastCar.modelName);
		  }
		}

		/*int num = 160;
		
		System.out.println("hexa " +Integer.toHexString(num));
		System.out.println("Octal " +Integer.toOctalString(num));
		System.out.println("Binary " +Integer.toBinaryString(num));
		System.out.println("String " +Integer.valueOf(num));
*/
		
		
	


