class Det
{
	public final static void display(int a)
	{
		System.out.println("a:"+a);
	}
	public final static void display(int a,int b)
	{
		System.out.println("a:"+a+" b:"+b);
	}
	public final static void display(int a,int b,int c)
	{
		System.out.println("a:"+a+" b:"+b+" c:"+c);
	}
}
public class Display
{
	public static void main(String[] args)
	{
		Det.display(1);
		Det.display(1,2);
		Det.display(1,2,3);	
	}	
}
