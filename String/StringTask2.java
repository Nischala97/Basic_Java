import java.util.*;

public class StringTask2
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int count=0;
		String st="abcdefghijklmnopqrstuvwxyz";
		System.out.println("Enter string:");
		String str=s.nextLine();
		str=str.toLowerCase();
		for(int i=0;i<str.length();i++ )
		{
			for(int j=0;j<st.length();j++)
			{
				if(str.charAt(i)==st.charAt(j))
					count=count+(j+1);
			}	
		}
		System.out.println("Result is:"+count);
	}
}
	
