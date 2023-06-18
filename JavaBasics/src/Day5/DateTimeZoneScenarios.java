package Day5;

import java.util.TimeZone;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DateTimeZoneScenarios {

	

	public static void main(String[] args) 
	{
		LocalDate lDate = LocalDate.now();
		
		
		System.out.println(lDate.format(DateTimeFormatter.ISO_DATE));
		
		TimeZone tZ = TimeZone.getTimeZone("America/Chicago");
		System.out.println(tZ.getDisplayName(false,0));
		
		
		LocalDateTime lTime = LocalDateTime.now();
		
		System.out.println(lTime);
		
		System.out.println(lTime.format(DateTimeFormatter.ISO_TIME));
		
		System.out.println(lTime.truncatedTo(ChronoUnit.SECONDS));
	}
}
