import java.util.*;
import java.lang.Math;
class Details
{	
	int acco_no;
	String acco_name;
	public Details(int a,String s)
	{
		acco_no=a;
		acco_name=s;
	}
	double simpleInterest(double p,int y,double r)
	{
		return (p*y*r)/100;
	}
	double compoundInterest(double p,int y,double r,int n)
	{
		return (p*Math.pow((1+r/n),y));
	}
	void display()
	{
		System.out.println("name             :"+acco_name);
		System.out.println("account no       :"+acco_no);
	}                                            
}                                             
public class Interest
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter acco no:");
		int n=s.nextInt();
		System.out.println("Enter name:");
		String na=s.next();//Line();
		System.out.println("Enter princple, years ,rate, number of times:");
		double p=s.nextDouble();
		int y=s.nextInt();
		double r=s.nextDouble();
		int n1=s.nextInt();

		System.out.println();
		Details d=new Details(n,na);
		
		System.out.println("details");
		System.out.println("------------------------");
		d.display();
		double SI=d.simpleInterest(p,y,r);
		System.out.println("Simple Interset  :"+SI);
		double CI=d.compoundInterest(p,y,r,n1);
		System.out.println("Compound Interest:"+CI);
	}
}
