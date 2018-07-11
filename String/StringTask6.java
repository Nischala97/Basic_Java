import java.util.*;
import java.io.*;

public class StringTask6
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter String:");
		String str=s.nextLine();
		
		int c=0;
		String[] words=str.split("");
		int[] count=new int[words.length];	
		
		for(int i=0;i<words.length-1;i++)
		{
			c=1;
			for(int j=i+1;j<words.length;j++)
			{	
				//System.out.println("words["+i+"]="+words[i]+" words["+j+"]="+words[j]);
				if(words[i].equals(words[j]))
				{ 
				//	System.out.println("---------------------");
					c++;
					count[j]=1;
				}
				//System.out.println("j="+j+" c="+c);
			}			
			if(count[i]!=1) 
				count[i]=c; 
		}
		for(int i=0;i<words.length;i++)
		{	
			//if(count[i]>1) 
			//	System.out.print(words[i]+" ");
				System.out.println(words[i]+" : "+count[i] +" Times"+" ");
		}	
	}
}
	
