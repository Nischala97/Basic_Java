import java.io.*;
public class FileReadWriteBinary
{
	public static void main(String[] args)
	{
		String filename="TestFile.txt";
		try
		{
			FileInputStream inStream=new FileInputStream(filename);
			FileOutputStream outStream=new FileOutputStream("TestFile1.txt");
/*			byte[] buffer=new byte[10000];				
			int len=inStream.read(buffer);
			
//			System.out.println(len);
//			System.out.println(new String(buffer));
			outStream.write(buffer,0,len);
			
			System.out.println("total="+len);
*/
			int nRead=0;
			byte[] buffer=new byte[1];int i=0;		
			while( (nRead=inStream.read(buffer))>0 )
			{	
				System.out.println(i++);
			//	System.out.println(new String(buffer));
				outStream.write(buffer);
			}
			inStream.close();
			outStream.close();
		}
		catch(IOException ex)
		{
			ex.printStackTrace();
		}
	}
}
