import java.util.*;

class Det
{
	private String name;
	private int roll;
	private double m[]=new double[3];
	Det(String s,int no,double s1,double s2,double s3)
	{
		this.name=s;
		this.roll=no;
		this.m[0]=s1;
		this.m[1]=s2;
		this.m[2]=s3;
	}
	public double total()
	{
		return m[0]+m[1]+m[2];
	}
	public double avg()
	{
		return (m[0]+m[1]+m[2])/3;
	}
	void display()
	{
		System.out.println("name:"+name);
		System.out.println("roll:"+roll);
	}
}

public class Student
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number:");
		int n=s.nextInt();
		double a[]=new double[n];
		double t[]=new double[n];		
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter name ,roll ,m1 ,m2 ,m3");
			String name=s.next();
			int roll=s.nextInt();
			double s1=s.nextDouble();
			double s2=s.nextDouble();
			double s3=s.nextDouble(); 
			Det d=new Det(name,roll,s1,s2,s3);
			//d.display();
			//t[i]=d.total();
			a[i]=d.avg();
			//System.out.print("total:"+d.total());
			//System.out.print("avg:"+d.avg());
			System.out.println();
		}  
		/*for(int i:t)
		{
			System.out.print(i+" ");
		} */
		System.out.println("before soretd");    	
		for(double i:a)
		{
			System.out.println(i+" ");
		}
		System.out.println("sorted");
		sort(a,n);
		for(double i:a)
		{
			System.out.println(i+" ");
		}
	}
	public static void sort(double num[],int n)
	{
		for(int i=1;i<n;i++)
		{
			double k=num[i];
			int j=0;
			for(j=i-1;j>=0 && k<num[j];j--)
			{
				num[j+1]=num[j];
			}
			num[j+1]=k;
		}
	}
}
