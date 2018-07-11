import java.util.*;

public class A4
{
	public static void main(String[] args)
	{
		int nums[]={1, 2, 3, 2, 5, 2};
		int index=0;int val=2;
		for(int i=1;i<nums.length-1;i++)
 		{
			if(nums[i]==val)
			{
				index=i;
				if(nums.length-1!=index && nums[index-1]!=nums[index] && nums[index]!=nums[index+1])
				{
					if(nums[index-1]>nums[index+1])
						nums[index]=nums[index-1];
					else
						nums[index]=nums[index+1];	
				}
			} 
  		}
		for(int i:nums)
			System.out.print(i+" ");
	}
}
