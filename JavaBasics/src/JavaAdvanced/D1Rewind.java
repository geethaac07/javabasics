package JavaAdvanced;

import java.util.Arrays;

public class D1Rewind 
{
public void swap(int i, int j)
{
	int int1,int2;

	int1 = j;
	int2 = i;
	
	}
	public static void main(String[] args)
	{
		int arr1 [] = {1,9,4,7,6};
					
		/*Arrays.sort(arr1);
		
		for (int j:arr1)
		{
			System.out.println(j);
		}*/
		for (int i=0; i<arr1.length; i++)
		{
			for (int j=i+1; j<arr1.length; j++)
			{
				if (arr1[i] > arr1 [j])
				{
					int temp = arr1[j];
					arr1[j]= arr1[i];
					arr1[i]=temp;
				}
			}
		}
	
		
	}
}
