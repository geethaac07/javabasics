package BasicsAssignments;

import java.util.Scanner;

public class Assignment17 {

	int tNum1, tNum2,tNum3;
	
	public void findMax(int tNum1, int tNum2)
	{
		if (tNum1>tNum2)
		System.out.println("\nThe Max of TWO numbers is: " +tNum1);
		else
			System.out.println ("\nThe Max of TWO numbers is: " +tNum2);
	}
	
	public void findMax(int tNum1, int tNum2, int tNum3)
	{
		if ((tNum1>tNum2) && (tNum1> tNum3) )
		{
		System.out.println("\nThe Max of THREE numbers is: " +tNum1);
		}
		else if (tNum2> tNum3) 
		{
			System.out.println("\nThe Max of THREE numbers is: " +tNum2);
		}
		else
		
			System.out.println ("\nThe Max of THREE numbers is: " +tNum3);
	}
	
	public static void main(String[] args) 
	{
		
		//17. Write a java program to find maximum of two num and maximum of 3 numbers using function overloading
		
		Scanner rInput = new Scanner(System.in);
		int num1, num2, num3;
		
		System.out.println("Enter Number1 :");
		num1 = rInput.nextInt();
		System.out.println("Enter Number2 :");
		num2 = rInput.nextInt();
		System.out.println("Enter Number3 :");
		num3 = rInput.nextInt();
		
		Assignment17 obj = new Assignment17();
		obj.findMax(num1, num2);
		obj.findMax(num1, num2, num3);
		
		rInput.close();
	}

}
