import java.util.*;
public class StringTask1
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int count=0;
		System.out.println("Enter string:");
		String str=s.nextLine();
		str=str.toLowerCase();
		for(int i=0;i<str.length();i++ )
		{
			if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')
				count++;	
		}
		System.out.println("No.of vowels:"+count);
	}
}	
