import java.util.*;
public class Recursion
{
	static int t=1;
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);	
		System.out.println("Enter number:");
		int n=s.nextInt();
		Prime p=new Prime(n);
		p.Display();
	}
}
class Prime
{
	int n;
	public Prime(int a)
	{		
		n=a;
	}
	public static int isPrime(int t)
	{
		int i=2,c=0;
		while(i<=t/2)
		{
			if(t%i==0)
				c=1;
			i++;
		}	
		if(c!=1 && t!=1)
			return 1;
		else 
			return 0;
	}	
	public static void Find(int n)
	{
		int t=1,i=1;
		while(t<=n)
		{
			if(isPrime(i)==1)
			{
				t++;
				System.out.println(i);
				i++;
			}
			else
				i++;
		}
	}
	int Fact(int t)
	{
		if(t==0 || t==1)
			return 1;
		return t*Fact(t-1);
	}
	void Display()
	{
		System.out.println("Prime:");
		Find(n);		
		System.out.println("Fact of"+ n+" is:"+Fact(n));
	}
	
}
