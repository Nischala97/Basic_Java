import java.util.*;

public class Try
{
	public static void main(String[] args)
	{
		int a=0;
		//Scanner s=new Scanner(System.in);
		do{		
		try
		{
			Scanner s=new Scanner(System.in);
			System.out.println("Enter value:");
			a=s.nextInt();
			int res=12/a;
			System.out.println("result is:"+res);
		}
		catch(ArithmeticException | InputMismatchException ai )
		{
			System.out.println("only non-zero values only integer values");
			System.out.println(ai.getMessage());	
	//		System.out.println("only non-zero values "+ae.getMessage());
		}
	/*	catch(InputMismatchException ie)
		{
			System.out.println("only integer values "+ie.getMessage());
		}
		catch(Exception e)
		{
			System.out.println("Error");
		}
		finally
		{
			System.out.println("This is the last block of code");
		}
	*/	}while(a==0);	
	}
}
