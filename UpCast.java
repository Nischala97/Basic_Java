class A
{
	void m1()
	{System.out.println("m1");}
}
class B extends A
{
	void m2()
	{System.out.println("m2");}
}
class C extends B
{
	void m3()
	{System.out.println("m3");}
}
class UpCast
{
	public static void main(String[] args)
	{
		C c=new C();
		B b=c;
		A a=b;
		Object o=c;
// This shows that only one obj is created for all the cases,as we are passing only one object.
System.out.println(a);
System.out.println(b);
System.out.println(c);
		c.m1();
		c.m2();
		c.m3();
	}
}
