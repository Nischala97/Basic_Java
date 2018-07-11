//Serialization and deserialization
import java.io.*;
class Demo implements Serializable
{
	transient int a;
	transient String b;

	public Demo(int a,String b)
	{
		this.a=a;
		this.b=b;
	}
}

public class Serial
{
	public static void main(String[] args)
	{
		Demo object=new Demo(101,"3Edge");
		String filename = "FileTest.txt";		
		//Serialization
		try
		{
			//saving of object in file
			FileOutputStream file=new FileOutputStream(filename);
			ObjectOutputStream out=new ObjectOutputStream(file);
		
			//Method for serialization of object
			out.writeObject(object);
		
			out.close();
			file.close();

			System.out.println("Object has been serialized");	
		}
		catch(IOException ex)
		{       System.out.println("IOException is caught");}

		Demo object1=null;
		//Deserialization
		try
		{
			// Reading the object from a file
			FileInputStream file=new FileInputStream(filename);
			ObjectInputStream in=new ObjectInputStream(file);
		
			// Method for deserialization of object
			object1= (Demo)in.readObject(); 
			in.close();
			file.close();

			System.out.println("Object has been deserialized");
			System.out.println("a = "+object1.a);
			System.out.println("b = "+object1.b);			
		}
		catch(IOException ex)
		{       System.out.println("IOException is caught");}

		catch(ClassNotFoundException ex)
		{       System.out.println("ClassNotFoundException is caught");}
	}
}
