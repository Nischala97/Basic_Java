interface Drawable
{
	void draw();
	default final void msg()
	{
		System.out.println("default");
	}
}
class Rectangle implements Drawable
{
	public void draw()
	{
		System.out.println("draw rectangle");
	}
	public void msg()
	{
		System.out.println("default overridden");
	}
}
class TestInterfaceDefault
{
	public static void main(String[] args)
	{
		Drawable d=new Rectangle();
		d.draw();
		d.msg();
	}
}
