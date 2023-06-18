package AddAssignments;

import java.util.Arrays;
import java.util.Scanner;

public class FindOccurInArray 
{

	public static void main(String[] args) 
	{
		int num [] = {1,3,23,45,4,3,23};
		int len = num.length;
		int count[]= new int[len];
		int i,j;
		int cnt;
		
		for (i=0; i<len; i++)
		{
			cnt=1;
			for (j= i+1; j< len; j++)
			{
			
			if (num[i] == num [j])
			
				{
				cnt++;
				count[j] = -1;
				}
			}
			if (count[i] != -1)
			{
			count[i]=cnt;
			}		
		} 

		for (i=0; i<len; i++)
		{
			if (count[i]!= -1)
			{
			if (count[i]>1)
			System.out.println (num [i] + " occured of " +count[i] +" times");
			else 
				System.out.println (num [i] + " occured of " +count[i] +" time");
			}
		}
		  
	
	}
}
