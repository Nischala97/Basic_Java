class VarArgs
{
	static int sum(int a,int... numbers)
	{
		int s=0,s1=0;
		for(int i:numbers)
		{ 
			if(i%2==0){s1=s1+i;}
			if(i%2!=0){s=s+i;}		
		} 
		if(a%2==0)
			return s1;
			return s;
	}

	public static void main(String... args)
	{
		System.out.println("sum="+VarArgs.sum(2,2,2,3,6,5));
	}
}
