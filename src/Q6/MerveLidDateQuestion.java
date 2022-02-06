package Q6;

import java.text.Format;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class MerveLidDateQuestion {

	public static void main(String[] args) {

		
		
LocalDate Time; LocalDateTime dt = LocalDateTime.of(2014, 7, 31, 1, 1);
dt.plusDays (30);
dt.plusMonths (1);
System.out.print(dt.format (DateTimeFormatter.ISO_DATE));
	//2014-07-31 yazdırır


	}
}
