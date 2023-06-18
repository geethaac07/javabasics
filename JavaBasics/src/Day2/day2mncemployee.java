	package Day2;

import java.util.Scanner;

public class day2mncemployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int oldSalary, exp;
float revSalary;
boolean gotReward;
Scanner getValue= new Scanner(System.in);
System.out.println("Enter the old salary:\n");
oldSalary=getValue.nextInt();

System.out.println("Enter the years of experience:\n");
exp=getValue.nextInt();

System.out.println("Employee got the reward - enter true or false::");
gotReward=getValue.nextBoolean();


//System.out.println("\n" +reward);

//3-5 =>10%,6-9 => 15%,10-20 =>20%; others => 25%; for reward add 1000 Rs.
switch (exp)
{

default:
	if (exp>=3 && exp<=5)
	{
	if (gotReward=true) 
	{
		 revSalary =(float) (oldSalary + (oldSalary * 0.10)+1000);
	 	 System.out.println("Employee's Revised Salaray is:" +revSalary);
	 }
	 else
	 {
		 revSalary =(float) (oldSalary + (oldSalary * 0.10));
		 System.out.println("Employee's Revised Salaray is:" +revSalary); 
	}
	}
	else if (exp>=6 && exp<=9)
	{
		if (gotReward=true)
		{
			 revSalary =(float) (oldSalary + (oldSalary * 0.15)+1000);
		 	 System.out.println("Employee's Revised Salaray is:" +revSalary);
		 }
		 else
		 {
			 revSalary =(float) (oldSalary + (oldSalary * 0.15));
			 System.out.println("Employee's Revised Salaray is:" +revSalary); 
		}
	}
	else if (exp>=10 && exp<=20)
	{
		if (gotReward=true) 
		{
			 revSalary =(float) (oldSalary + (oldSalary * 0.20)+1000);
		 	 System.out.println("Employee's Revised Salaray is:" +revSalary);
		 }
		 else
		 {
			 revSalary =(float) (oldSalary + (oldSalary * 0.20));
			 System.out.println("Employee's Revised Salaray is:" +revSalary); 
		}
		}
	if (exp>=20)
	{
		
	if (gotReward=true) 
	{
		 revSalary =(float) (oldSalary + (oldSalary * 0.25)+1000);
	 	 System.out.println("Employee's Revised Salaray is:" +revSalary);
	 }
	 else
	 {
		 revSalary =(float) (oldSalary + (oldSalary * 0.25));
		 System.out.println("Employee's Revised Salaray is:" +revSalary); 
	}
	}
	break;
}
getValue.close();
	}

}
