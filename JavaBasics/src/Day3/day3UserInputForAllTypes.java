package Day3;

import java.util.Scanner;

public class day3UserInputForAllTypes {
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj1= new Scanner(System.in);
		System.out.println("\n Enter Text message: \n");
		String msginput = obj1.nextLine();
		System.out.println(msginput);
		
		System.out.println("\n Enter Address: \n");
		String address1 = obj1.nextLine();
		System.out.println("\n Enter Phone: \n");
		long phone = obj1.nextLong();
		System.out.println("\n Enter true/false: \n");
		boolean yesNo = obj1.nextBoolean();
	    System.out.println("Enter Age: \n");
		int age = obj1.nextInt();
		System.out.println("Enter Name: \n");
		String name = obj1.next();
		System.out.println("Enter score: \n");
		float score = obj1.nextFloat();
		System.out.println("\n Enter Gender: \n");
		String gender = obj1.next(); 
			
		System.out.println("\n Enter Marks1: \n");
		int marks1 = obj1.nextInt();
		System.out.println("\n Enter Marks2: \n");
		int marks2 = obj1.nextInt();
		System.out.println("\n Enter Marks3: \n");
		int marks3 = obj1.nextInt();
		
		int total= marks1 + marks2 + marks3;
		
		System.out.println ("Student Information:: \n");
		
		System.out.println("Name: " +name);
		System.out.println("\nAge: " +age);
		System.out.println("\nGender: " +gender);
		System.out.println("\nAddress: " +address1);
		System.out.println("\nPhone: " +phone);
		System.out.println("\nCard Holder?: " +yesNo);
		System.out.println("\nScore: " +score);
		System.out.println("\nTotal Marks: "+total);
	
		obj1.close();
		
	}

}
