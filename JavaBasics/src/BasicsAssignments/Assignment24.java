package BasicsAssignments;

public class Assignment24 {
	 
	//24. Write a Java program to Print the area(width *height) and perimeter(2* (width+height)) of a rectangle
	
	public void rectangle(int w, int h)
	{
		int width = w; 
		int height = h; 
		float area, periMeter;
		
		area = width * height;
		System.out.println("\nArea of Rectangle: " +area);	
		
		periMeter = (2 * (width + height));
		System.out.println("\nPerimeter of the Rectangle: " +periMeter);	
	}
	
	
	public static void main(String[] args) {
		
		int width, height;
		Assignment24 obj1 = new Assignment24();
				
		width = 4;
		height = 5;
		obj1.rectangle(width, height);
	}

}
