import java.io.*;

public class FileDemo
{
	public static void main(String[] args)
	{
		try
		{
			File file=new File("Test");
			
			System.out.println(file.canRead());
			System.out.println(file.canWrite());

			//System.out.println(file.createNewFile());
			//System.out.println(file.delete());

			System.out.println(file.getAbsolutePath());
		
			System.out.println(file.isDirectory());
			System.out.println(file.isFile());

			System.out.println(file.isHidden());
			System.out.println(file.list());
		}
		catch(Exception ex) {}		
	}
}
