package BasicsAssignments;

import java.util.Scanner;

public class Assignment5 {
	/*5. Write a Java program that takes three numbers as input to calculate and print the average of
	the three numbers*/
	int x, y, z;
	int avg;
	public void calcAvg(int x, int y, int z)
	{
		avg =  (this.x+this.y+this.z)/3;
		System.out.println("\nAverage of the three numbers is:" +avg);
	}
	
	public static void main (String [] args)
	{
		Assignment5 obj1 = new Assignment5();
		Scanner getInput = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		obj1.x = getInput.nextInt();
		System.out.println("Enter the second number: ");
		obj1.y  = getInput.nextInt();
		System.out.println("Enter the third number: ");
		obj1.z = getInput.nextInt();
		obj1.calcAvg(obj1.x,obj1.y,obj1.z);
	
		getInput.close();
	}
}
