interface A
{
	void display();
}
interface B
{
	void display();
}
interface C extends A,B
{
	void display();
}
class Sample
{
	public static void main(String[] args)
	{
		void display()
		{
			System.out.println("ststst");		
		}
		A a=new Sample();
		a.display();
	}
}

