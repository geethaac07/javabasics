package BasicsAssignments;

import java.util.Scanner;

public class Assignment21 {

	public static void main(String[] args) {
		//		21. Swap 2 numbers without using the 3rd variable.
		int a, b;
		Scanner obj1= new Scanner(System.in);	
		System.out.println("Enter the first value a: ");
		a= obj1.nextInt();
		
		System.out.println("Enter the second value b: ");
		b= obj1.nextInt();
		
		System.out.println("Values BEFORE Swapping: \n a="+a+" and b="+b);
		
		a= a+b; 
		b= a-b;
		a=a-b;
		
		System.out.println("\nValues AFTER Swapping: \n a="+a+"  and b="+b);
		obj1.close();
	}

}
