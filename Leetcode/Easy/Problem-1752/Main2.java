import java.util.*;

class Solution{
	public boolean check(int[] nums){
		boolean breakFound=false;

		for(int i=1;i<nums.length;i++){
			if(nums[i-1]>nums[i]){
				if(breakFound)
					return false;
				else
					breakFound=true;
			}
		}

		return (breakFound)?nums[nums.length-1]<=nums[0]:true;
	}
}

class Main2{
	public static void main(String[] args){
		Solution ob=new Solution();

		int[] nums={3,4,5,1,2};

		System.out.println(ob.check(nums));
	}
}
