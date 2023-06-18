package AddAssignments;

import java.util.Scanner;
import java.lang.Math;

public class RomToInt {

	int rAssign(char s)
	{
		if (s=='I')
			return 1;
		if (s=='V')
			return 5;
		if (s=='X')
			return 10;
		if (s=='L')
			return 50;
		if (s=='C')
			return 100;
		if (s=='D')
			return 500;
		if (s=='M')
			return 1000;
		return -1;
		}
	
	int iConvert(String str)
	{
		int add = 0;
		int p1, p2;
		int len = str.length();
		for (int i=0; i<len;i++)
		{
			p1 = rAssign(str.charAt(i));
			//System.out.println(p1);
			
			if (i+1 <len)
			{
			p2 = rAssign(str.charAt(i+1));
			if (p1 >= p2)
			{
				add = add + p1;
			
			}
			else 
			{
				add = add - p1;
			
			}
			}
			else 
			{
				add = add + p1;
			
			}
		}
		return add;
	}
		
	
	
	
	public static void main(String[] args) {
	
		String rNum;
		RomToInt robj = new RomToInt();
		Scanner rInt= new Scanner(System.in);
		System.out.println ("Enter the Roman letters: ");
		rNum = rInt.next();
		System.out.println("Converted int value is: ");
		System.out.println(robj.iConvert(rNum));
		

		rInt.close();
	}

}
