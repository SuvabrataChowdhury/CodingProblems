import java.util.*;

class Solution{
	public int maximumDifference(int[] nums){
		int maxDiff=nums[1]-nums[0];
		int min=nums[0];

		for(int i=1;i<nums.length;i++){
			if(nums[i]-min>maxDiff)
				maxDiff=nums[i]-min;
			if(nums[i]<min)
				min=nums[i];
		}

		return (maxDiff<=0)?-1:maxDiff;
	}
}

class Main{
	public static void main(String[] args){
		Solution ob=new Solution();

		int[] nums={10,5,2,1};
		System.out.println(ob.maximumDifference(nums));
	}
}
