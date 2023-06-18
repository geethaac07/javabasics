package BasicsAssignments;

public class Assignment6 {

	public static void main(String[] args) {
		//Write a Java program to convert a decimal number to binary number
		
		int dNum = 15;
		int bNum [] = new int[5];
		int i=0;
		
		 System.out.println("The binary number of the given number " +dNum +" is:");
		 
		 while(dNum != 0)
		 {    
		    bNum [i]= (dNum  %2) ;
		    i++;
		    dNum = dNum/2;   
		    	
		 }
		 for (int j=0; j< bNum.length; j++)
		 {
			 System.out.print(bNum[j]);
		 }
	}

}
