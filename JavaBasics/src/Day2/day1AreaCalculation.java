package Day2;

public class day1AreaCalculation {

	public static void main(String[] args) {
// Exercise 3 - to print the Area , Perimeter of a circle
		
	    int radius = 2;
		double area= Math.PI * (radius * radius);
		double perimeter = 2 * 3.14 * radius ; //(Math.PI = 3.14)
		
		System.out.println("\nExcercise 3 - to print the Area , Perimeter of a circle");
        System.out.println("\nArea of Circle: " +area);
        System.out.println("\nPerimeter of circle:" +perimeter);
        
 // Exercise 4 - to print the Area & Perimeter of a Rectangle
        
        float width = 3.5f;
        float height = 2.4f;
        double areaRectangle = width * height; //Area of rectangle
        double periRectangle = (2*(width * height)); //perimeter of rectangle
     
        System.out.println("\nExercise 4 - to print the Area & Perimeter of a Rectangle");
	    System.out.println ("\nThe Area of rectangle is: " + areaRectangle);
	    System.out.println ("\nThe perimeter of rectangle is: " +  periRectangle);
	 
// Exercise 5 - to swap TWO variables
		
	 int a =40;
	 int b = 10;
	 int tempValue;
	 
	 tempValue=a;
	 
	 
	 System.out.println("\nExercise 5 - to swap TWO variables");
	 System.out.println ("\nOriginal value of a is: " +a);
	 System.out.println ("\nOriginal value of b is: " +b);
	 
	 a=b;
	 	 
	 System.out.println ("\nSwapped value of a is: " +a);
	 
	 b=tempValue;
	 	 
	 System.out.println ("\nSwapped value of b is: " +b);
	 
	
	}
	
	
}
