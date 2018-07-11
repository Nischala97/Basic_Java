import java.util.*;

class Student
{
	private String name;
	private int roll;
	private int m[]=new int[3];
	//void insertData
	Student(int id,String s,int s1,int s2,int s3)
	{
		this.name=s;
		this.roll=id;
		this.m[0]=s1;
		this.m[1]=s2;
		this.m[2]=s3;
	}
	public int avg()
	{
		return (m[0]+m[1]+m[2])/3;
	}
	void display()
	{
		System.out.println("name:"+name);
		System.out.println("roll:"+roll);
		System.out.println("avg :"+avg());
	}
}

public class Rank
{
//	Student s[];
	public static void main(String[] args)
	{
		Student s[]=new Student[3];
		int avg[]=new int[3];
		Scanner sc=new Scanner(System.in);
		/*for(int i=0;i<3;i++)
		{
			String name=sc.next();
			int roll=sc.nextInt();
			int s1=sc.nextInt();
			int s2=sc.nextInt();
			int s3=sc.nextInt(); 
			s[i]=new Student();//roll,name,s1,s2,s3);
			s[i].insertData(roll,name,s1,s2,s3);			
		}*/
		s[0]=new Student(1,"a",11,201,33);
		s[1]=new Student(2,"b",44,55,66);
		s[2]=new Student(3,"c",77,88,99);
		for(int i=0;i<3;i++)
			avg[i]=s[i].avg();
		sort(s,avg);
		for(int i=0;i<3;i++)
			s[i].display();
	}
	static void sort(Student s[],int avg[])
	{
		Student k=new Student(0,"",0,0,0);
		for(int i=1;i<3;i++)
		{
			k=s[i];
			int j=0;
			for(j=i-1;j>=0 && k.avg()<s[j].avg();j--)
			{
				s[j+1]=s[j];
				avg[j+1]=avg[j];
			}
			s[j+1]=k;
			avg[j+1]=k.avg();
		}
	}
}
