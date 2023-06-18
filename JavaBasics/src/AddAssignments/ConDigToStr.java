package AddAssignments;

public class ConDigToStr {

	public static void main(String[] args) {
		String numVal = "1253";
		char c1;
		int strLen= numVal.length();
		
		for (int i=0;i<strLen ;i++)
		{
		c1 = numVal.charAt(i);
		
		
		switch (c1)
		{
		case '1':
			System.out.print("one");
			break;
		case '2':
			System.out.print("two");
			break;
		case '3':
			System.out.print("three");
			break;
		case '4':
			System.out.print("four");
			break;
		case '5':
			System.out.print("five");
			break;
		case '6':
			System.out.print("six");
			break;
		case '7':
			System.out.print("seven");
			break;
		case '8':
			System.out.print("eight");
			break;
		case '9':
			System.out.print("nine");
			break;
		case '0':
			System.out.print("zero");
			break;
		default:
			System.out.println("not working");
			break;
		}
		System.out.print(" ");
		}
		//System.out.println(c1);
	}

}
