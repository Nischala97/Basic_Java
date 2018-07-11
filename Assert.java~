import java.util.*;
public class MinBalanceException extends Exception
{
	String msg;
	public MinBalanceException(String msg)
	{
		super(msg);
		this.msg=msg;
	}
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number");		
		int a=s.nextInt();
	
		try
		{
			System.out.println("Enter balance");
			int b=s.nextInt();
			if(b<1000)
			{
				Assert a=new Assert("minimum balance of 1000 needed");
				throw a;
			}
			System.out.println(b+" met requirement");
		}
		catch(MinBalanceException a)
		{
			System.out.println("Error"+a.getMessage());
		}
		assert a<100:"Should be less than 100";
		System.out.println("square of "+a+" is "+(a*a));
	}
}
