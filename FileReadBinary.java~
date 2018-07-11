import java.io.*;

public class FileReadBinary
{
	public static void main(String[] args)
	{
		String filename="TestFile.txt";
		try
		{
			byte[] buffer= new byte[74];
			FileInputStream inStream=new FileInputStream(filename);
			int total=0,nRead=0;
			//here the length should be more positive that means (>0)			
			while( (nRead=inStream.read(buffer))>=0 )
			{
			//new String is created bcuz buffer is in byte format so while printing we are converting it to string.
				System.out.println(new String(buffer));				
				total+=nRead;							
			}
			inStream.close();
			System.out.println("Read "+total+" bytes.");
		}
		catch(IOException ex)
		{
			System.out.println("Error writing file "+filename);
			ex.printStackTrace();
		}
	}
}
