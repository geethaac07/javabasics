package BasicsAssignments;

import java.util.Scanner;

public class Assignment4 {

	public static void main(String[] args) 
	{
		Scanner getNum = new Scanner(System.in);
		System.out.println("Enter the First number:");
		int x = getNum.nextInt();
		System.out.println("Enter the Second number:");
		int y = getNum.nextInt();
		
		System.out.println("\n" +x +" + " +y +" = " +(x+y));
		System.out.println("\n" +x +" - " +y +" = " +(x-y));
		System.out.println("\n" +x +" x " +y +" = " +(x*y));
		System.out.println("\n" +x +" / " +y +" = " +(x/y));
		System.out.println("\n" +x+" mod "+y+" = " +(x%y));
		
		getNum.close();
	}

}
