import java.util.*;

public class FirstPrime
{
	static int t=1;
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);	
		System.out.println("Enter number:");
		int n=s.nextInt();
		FirstPrime f=new FirstPrime();
		//Prime p=new Prime();
		//p.isPrime(n);
		f.isPrime(n);
	}
	public static int isPrime(int n)
	{
		int i=2,c=0;
//		int t=1;
		while(i<=t/2)
		{
			if(t%i==0)
				c=1;
			i++;
		}	
		if(c!=1 && t!=1){
			System.out.println(t);
				n--;			
		}
		t++;
		if(n>0) 
			return isPrime(n);
		else	
			return 0;
	}
	
}

//class Prime
//{
	/*public int isPrime(int t)
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
	public void find(int n)
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
	}*/
/*	public int isPrime(int n)
	{
		int i=2,c=0;
//		int t=1;
		while(i<=t/2)
		{
			if(t%i==0)
				c=1;
			i++;
		}	
		if(c!=0){
			System.out.println(t);
				n--;			
		}
		t++;
		if(n>0) 
			return isPrime(n);
		else	
			return 0;
	}
	
}*/


