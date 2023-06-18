package BasicsAssignments;

import java.util.Scanner;

public class Assignment18 {
	//18. Write a java program to print the sum of a given array elements of size n. (read all the input from user)
	int sum=0;

	public void printSum(int arr[]) 
	{
		for (int i=0; i<arr.length;i++)
		{
			sum = sum + arr[i];
		}
		System.out.println ("\nSum of the given Array Elements is :" +sum);
	}
	
	
	public static void main(String[] args) 
	{
		
		int n, arr[] = null;
			
		Scanner rInput = new Scanner(System.in);
		Assignment18 obj1 = new Assignment18();
		
		System.out.println("Enter the size of the array ");
		n = rInput.nextInt();
		
		arr = new int [n];
		
		for (int i=0; i<n;i++)
		{
		System.out.println("Enter the array values:");
		arr[i]= rInput.nextInt();
		}
		
		System.out.println("\nThe Array elements are:");
		for (int i=0; i<n;i++)
		{
		System.out.println(arr[i]);
		}
		
		obj1.printSum(arr);
		
		rInput.close();
		
	}

}
