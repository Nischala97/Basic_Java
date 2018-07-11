import java.time.*;

class Q2
{
	public static void main(String[] args)
	{
		String s=new String("Hello");
		LocalTime t=LocalTime.now();
		for(int i=0;i<1000;i++)
			s=s+String.valueOf(i);
		LocalTime t1=LocalTime.now();
		System.out.println("Time is "+(t1.getNano()-t.getNano()));

		StringBuffer sbuff=new StringBuffer("Hello");
		t=LocalTime.now();
		for(int i=0;i<1000;i++)
			sbuff.append(String.valueOf(i));
		t1=LocalTime.now();
		System.out.println("Time is "+(t1.getNano()-t.getNano()));

		StringBuilder sbuild=new StringBuilder("Hello");
		t=LocalTime.now();
		for(int i=0;i<1000;i++)
			sbuild.append(String.valueOf(i));
		t1=LocalTime.now();
		System.out.println("Time is "+(t1.getNano()-t.getNano()));
	}
}
