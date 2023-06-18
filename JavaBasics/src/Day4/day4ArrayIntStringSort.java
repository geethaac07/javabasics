package Day4;
import java.util.Arrays;

public class day4ArrayIntStringSort {
//int [] arrInt = new int[5];
int [] arrStr = new int [5];

int find_string(String [] fruits, String find_str)
{
	for(int i=0;i<fruits.length;i++)
	{
		if (fruits[i]==find_str)
		{
			return i;
		}
		
	}
	return -1;
	
}

 public static void sort(String arr[])
{
int n= arr.length;
String temp="";
	
for (int i=0;i<n;i++)
{
	for (int j=1;j<n-i;j++)
	{
		 if(arr[j-1].compareToIgnoreCase(arr[j])>0)
			{
			temp = arr[j-1];
			arr[j-1] = arr[j];
			
			arr[j]=temp;
		
		}
	
	}
}
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//int arr_int [] = {10,8,12,15,52};
String fruits[]= {"Apple", "Papaya", "Strawberry","Orange","Blueberry"};
String find_str = "Papaya";

day4ArrayIntStringSort obj1=new day4ArrayIntStringSort();

System.out.println("value found in location: "+obj1.find_string(fruits,find_str));
System.out.println("The length of the Array is:" +fruits.length);
//remove an element - Orange from the list
//fruits[3]="";
System.out.println ("The elements are: \n");
for (int i=0;i<fruits.length;i++) 
{
System.out.println (fruits[i]);	
}
System.out.println ("Sorting");

System.out.println ("The elements after SORTING are: \n");
sort(fruits);
//System.out.println("value found in location: " +obj1.sort(fruits));
//Arrays.sort(fruits);
for (int i=0;i<fruits.length;i++) 
{
System.out.println (fruits[i]);	
}

	}
	
}
