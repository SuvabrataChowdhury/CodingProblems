import java.util.*;

class Solution
{
	public int largestPerimeter(int[] nums)
	{
		Arrays.sort(nums);
		
		for(int i=nums.length-1;i>=2;i--)
		{
			if( isValidTriangle(nums[i],nums[i-1],nums[i-2]) )
				return nums[i]+nums[i-1]+nums[i-2];
		}
		
		return 0;
	}
	
	public boolean isValidTriangle(int a,int b,int c)
	{
		if((a+b>c)&&(b+c>a)&&(c+a>b))
			return true;
		return false;
	}
}

class Program
{
	public static void main(String[] args)
	{
		int i=0;
		int[] nums=new int[args.length];
		
		for(String s:args)
		{
			nums[i++]=Integer.parseInt(s);
		}
		
		Solution ob=new Solution();
		System.out.println(ob.largestPerimeter(nums));
	}
}
