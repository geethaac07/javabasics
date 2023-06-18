package AddAssignments;

import java.util.Scanner;

public class totalIntchars {

	public static void main(String[] args) {
		// find total number of integers, uppercase and lowercase character in the give
		// string
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the string");
		String str = scn.next();
		int uCase = 0;
		int lCase = 0;
		int numbers = 0;
		char[] ch = str.toCharArray();
		for (char c : ch) {
			if (c >= 'A' && c <= 'Z') {
				uCase++;
			} else if (c >= 'a' && c <= 'z') {
				lCase++;
			} else if (c >= '0' && c <= '9')
				numbers++;
		}
		
		System.out.println("\nUpperCase Count=" + uCase + "\nLowerCase count= " + lCase + "\nIntegers count=" + numbers);
		scn.close();
	}

}
