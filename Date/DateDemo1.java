import java.time.*;
import java.time.format.*;
class DateDemo1
{
	public static void main(String[] args)
	{
		// Birth
	/*	DateTimeFormatter f=DateTimeFormatter.ofPattern("dd/MM/yyy");
		LocalDate date=LocalDate.parse("22/04/1997",f);	
		LocalDate date1=LocalDate.now();
		System.out.println("age="+(date1.getYear()-date.getYear()));
	*/	
	/*	//Increase salary every month
		LocalDate start=LocalDate.of(2018,6,29);
		LocalDate end=LocalDate.of(2018,9,29);
		Period period=Period.ofMonths(1);
		while(start.compareTo(end)<0)
		{
			System.out.println("Increase salary");
			start=start.plus(period);
		}
	*/
	/*	LocalDate date=LocalDate.now();
		date=date.plusWeeks(1);	
		System.out.println("next friday is on "+date);
	*/
		LocalDateTime dateTime=LocalDateTime.now();
		DateTimeFormatter shortf=DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
		DateTimeFormatter mediumf=DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
		DateTimeFormatter longf=DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG);
		DateTimeFormatter fullf=DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL);
	
		System.out.println("short:"+shortf.format(dateTime));
		System.out.println("medium:"+mediumf.format(dateTime));
		//System.out.println("long:"+longf.format(dateTime));
		System.out.println("full:"+fullf.format(dateTime));
	}
}



