package AddAssignments;

import java.util.ArrayList;
import java.util.Collections;

import java.util.Scanner;
public class FindOccur {
	


	public static void main(String[] args) 
	{
		ArrayList<Integer> num = new ArrayList<>();
		int cnt=0;
		Scanner val = new Scanner (System.in);
		
		System.out.println ("Enter values for the ArrayList");
		for (int i=0; i<=5; i++)
		{
			num.add(i, val.nextInt());
		}
		//num.set(0, 1);
		System.out.println(num);
		
		int s = num.size();
		num.sort(null);
		for (int k=0; k< s; k++)
		{
		cnt = Collections.frequency(num, num.get(k));
		
		if (cnt>1 && num.get(k).equals(num.get(k+1)))
			System.out.println (num.get(k+1) + " occurred " +cnt +" times");
		else
			System.out.println (num.get(k) + " occurred " +cnt +" time");
		}
		
		val.close();
	}

}
