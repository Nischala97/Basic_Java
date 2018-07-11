import java.time.*;
import java.time.format.*;
class DateDemo
{
	public static void main(String[] args)
	{
	/*	System.out.println("Current date and time");
		System.out.println(LocalDate.now());
		System.out.println(LocalTime.now());
		System.out.println(LocalDateTime.now());
	*/
	/*	System.out.println("date input given");
		LocalDate date1=LocalDate.of(2018,Month.JUNE,29); //MONTH NAME ONLY IN CAPS
		LocalDate date2=LocalDate.of(2018,6,29);
		System.out.println(date1);
		System.out.println(date2);
	*/
	/*	System.out.println("time input given");
		LocalTime time1=LocalTime.of(6,15); //hours and min
		LocalTime time2=LocalTime.of(6,15,33); //hours and min and sec
		LocalTime time3=LocalTime.of(6,15,33,587); //hours and min and sec and nano
		System.out.println("t:"+time1);
		System.out.println("t:"+time2);
		System.out.println("t:"+time3);
	*/
	/*	LocalDate date3=date1.plusDays(1);
		System.out.println(date3);		
		date3=date3.plusWeeks(1);
		System.out.println(date3);
		date3=date3.plusMonths(1);
		System.out.println(date3);
	*/
	/*	LocalDateTime dateTime=LocalDateTime.of(date1,time1);
		System.out.println(dateTime);
		dateTime = dateTime.minusDays(2);
		System.out.println(dateTime);
		dateTime = dateTime.minusHours(10);
		System.out.println(dateTime);
		dateTime = dateTime.minusSeconds(30);
		System.out.println(dateTime);

		Period period=Period.ofWeeks(1);
		System.out.println(date1.plus(period));
		System.out.println(dateTime.plus(period));
//		System.out.println(time1.plus(period));
	*/
	
	
	/*	LocalDateTime dateTime=LocalDateTime.now();	
		// DateTimeFormatter decides the style(we specify the style)
		DateTimeFormatter shortF =DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
		DateTimeFormatter mediumF =DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
		System.out.println(shortF.format(dateTime)); // .format applies the style to the object
		System.out.println(mediumF.format(dateTime));
	*/
		DateTimeFormatter f=DateTimeFormatter.ofPattern("MMM:d:yy");
		System.out.println(f.format(LocalDateTime.now()));
//		System.out.println(f.format(LocalTime.now()));
		System.out.println(f.format(LocalDate.now()));

		DateTimeFormatter f1=DateTimeFormatter.ofPattern("mm:hh:ss");
		System.out.println(LocalDate.parse("Jun:29:18",f));
		System.out.println(LocalTime.parse("44:6:33",f1));		
	}
}



