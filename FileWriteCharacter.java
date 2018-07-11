import java.io.*;

public class FileWriteCharacter
{
	public static void main(String[] args)
	{
		String filename="TestFile2.txt";
		try
		{		
			FileWriter filewriter=new FileWriter(filename);
			BufferedWriter bufferedwriter=new BufferedWriter(filewriter);

			bufferedwriter.write("Hello to ");
			bufferedwriter.write(String.valueOf(1));
			bufferedwriter.newLine();
			bufferedwriter.write("3Edge \nchennai");
			bufferedwriter.close();
		}
		catch(IOException ex)
		{
			System.out.println("Error writing file "+filename);
			ex.printStackTrace();
		}
	}
}
