enum Season{winter,summer,spring,rain}
public class Enum
{
//	public enum Season{winter,summer,spring,rain}
	
	public static void main(String[] args)
	{
		for(Season s: Season.values())
		{
			System.out.println(s);
		}
	}
}
