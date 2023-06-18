package Day3;

public class day3ClassMethodExercises {
	
		String name;
		int roll_no;
		long phone_no;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Ex1,2 - Assign values for the attributes of the class		, for two students
		day3ClassMethodExercises s1 =new day3ClassMethodExercises();
		s1.name="John";
		s1.roll_no=2;
		s1.phone_no=90982;
		
		day3ClassMethodExercises s2 =new day3ClassMethodExercises();
		s2.name="Sam";
		s2.roll_no=12;
		s2.phone_no=920894;
		
		System.out.println("Student name:" +s1.name +"\nRoll no:"+s1.roll_no +"\nPhone No:" +s1.phone_no);
		System.out.println("\n\nStudent name:" +s2.name +"\nRoll no:"+s2.roll_no +"\nPhone No:" +s2.phone_no);
		}
}
