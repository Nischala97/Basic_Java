import java.util.*;

public class StringTask3
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		String tmp="";
		System.out.println("Enter string:");
		String str=s.nextLine();
		System.out.println("Enter character to remove");
                char c=s.next().charAt(0);
		System.out.println(c);
		for(int i=0;i<str.length();i++ )
		{
			if(str.charAt(i)!=c)
				tmp+=str.charAt(i);			
		}
		System.out.println("Result string is "+tmp);
	}
}

