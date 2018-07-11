import java.util.*;
import java.lang.Math;
public class A2
{
	public static void main(String[] args)
	{
		int nums[]={2, 10, 3, 4, 20, 5};
		for(int i=0;i<nums.length-1;i++)
  		{
    			int j=0;   
   			if(nums[i]%10==0)
    			{
      				for(j=i+1;j<nums.length;j++)
      				{
					if(nums[j]%10!=0)
        					nums[j]=nums[i];
					else break;
      				}
    			} 
  		}
		for(int i=0;i<nums.length;i++)
		{
			System.out.print(nums[i]+" ");
		}	
	}
}
