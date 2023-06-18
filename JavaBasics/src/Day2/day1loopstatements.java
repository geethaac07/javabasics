package Day2;

public class day1loopstatements {

	public static void main(String[] args) {
		
	System.out.println ("Exercise 6 - Demostrate the use of If, If-else, Switch statements");
	
	float width = 4.5f;
	float length = 2.25f;
	
	if (width != length)
	{
		System.out.println ("\nThis is a rectangle");
	}
	
	//System.out.println ("\nIf statement Failed...");
	
//If-else statements
	System.out.println ("\nIf-Else statement begins...");
	
	length=4.5f;
	
	if (width == length)
	{
		System.out.println ("\nThis is a square");
	}
	else
	{
		System.out.println ("this is a rectangle");
	}
//Switch case statements
	System.out.println ("\nSwitch-case statement begins....\n");
	
	String cmonth = "July";
		
	switch (cmonth)
	{
	case "March":
		System.out.println("Spring break");
		break;
	
	case "September":
		System.out.println("Fall break :)");
		break;
	
	case "July":
		System.out.println("Summer Holidays :)");
		break;
	
	default:
		System.out.println("no winter month specifed :)");
	}		
	}
}
