public class StringFunctions
{
	public static void main(String[] args)
	{
		// split
		String s="3Edge Solutions welcomes you";
		String[] words=s.split(" ");
		for(String word:words)
			System.out.println(word);
		
		String s1="3Edge";
		String s2="3Edge";
		String s3=new String("3Edge");
		String s4="Solutions";

		// equals
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s4));

		// == 
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		System.out.println(s1==s4);

		// compareTo
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareTo(s4));
		System.out.println(s4.compareTo(s1));

		// concat
		s1=s1.concat(s4);
		System.out.println(s1);
		System.out.println(s4);

		// string length
		System.out.println("string s1 is "+s1);
		System.out.println("length of s1 is "+s1.length());

		String s5="Java from 3Edge Solutions from chennai";
		// endsWith
		System.out.println("String s5 is "+s5);
		System.out.println("s5 ends with chennai "+s5.endsWith("chennai"));
		System.out.println("s5 ends with i "+s5.endsWith("i"));

		//startsWith
		System.out.println("s5 starts with Java "+s5.startsWith("Java"));
		System.out.println("s5 starts with J "+s5.startsWith("j"));

		// indexOf
		System.out.println("index of from in s5 "+s5.indexOf("from"));
		System.out.println("index of from in s5 "+s5.indexOf("from",6));

		// lastIndexOf
		System.out.println("last index of from in s5 "+s5.lastIndexOf("from"));
		System.out.println("last index of from in s5 "+s5.lastIndexOf("from",10));

		// String intern (converting reference to literal)
		String ss1=new String("Hello");
		String ss2="Hello";
		System.out.println(ss1==ss2);
		ss1=ss1.intern();
		System.out.println(ss1==ss2);

		// String join
		String result= String.join("-","Welcome","to","3Edge","Solutions");
		System.out.println(result);

		// String replace
		String s6="1-24-64-444";
		System.out.println("s6:"+s6);
		System.out.println("replace '64' in s6:"+s6.replace("64","*"));
		System.out.println("replace '4' in s6:"+s6.replace("4","*"));
	}
}












