import java.util.*;

class Solution{
	public int findClosestNumber(int[] nums){
		int min=Integer.MAX_VALUE;

		for(int i=0;i<nums.length;i++){
			int x=Math.abs(nums[i]);
			if(x<min){
				min=x;
			}
		}

		for(int i=0;i<nums.length;i++){
			if(nums[i]==min)
				return min;
		}

		return -min;
	}
}

class Main{
	public static void main(String[] args){
		int[] nums={-4,-2,4,1,8,-1};

		Solution ob=new Solution();

		System.out.println(ob.findClosestNumber(nums));
	}
}
