package Day4;
//import java.util.Arrays;

public class day4ArraySort {
	int arrInt []= new int [5];
	public void sort(int arr[])
	{
	int n= arr.length;
	int temp=0;
		
	
	
	for (int i=0;i<n;i++)
	{
		for (int j=1;j<n-i;j++)
		{
			if (arr[j-1]> arr[j])
			{
				temp=arr[j-1];
				arr[j-1]=arr[j];
				
				arr[j]=temp;
			}
		
		}
	}
	//	System.out.println(arr[0]);
	
	}
	
public static void main (String [] args)
{
	
			int arr_ids []= {21,22,33,6,15};
			//System.out.println(arr_ids[2]);
			//day4ArraySort at= new day4ArraySort();	
					
			//at.sort(arr_ids);
		//Arrays.sort(arr_ids);
			int l= arr_ids.length;
				
			for (int i=0;i<l;i++)
				{
					System.out.println("the sorted array is:" +arr_ids[i]);
				}
			
}
	
}
