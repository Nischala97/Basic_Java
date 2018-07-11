import java.util.*;

public class UserDefined extends Exception
{
	String msg;
	public UserDefined(String msg)
	{
		super(msg);		
		this.msg=msg;
	}
	/*public String getMsg()
	{
		return msg;
	}*/
	public static void main(String[] args)
	{
		while(true)
		{		
		Scanner s=new Scanner(System.in);
		try
		{	
			System.out.println("Enter value:");
			String st=s.next();
			if(st.length()!=10)
			{
				UserDefined ud=new UserDefined("Invalid number");
				throw ud;
			}
			System.out.println(st+" is a valid number");
		break;
		}
		catch(UserDefined ud)
		{
			//System.out.println("Invalid number");
			//System.out.println("Error "+ud.getMsg());
			System.out.println("Error "+ud.getMessage());
		}
		}
	}
}
