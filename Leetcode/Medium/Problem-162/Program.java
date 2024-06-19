class Solution
{
	public int findPeakElement(int[] nums)
	{
		int low=0;
		int high=nums.length-1;
		
		int mid;
		
		while(low<high)
		{
			mid=(high+low)/2;
			
			if(nums[mid]<nums[mid+1])
				low=mid+1;
			else
				high=mid-1;
		}
		
		return low;
	}
}

class Program
{
	public static void main(String[] args)
	{
		Solution ob=new Solution();
		
		int[] nums=new int[args.length];
		int i=0;
		for(String s:args)
		{
			nums[i++]=Integer.parseInt(s);
		}
		
		System.out.println(ob.findPeakElement(nums));
	}
}
