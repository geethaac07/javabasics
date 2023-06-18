package Day2;

import java.util.Scanner;

public class day2exercises1to4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		
//Use of do-while loop, while loop		
// 1.1 do-while loop	
		
	int i=0;
		do
		{
			System.out.println("Welcome");
			i++;
		}while(i<5);
		
// 1.2 while loop
		i=0;
	while (i<=4)
	{
		System.out.println(i);
		i++;
	}
// ex-2 Get input for the tables to create multiplication table and print

	Scanner obj1= new Scanner(System.in);

	System.out.println("Enter the number to create table: " );
		i = obj1.nextInt();  // Read user input
		System.out.println("Multiplication table created for: " +i); 

		int j=1;
		do {
			System.out.println(j +"*" +i +"=" +(i*j));
			j++;
		}while (j<=10);

obj1.close();


		//Get input for three numbers and find 1st biggest, 2nd biggest, and the 3rd big number
		Scanner obj2= new Scanner(System.in);	
		System.out.println("Enter the number1");
		int i = obj2.nextInt();
		System.out.println("Enter the number2");
		int j = obj2.nextInt();
		System.out.println("Enter the number3");
		int k = obj2.nextInt();
		int fLargest,sLargest,tLargest;
	
		fLargest=Math.max(Math.max(i,j),k);
			if ((i>j) && (i>k))
			{
				fLargest=i;
				System.out.println(fLargest +"is the first biggest number");
				if (j>k)
				{
				sLargest =j;
				tLargest=k;
				System.out.println(sLargest +"is the second biggest number");			 		
				System.out.println(tLargest +"is the third biggest number");
				}
				else
				{
					sLargest =k;
					tLargest=j;
					System.out.println(sLargest +"is the second biggest number");			 		
					System.out.println(tLargest +"is the third biggest number");	
				}
			}	
			else if	 ((j>i) && (j>k))
				{
					fLargest=j;
					System.out.println(fLargest +"is the first biggest number");
					if (k >i)
					{
					sLargest =k;
					tLargest=i;
					System.out.println(sLargest +"is the second biggest number");	
					System.out.println(tLargest +"is the third biggest number");
					}
					else
					{
						sLargest =i;
						tLargest=k;
						System.out.println(sLargest +"is the second biggest number");	
						System.out.println(tLargest +"is the third biggest number");	
					}
				}
			else
			{
				if ((k>i) && (k>j))
				{
					fLargest=k;
					System.out.println(fLargest +"is the first biggest number");
					if (j >i)
					{
					sLargest =j;
					tLargest=i;
					System.out.println(sLargest +"is the second biggest number");	
					System.out.println(tLargest +"is the third biggest number");
					}
					else
					{
						sLargest =i;
						tLargest=j;
						System.out.println(sLargest +"is the second biggest number");	
						System.out.println(tLargest +"is the third biggest number");	
					}
				}
			}

		obj2.close();
*/
		//Swap two variables without using third variable
		int a, b;
		Scanner obj3= new Scanner(System.in);	
		System.out.println("Enter the first value a: ");
		a= obj3.nextInt();
		System.out.println("Enter the second value b: ");
		b= obj3.nextInt();
		
		System.out.println("Values BEFORE Swapping: \n a="+a+"b="+b);
		a= a+b; // a=10;b=15; a = 10+15; a =25; b=15; b=a-b;=> 25-15= 10; b=10; a=a-b;
		
		b= a-b;
		
		a=a-b;
		System.out.println("Values AFTER Swapping: \n a="+a+"b="+b);
		
		obj3.close();
	}
}
