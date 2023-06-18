package BasicsAssignments;

public class Assignment8 {

	public static void main(String[] args) {
	
	//8. Write a Java program to convert float to double and convert double to float
	
		float floatVar1 = 34.235f;
		double dblVar1 = 54.568972309;
		
		float conToFloat;
		double conToDouble;
		
		conToFloat = (float) dblVar1;
		
		conToDouble = floatVar1;
		
		System.out.println("\nConverting float value to double: " + conToDouble);
		
		System.out.println("\nConverting double value to float "+ conToFloat);
		
	}

}
