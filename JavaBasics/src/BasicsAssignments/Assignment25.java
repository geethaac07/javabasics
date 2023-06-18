package BasicsAssignments;

public class Assignment25 {

	public static void main(String[] args) 
	{
		// Printing the patterns of number 1-5 and 1s
		
		int i=5,j;
		
		for (i=1; i<=5; i++)
		{
			for(j=1;j<=5;j++) 
			{
		
				System.out.print (j);
			}
			System.out.println();
		
		}
	
		System.out.println();
		for (i=1; i<=5; i++)
		{
			for(j=1;j<=5;j++) 
			{
		
				System.out.print (i);
			}
			System.out.println();
		
		}
	
		System.out.println();
	
		for (i=1; i<=4; i++)
		{
			for(j=1;j<=i;j++) 
			{
				
				System.out.print (1);
			}
			System.out.println();
		
		}
	
		System.out.println();
	
	
		for (i=1; i<=4; i++)
		{
			for(j=1; j<=2*i-1; j++) 
			{
		
				System.out.print (1);
		
			}
			System.out.println();
		
		}
	
		System.out.println();
	
	
		for (i=5; i>=1; i--)
		{
			for(j=1;j<=i;j++) 
			{
				System.out.print (j);
			}
			System.out.println();
		}

	}

}
