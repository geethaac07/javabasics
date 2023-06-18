package BasicsAssignments;

public class Assignment19 
{

	//19. Write a java program to print area of triangle and circle
	
	public static void areaCircle(int r)
	{
		int radius = 2; double area;
		area = Math.PI * (radius * radius);
		System.out.println("\nArea of Circle: " +area);	
	}
	public static void areaTriangle(int b, int h)
	{
		int base = b;
		int height = h;
	
		double aTriangle = (height * base)/2;
		
		System.out.println("\nArea of Circle: " +aTriangle);	
	}
	public static void main(String[] args) 
	{
			
	 int radius = 40;
	 int base = 25;
	 int height=40;
	
	 areaCircle(radius);
	 areaTriangle(base, height);
	}

}
