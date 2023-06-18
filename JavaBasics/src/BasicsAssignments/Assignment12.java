package BasicsAssignments;

import java.util.Scanner;

public class Assignment12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//12. Write a java program to read size n from user and to print the following pattern  	1 3 5 7 9 .......... 
		int n;
		Scanner rInput = new Scanner(System.in);
		System.out.println("Enter value for the size n");
		
		n= rInput.nextInt();
		
		for (int i=1; i<=n; i++)
		{
			if (i%2 !=0)
				System.out.print(i +" ");
		}
		rInput.close();
	}

}
