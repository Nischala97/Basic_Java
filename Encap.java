import java.util.*;

class Employee
{
	private String username;
	private String password;
	private int id;

	Employee()
	{
		this.id=1;
	}
	public void setUserName(String s)
	{ 
		username=s; 
	}	
	public String getUserName()
	{ 
		return username;
	}	
	
	public void setPassword(String s)
	{ 	
		password=s;
	}	

	public int getId()
	{ 
		return id;
	}
	
	public void display()
	{
		System.out.println("password:"+password);
	}
}
class Encap
{
	public static void main(String[] args)
	{
		Employee e=new Employee();
		e.setUserName("abc");
		System.out.println("username:"+e.getUserName());
		e.setPassword("password");
		System.out.println("id:"+e.getId());
		e.display();
	}
}
