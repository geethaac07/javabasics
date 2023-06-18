package Day5;

import java.util.Scanner;

public class RecursionMethod {
	 public String strRev(String str){
		   //System.out.println(str.charAt(0));
	      if(str.isEmpty() || str.length()<=0){
	         return str;
	      } else {
	         return strRev(str.substring(1))+str.charAt(0);
	      }
	   
	   }
	public static void main(String[] args) {
		/*	    int result = sum(10);
			    System.out.println(result);
			  }
			  public static int sum(int k) {
			    if (k > 0) {
			      return k + sum(k - 1);
			    } else {
			      return 0;
			    }*/

		RecursionMethod obj = new RecursionMethod();
		Scanner getInput=new Scanner(System.in);
	
		System.out.println("Enter the string to reverse: ");
		String text = getInput.next();
		
		String result = obj.strRev(text);
		     
		   System.out.println(result);
		   getInput.close();
	}

}
