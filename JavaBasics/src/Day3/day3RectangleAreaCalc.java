package Day3;

public class day3RectangleAreaCalc {
	int areaCalc, perimeter;
	int length, width;
	
	day3RectangleAreaCalc(int _length, int _width)
	{
		length =_length;
		width =_width;
	}
	void area()
	{
		areaCalc = length * width;	
		System.out.println("Area of the rectangle: " +areaCalc);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		day3RectangleAreaCalc r1=new day3RectangleAreaCalc(4,5);
		day3RectangleAreaCalc r2=new day3RectangleAreaCalc(5,8);
	
	r1.area();
	r2.area();
			
	}
}
