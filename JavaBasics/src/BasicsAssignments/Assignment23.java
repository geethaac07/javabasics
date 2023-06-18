package BasicsAssignments;

import java.util.Scanner;

public class Assignment23 {

	public static void main(String[] args) 
	{
//23. Write a Java program to Accept Name, Age, Gender and Aadhaar number of a person from the user and print them in separate lines
		Scanner rInput = new Scanner (System.in);
		String uName, gender;
		int age;
		long aadhaarCard;
		
		System.out.println ("Enter Your Name:");
		uName = rInput.nextLine();
		System.out.println ("Enter Your age:");
		age = rInput.nextInt();
		System.out.println ("Enter Your Gender:");
		gender = rInput.next();
		System.out.println ("Enter Your Aadhaar Card Number:");
		aadhaarCard = rInput.nextLong();
		
		System.out.println ("\nName: " +uName);
		System.out.println ("\nAge: " +age);
		System.out.println ("\nGender: " +gender);
		System.out.println ("\nAadhaar Card Number: " +aadhaarCard);
		rInput.close();
	}

}
