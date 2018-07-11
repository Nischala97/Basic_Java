public class A3
{
public static void main(String[] args)
{
	int c=0,j=0;
	int nums[]={4, 1, 4, 2};
  	for(int i=0;i<nums.length;i++)
  	{
	    	j=0;
	    	if(nums[i]==4)
	    	{
		//System.out.println("nums["+i+"]="+nums[i]+" c="+c+" j="+j);
			j=i;c=0;
	      		while(j<nums.length)
	      		{
				j++;c++;
			}	
		//System.out.println("nums["+i+"]="+nums[i]+" c="+c+" j="+j);
	    	}		
  	}
	//System.out.println(c+" ");
  	int n[]=new int[c-1];
  	for(int i=nums.length-1,k=c-2;k>=0&&i>=0;)
  	{
	    	n[k]=nums[i];
		//System.out.println("n["+k+"]="+n[k]+" nums["+i+"]="+nums[i]);
		k--;i--;
		//System.out.println("n["+k+"]="+n[k]+" nums["+i+"]="+nums[i]);
		
  	}
	/*for(int i:nums)
	{ 
		System.out.print(i+" ");
	}*/
	System.out.println();
	for(int i:n)
		System.out.print(i+" ");	
}
}
