import java.util.*;
class JP
{       String msg;
	void setLetter(String s)	
	{
		msg=s;System.out.println("letter successfully sent by JP");
		System.out.println("message sent is:"+msg);
	}
	String sendLetter()
	{ 
		return msg;
	}
}
class JC extends JP
{
	void recLetter(String msg){  System.out.println("message recieved is:"+msg);}//super.sendLetter());}
}
//////////////////////////////////////////////////////////////////
class MP
{
	String msg;
	void setLetter(String s)	
	{
		msg=s;System.out.println("letter successfully sent by MP");
	}
	String sendLetter()
	{ 
		return msg;
	}
}
class MC extends MP
{
	void recLetter(){  System.out.println("message recieved is:"+super.sendLetter());}
}
//////////////////////////////////////////////////////////////////
class AP
{
	String msg;
	void setLetter(String s)	
	{
		msg=s;System.out.println("letter successfully sent by AP");
	}
	String sendLetter()
	{ 
		return msg;
	}
}
class AC extends AP
{
	void recLetter(){  System.out.println("message recieved is:"+super.sendLetter());}
}
class Casting
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter state (J or M or A):");
		String str=s.next();
		String poc;
		String msg;
		System.out.println("Enter msg:");
		msg=s.next();
	switch(str)
	{	
		case "J":	
			System.out.println("For JP:");
			int i=1;			
			do
			{
				System.out.println("Enter 0 to enter last tc");			
				i=s.nextInt();					
				System.out.println("Enter parent or child"); 			
				poc=s.next();
			
				JC jc =new JC();
				JP jp= jc;
							
				if(poc.charAt(0)=='p')
				{
					jp.setLetter(msg);
				}
	//			msg=JC.sendLetter();
				if(poc.charAt(0)=='c')
				{
					JC jc1=(JC) jp;				
					jc1.recLetter(msg);//msg);
				}
			}while(i!=0);
			System.out.println();
			break;
		case "M":
			System.out.println("For MP:");
			msg=s.next();
			MC mc =new MC();
			MP mp= mc;
			mp.setLetter(msg);
			MC mc1=(MC) mp;
			mc1.recLetter();
	
			System.out.println();
			 break;
		case "A":
			System.out.println("For AP:");
			msg=s.next();
			AC ac =new AC();
			AP ap= ac;
			ap.setLetter(msg);
			AC ac1=(AC) ap;
			ac1.recLetter();
			System.out.println();
			break;
		default:
			System.out.println("Invalid input");
	}
}
}
