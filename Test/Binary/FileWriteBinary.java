import java.io.*;

public class FileWriteBinary
{
	public static void main(String[] args)
	{
		String filename="TestFile.txt";
		try
		{
			String bytes = "Hello to 3Edge solutions - chennai\ngoes to next line\nthis goes to next one/\n another line";
//			String bytes= " \nNew data1";
			byte[] buffer=bytes.getBytes(); //getBytes is a method of string class
			FileOutputStream outStream = new FileOutputStream(filename);
			outStream.write(buffer);
			outStream.close();

			System.out.println("File created as "+buffer.length+" bytes.");
		}	
		catch(IOException ex)
		{
			System.out.println("Error writing file "+filename);
			ex.printStackTrace();
		}
	}
}
