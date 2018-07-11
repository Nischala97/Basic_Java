import java.util.*;

public class Try1
{
	public static void main(String[] args)
	{
		int a[]={1,2,3,4,5};
		int n=0;
		do{		
		try
		{
			Scanner s=new Scanner(System.in);
			System.out.println("Enter value:");
			n=s.nextInt();
			System.out.println(n+"th array index is "+a[n]);
		}
		catch(ArrayIndexOutOfBoundsException ae)
		{
			System.out.println("Index is out of bound at "+ ae.getMessage());
		}
		}while(n>=a.length);
	}
}
