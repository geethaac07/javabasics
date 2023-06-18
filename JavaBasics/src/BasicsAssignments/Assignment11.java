package BasicsAssignments;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.TimeZone;

public class Assignment11 {

	public static void main(String[] args) {
			
//		11. Write A Java program to print current time in the format hh:mm:ss with time zone 		Ex : 03:15:45 PST
			
			TimeZone tzone = TimeZone.getTimeZone("America/Los_Angeles");
			
			LocalTime lTime = java.time.LocalTime.now();
			
			//LocalTime fTime = lTime.truncatedTo(ChronoUnit.SECONDS);
			
			DateTimeFormatter df = DateTimeFormatter.ofPattern("hh:mm:ss");
			
			String fT= df.format(lTime);
			
			String fZone = tzone.getDisplayName(false, 0);
			
			System.out.println("\nCurrent Time: " + fT +" " +fZone);
	}

}
