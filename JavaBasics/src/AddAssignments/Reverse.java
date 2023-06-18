package AddAssignments;

public class Reverse {

	public static void main(String[] args) {
		
		String str = "I am a good boy"; 
		
		System.out.println("string: " +str);
		
		String[] s1 = str.split ("\s");
		
		for (String s:s1)
		{
		StringBuffer sb = new StringBuffer(s);
		System.out.print(sb.reverse());
		System.out.print(" ");
		}
	

	}

}
