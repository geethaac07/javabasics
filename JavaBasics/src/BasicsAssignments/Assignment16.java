package BasicsAssignments;

public class Assignment16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//16. Write a java program to find find an element in a array of elements
	
		int arr[] = {23,34,56,19,80};
		int findNum = 19;
		
		for (int i=0; i< arr.length; i++)
		{
			if (arr[i]==findNum)
				System.out.println("Element is found in position " +i);		
			
		}
		
	}

}
