import java.io.*;

public class FileReadCharacter
{
	public static void main(String[] args)
	{
		String filename="TestFile2.txt";
		try
		{
			String line=null;
			
			BufferedReader bufferedreader=new BufferedReader(new FileReader(filename));

/*			while( (line = bufferedreader.readLine() )!=null )
			{
				System.out.println(line);
			}
*/
			int value=0;
			while( (value=bufferedreader.read())>0)
			{
				char c=(char)value;
				System.out.print(c);
			}
			bufferedreader.close();
		}
		catch(IOException ex) { }
		//	System.out.println("Error writing file "+filename);
		//	ex.printStackTrace();	
		
	}
}
