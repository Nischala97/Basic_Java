interface Bank
{
	float rateOfInterest();
}
interface RBI
{
	int x=5;
}
class SBI implements Bank,RBI
{
	public float rateOfInterest(){
		 return 9.15f;
	}
}
class PNB implements Bank
{
	public float rateOfInterest(){ 
		return 9.7f;
	}
}
public class TestInterface
{
	public static void main(String[] args)
	{
		Bank b=new SBI();
		RBI r=new SBI();
		SBI s=new SBI();
		System.out.println("ROI:"+s.rateOfInterest()+" "+s.x);
	}
}
