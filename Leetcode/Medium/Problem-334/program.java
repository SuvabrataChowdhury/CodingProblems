class Solution
{
	public boolean increasingTriplet(int[] nums)
	{
		int large2=Integer.MAX_VALUE;
		int large3=Integer.MAX_VALUE;
		
		for(int n:nums)
		{
			if(n<=large3)
				large3=n;
			else if(n<=large2)
				large2=n;
			else
				return true;
		}
		
		return false;
	}
}

class program
{
	public static void main(String[] args)
	{
		Solution ob=new Solution();
		int i=0;
		int[] nums= new int[args.length];
		for(String s:args)
		{
			nums[i++]=Integer.parseInt(s);
		}
		
		System.out.println(ob.increasingTriplet(nums));
	}
}
