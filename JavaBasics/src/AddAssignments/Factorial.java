package AddAssignments;

import java.util.Scanner;

public class Factorial {

	public int fact(int i)
	{
		if (i<=1)
			return 1;
		else
			
		return (i * fact(i-1) );
	}
	public static void main (String[] args)
	{
		int j;
		Scanner getValue = new Scanner(System.in);
		System.out.println("Enter value to find factorial:");
		j=getValue.nextInt();
		Factorial obj = new Factorial();
		
		System.out.println("factorial value of " +j +" is: " +obj.fact(j));
		getValue.close();
	}
}
