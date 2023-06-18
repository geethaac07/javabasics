package Day5;

import java.util.Scanner;

public class FindFreqStrings {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the String: ");
		
		String str = s.nextLine() ;
		
		int strLen = str.length();
		char chArr[] = new char[strLen];
		int cnt;
		int count[] = new int[strLen];
		
		
		
		for (int i=0; i<strLen; i++)
		{
		 chArr[i] = str.charAt(i);
		}
		System.out.println("The Char Array Elements are: ");
		for (int i=0; i<strLen; i++)
		{
		 System.out.println(chArr[i]);
		}
		
		for(int i=0; i<strLen ; i++)
		{
			cnt=1;
			for(int j=i+1; j<strLen; j++)
			{
				if (chArr[i] == chArr[j])
				{
					cnt++;
					count[j]= -1;
				}
			}	
				if(count[i] != -1)
				{
					count[i] = cnt;
					//System.out.println(chArr[i] + " " +count[i]);
				}
			
		}
		
		for(int i=0; i<chArr.length;i++)
		{
			if (count[i] != -1)
			{
				if (count[i]>1)
					System.out.println (chArr[i] +" occurred " +count[i] +" times");
				else 
					System.out.println (chArr[i] +" occurred " +count[i] +" time");
			}
		}
	s.close();	
	}

}
