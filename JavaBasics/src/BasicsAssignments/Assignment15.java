package BasicsAssignments;

import java.util.Scanner;

public class Assignment15 {

	public static void main(String[] args) 
	{
		
/* 15. Write the java program to print age group depending on the age value entered
If age<=2 then age group is toddler		If age>2 and age<=10 then age group is kid		If age>10 and age<=18 then children
If age>18 and age<=30 then young adult		If age>30 and age<=45 then adult		Ig age>45 then old adult*/
		
		int age;
		Scanner getAge = new Scanner(System.in);
		
		System.out.println("Ente the age: ");
		age = getAge.nextInt();
		if (age <=2)
		{
			System.out.println("Age Group is Toddler");
		}
		else if (age >2 && age <=10)
		{
			System.out.println("Age Group is kid");
		}
		else if (age >10 && age <=18)
		{
			System.out.println("Age Group is children");
		}
		else if (age >18 && age <=30)
		{
			System.out.println("Age Group is young adult");
		}
		else if (age >30 && age <=45)
		{
			System.out.println("Age Group is adult");
		}
		else 
			System.out.println("Age Group is old adult"); 
			getAge.close();
	}

}
