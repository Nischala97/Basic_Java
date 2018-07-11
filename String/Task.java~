import java.util.*;
import java.io.*;

public class Task
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter file name:");
		String file=s.nextLine();
		int words=0,lines=0,letters=0,lettersSpace=0;
		try
		{
			String line=null;			
			BufferedReader br=new BufferedReader(new FileReader(file));

			while( (line = br.readLine() )!=null )
			{
				lines++;
				String[] word=line.split(" ");
				words+=word.length;
				String[] letter=line.split("");
				letters+=letter.length;
				for(int i=0;i<letter.length;i++)
				{
					if(!letter[i].equals(" "))
						lettersSpace++;
				}
			}
		
			System.out.println("lines:"+lines);
			System.out.println("words:"+words);
			System.out.println("letters:"+letters);
			System.out.println("letters without space:"+lettersSpace);
		}
		catch(IOException e){ }
	}
}
	
