package amazon_pac;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;

public class Datetime_ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DateTimeFormatter formatter=DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
		DateTimeFormatter formatter1=DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
		DateTimeFormatter formatter2=DateTimeFormatter.ofPattern("dd//MM//yyyy");
		LocalDate n=LocalDate.now();
		System.out.println(n.format(formatter));
		System.out.println(n.format(formatter1));
		System.out.println(n.format(formatter2));
		System.out.println(n.plusDays(1));
		System.out.println(n.minusMonths(1));
		System.out.println(n.isLeapYear());
		System.out.println(n.withDayOfMonth(30));
		
		ZonedDateTime z=ZonedDateTime.now();
		ZonedDateTime p=ZonedDateTime.now(ZoneId.of("Europe/Paris"));
		System.out.println(z);
		System.out.println(p);
		
		LocalDate ld=LocalDate.of(1997,Month.AUGUST,15);
		LocalDate td=LocalDate.now();
		Period pe=ld.until(td);
		
		System.out.println("Days:"+pe.get(ChronoUnit.DAYS));
		System.out.println("Months:"+pe.get(ChronoUnit.MONTHS));
		System.out.println("Years:"+pe.get(ChronoUnit.YEARS));
		
		
		
		
				
		
		

	}

}
