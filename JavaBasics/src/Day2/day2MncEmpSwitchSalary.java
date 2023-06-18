package Day2;

import java.util.Scanner;

public class day2MncEmpSwitchSalary {

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

		//exp 3-5 =>10%,exp 6-9 => 15%, exp 10-20 =>20%; others => 25%; for reward add 1000 Rs.
		switch (exp)
		{

		case 3: case 4: case 5:
		{	
			if (gotReward==true) 
			{
				 revSalary =(float) (oldSalary + (oldSalary * 0.10)+1000);
			 	 System.out.println("Employee's Revised Salaray is:" +revSalary);
			 }
			 else
			 {
				 revSalary =(float) (oldSalary + (oldSalary * 0.10));
				 System.out.println("Employee's Revised Salaray is:" +revSalary); 
			}
			break;
		}
		case 6: case 7: case 8:	case 9:	
		{
			if (gotReward==true)
				{
					 revSalary =(float) (oldSalary + (oldSalary * 0.15)+1000);
				 	 System.out.println("Employee's Revised Salaray is:" +revSalary);
				 }
				 else
				 {
					 revSalary =(float) (oldSalary + (oldSalary * 0.15));
					 System.out.println("Employee's Revised Salaray is:" +revSalary); 
				}
			break;
		}
		case 10: case 11: case 12: case 13: case 14: case 15: case 16: case 17: case 18: case 19: case 20:
		
		{	
				if (gotReward==true) 
				{
					 revSalary =(float) (oldSalary + (oldSalary * 0.20)+1000);
				 	 System.out.println("Employee's Revised Salaray is:" +revSalary);
				 }
				 else
				 {
					 revSalary =(float) (oldSalary + (oldSalary * 0.20));
					 System.out.println("Employee's Revised Salaray is:" +revSalary); 
				 }
				break;
		}	
		default:	
		{
			if (gotReward==true) 
			{
				 revSalary =(float) (oldSalary + (oldSalary * 0.25)+1000);
			 	 System.out.println("Employee's Revised Salaray is:" +revSalary);
			 }
			 else
			 {
				 revSalary =(float) (oldSalary + (oldSalary * 0.25));
				 System.out.println("Employee's Revised Salaray is:" +revSalary); 
			}
			
			break;
		}
		}
		getValue.close();
	}

}
