package BasicsAssignments;

import java.util.Scanner;


public class Assignment22 {

	public static void main(String[] args) 
	{
		//22. Find the frequency of the given character in the given string.
		String fString;
		char gChar;
		Scanner rStr = new Scanner(System.in);
		
		System.out.println("Enter the string: ");
		fString = rStr.nextLine();
		
		System.out.println("Enter the character to see the frequency: ");
		gChar = rStr.nextLine().charAt(0);
		
		int count=0;
		for (int i=0; i<fString.length(); i++)
		{
		 if (gChar == fString.charAt(i))
		 	{
			count=count+1;
		 	}
				
		}
		System.out.println("\nFrequency of the Character '" +gChar +"' in the string '" +fString +"' is: " +count);
	
		rStr.close();

	}

}
