package Day2;

public class day1FindLargestLoopStmnts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Exercise 7 - To find the largest of the three numbers using -if-else if
	int x, y, z;
		x = 12 ; y =2443 ; z =1004;
		
		/*			if ((x > y ) && (x>z))
		{
		System.out.println ("x is the Largest");
		}
			else if (y > z)
		{
		System.out.println ("y is the largest");	
		}
		else
		{
		System.out.println ("z is the large number");	
		}
		*/
	
//Nested If statements
		if (x>y)
		{
			if (x>z)
			{
			System.out.println ("x is the largest number");
			}
			else 
			{
			System.out.println ("z is the largest number :)");
			}
			
		}
		else if (y>z)
		{
			System.out.println ("y is the largest number");
		}
		else 
		{
			System.out.println ("z is the largest number");
		}
	}

}
