package Day3;

//import java.util.Scanner;
public class day3TriangleAreaCalc {
	float area, perimeter;
	float base,height,side; 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		//Ex-3 Calculating Triangle's area and perimeter without passing arguments in the constructor
		
	day3TriangleAreaCalc t1=new day3TriangleAreaCalc();
	
		t1.base = 5;
		t1.height=4;
		t1.side=3;
		
		t1.area = (t1.base * t1.height)/2;
		
		t1.perimeter = t1.base + t1.height + t1.side;
		
		System.out.println ("Area of the Triangle: " +t1.area);
		System.out.println ("\nPerimeter of the Triangle: " +t1.perimeter);
	
		/*Scanner myObj = new Scanner(System.in);

	    System.out.println("Enter name, age and salary:");

	    // String input
	    String name = myObj.nextLine();

	    // Numerical input
	    int age = myObj.nextInt();
	    double salary = myObj.nextDouble();

	    // Output input by user
	    System.out.println("Name: " + name);
	    System.out.println("Age: " + age);
	    System.out.println("Salary: " + salary);
	    myObj.close();*/
	}

}
