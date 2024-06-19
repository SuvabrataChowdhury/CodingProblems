import java.util.*;

class Solution{
	public int findMaxK(int[] nums){
		Set<Integer> table=new HashSet<Integer>();

		for(int num:nums)
			table.add(num);

		int max=-1;

		for(int num:nums){
			if(table.contains((-1)*num)){
				if(Math.abs(num)>max)
					max=num;
			}
		}

		return max;
	}
}

class Main{
	public static void main(String[] args){
		Solution ob=new Solution();

		int[] nums={-1,-4,2,3};
		
		System.out.println(ob.findMaxK(nums));
	}
}
