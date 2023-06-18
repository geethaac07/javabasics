package BasicsAssignments;

import java.util.Scanner;

public class Assignment3 {

	public static void main(String[] args)
	{
	Scanner getInput=new Scanner(System.in);
	System.out.println("Enter the number to create the Multiplication Table for:");

	int value = getInput.nextInt();
	System.out.println("Multiplication Table for:" +value+"\n");

	for (int i=1;i<=10;i++)
	{
		System.out.println(value +" x " +i +" = " +(value*i));
	}

	getInput.close();
	}

}
