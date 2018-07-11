public class TestInherit
{
	//void f()
	private static void f()
	{
		System.out.println("in A:f()");
	}
	public static void main(String[] args)
	{
		TestInherit c=new B();
		c.f();
	}
}
class B extends TestInherit
{
	public void f()
	{
		System.out.println("in B:f()");
	}
}
