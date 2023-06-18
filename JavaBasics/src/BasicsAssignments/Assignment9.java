package BasicsAssignments;


import java.text.SimpleDateFormat;
import java.util.Date;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Assignment9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//9. Write a Java program to print today’s date and time.

/*		SimpleDateFormat formatDate = new SimpleDateFormat("MM-dd-YYYY hh:mm:ss");
		Date tDate = new Date();
		System.out.println("\nToday's Date and Time: " +formatDate.format(tDate)); */
		
		LocalDateTime lDTObj = LocalDateTime.now();
		DateTimeFormatter dtfObj = DateTimeFormatter.ofPattern("MM-dd-yyyy hh:mm:ss");
		String fDTime = dtfObj.format(lDTObj);
		
		System.out.println(fDTime);
		
	}

}
