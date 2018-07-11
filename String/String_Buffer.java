public class String_Buffer
{
	public static void main(String[] args)
	{
		StringBuffer s1=new StringBuffer("3Edge");
		StringBuffer s2=new StringBuffer("Solutions");

		s1.append(s2);// append String
		System.out.println(s1);

		s1.insert(5," "); //insert(start,"text")
		System.out.println(s1);

		s1.replace(0,5,"Teamware"); // replace(start,end,"text")
		System.out.println(s1);

		s1.delete(0,9); // delete(start,end)
		System.out.println(s1);

		String str=s1.substring(6,9);
		System.out.println(str);
		System.out.println(str.toUpperCase());
	}
}
