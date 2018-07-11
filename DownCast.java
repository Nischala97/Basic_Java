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
class DownCast
{
	public static void main(String[] args)
	{
		C c=new C();
		B b=c;
		C cc=(C)b; //down casting

		cc.m1();
		cc.m2();
		cc.m3();
	}
}
