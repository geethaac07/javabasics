package Day3;

import java.util.Scanner;

public class day3FindAvgOf3Nos {
	int x,y,z, sum;
	float avg;
// Ex -5 average of 3 numbers; classname average, method to cal average	
	public void sumCalc()
	{
		Scanner obj1= new Scanner(System.in);
		
		System.out.println ("Enter number1 :");
		x = obj1.nextInt();
		System.out.println ("Enter number2 :");
		y = obj1.nextInt();
		System.out.println ("Enter number3 :");
		z = obj1.nextInt();
		
		sum = x+y+z;
		System.out.println ("Average of three numbers is :" +sum);
		obj1.close();
	}
	public void Average()
	{
		avg =(float) sum/3;
		System.out.println ("Average of three numbers is :" +avg);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		day3FindAvgOf3Nos a1 =new day3FindAvgOf3Nos();
		
		a1.sumCalc();
		a1.Average();
		
	}

}
