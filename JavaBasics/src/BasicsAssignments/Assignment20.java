package BasicsAssignments;

import java.util.Scanner;

public class Assignment20 {

	public static void main(String[] args) 
	{
		//	20. Find the even numbers in the given integer array of size n
		Scanner rInput = new Scanner(System.in);
		System.out.println ("Enter the size of the array: ");
		
		int n = rInput.nextInt();
		int arr[] = new int[n];
		
		System.out.println("Enter values for the array:");
		
		for (int i=0; i<n; i++) 
		{
			arr[i]=rInput.nextInt();
		}
		System.out.println("The even numbers in the given array are: ");
		
		for (int i=0;i<arr.length; i++)
		{
		if (arr[i]%2 == 0)
			System.out.println(arr[i]);
		}
		
		rInput.close();
	}

}
