class Solution
{
	public int minDeletion(int[] nums)
	{
		int count=0;
		int ptr1=0,ptr2=1;
		
		while(ptr1<nums.length&&ptr2<nums.length)
		{
			if(nums[ptr1]==nums[ptr2])
			{
				count++;
				ptr2++;
			}
			else
			{
				ptr1=ptr2+1;
				ptr2=ptr1+1;
			}
		}
		
		if((nums.length-count)%2!=0)
			count++;
		
		return count;
	}
}

class Main
{
	public static void main(String[] args)
	{
		Solution ob=new Solution();
		int[] nums=new int[args.length];
		
		for(int i=0;i<args.length;i++)
			nums[i]=Integer.parseInt(args[i]);
		
		System.out.println(ob.minDeletion(nums));
	}
}
