package BasicsAssignments;

public class Assignment7 {

	public static void main(String[] args) {
			
	//7. Write a Java program and compute the sum of the digits of an integer.
		int rNum, intNum = 234;
		int sum=0;

		System.out.println("Sum of the digits of the integer "+intNum+" is: ");	
		
		int count = 0;
		while (intNum>0)
		{
		rNum = intNum % 10;
		
		sum= sum + rNum;
					
		intNum = intNum/10;
		count++;
		}
		
		System.out.print(+sum);	
	
	}

}
