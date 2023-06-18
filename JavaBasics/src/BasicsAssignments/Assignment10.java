package BasicsAssignments;

import java.text.SimpleDateFormat;
import java.util.Date;

import java.time.LocalDate;
import java.time.format.*;

public class Assignment10 {

	public static void main(String[] args) {
		
		//10. Write a Java program to print today’s date in the format DD/MM/yyyy
		
		SimpleDateFormat formattedDate = new SimpleDateFormat("dd-MM-YYYY");
		Date tFdate = new Date();
		System.out.println("\nToday's Date (DD/MM/YYYY): " +formattedDate.format(tFdate));
		
		//LocalDate ld = LocalDate.now();
		//DateTimeFormatter df = DateTimeFormatter.ofPattern("MM-dd-yyyy");
		//String fDate=df.format(ld);
	//	System.out.println("\\nToday's Date (DD/MM/YYYY):" +fDate);
		
	}

}
