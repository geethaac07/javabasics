package BasicsAssignments;

import java.util.Scanner;

public class Assignment13 {

	public static void main(String[] args) {
	
	//13. Write a java program to read size n from user and to print the following pattern 2 4 6 8 10 .........
		int n;
		Scanner rInput = new Scanner(System.in);
		System.out.println("Enter value for the size n");
		
		n= rInput.nextInt();
		
		for (int i=1; i<=n; i++)
		{
			if (i%2 ==0)
				System.out.print(i +" ");
		}
		rInput.close();
	}

}
