package chapter_3_core_java_api;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Date;

public class DatesAndTimes {

	public static void main(String[] args) {
		LocalDate.now(); // date now
		LocalTime.now(); // time now
		LocalDateTime.now(); // date and time now

		LocalDate ld = LocalDate.of(2020, Month.APRIL, 8); // creating your own date; month is enum
		LocalTime lt = LocalTime.of(15, 18); // can add seconds, nanoseconds..
		LocalDateTime ldt = LocalDateTime.of(ld, lt);
		// can`t create t,d and dt object like other classes (new keyword)

		Date d = new Date(); // older version; don`t use
		System.out.println(d);

		ldt = ldt.minusYears(1).minusDays(2);
		// minus years and days (also have minus or plus days, months, hours, seconds...

		// Class periods
		LocalDate ld1 = LocalDate.now();
		LocalDate ld2 = LocalDate.of(2023, Month.JANUARY, 15);
		Period period = Period.between(ld1, ld2);
		Period period2 = Period.ofDays(5);
		System.out.println(period);
		System.out.println(ld1.plus(period2));

		
		// Formating dates and times
		LocalDate ldFormating = LocalDate.of(2020, Month.APRIL, 8);
		System.out.println(ldFormating.getMonth()); // method get something day, month...
		System.out.println(ldFormating); // standard time
		System.out.println(ldFormating.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)));
		// time in my country

		// FORMATING like we want; mm for minutes
		DateTimeFormatter f = DateTimeFormatter.ofPattern("MMMM dd yyy ");
		System.out.println(ldFormating.format(f));
		
	}

}
