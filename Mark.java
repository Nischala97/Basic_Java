/*public class Mark
{
	final int s1;//=90;
//	void update()
	Mark()
	{
		s1=400;
	}
	public static void main(String[] args)
	{
		Mark m1=new Mark();
//		m1.update();
		System.out.println(m1.s1);
	}
}
*/
////////////////////////////////////////////////////////////////////////////////////////////////////
/*
public class Mark
{
	static {System.out.println("Static block is invoked");}
	static{System.out.println("Static block 2 is invoked");}
	public static void main(String[] args)
	{
		System.out.println("main");	
		Mark1 m=new Mark1();
		m.display();
	}
	//static void display()
	//{
	//	System.out.println("display method");
	//}
}
class Mark1
{
	static void display()
	{
		System.out.println("display method");
	}
}*/
//////////////////////////////////////////////////////////////////////////////////////////////////
class Mark1
{
	public final static void display()
	{
		System.out.println("disp");
	}
}
class Mark2 extends Mark1
{
	public final static void display()
	{
		System.out.println("disp1");
	}
}
public class Mark
{
	public static void main(String[] args)
	{
		Mark2.display();
	}
}
