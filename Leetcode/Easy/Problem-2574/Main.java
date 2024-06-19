import java.util.*;

class Solution{
	public int[] leftRigthDifference(int[] nums){
		int sum=0;
		
		int[] leftSum=new int[nums.length];
		int[] rightSum=new int[nums.length];

		for(int i=0;i<nums.length;i++){
			leftSum[i]=sum;
			sum+=nums[i];
		}

		sum=0;

		for(int i=nums.length-1;i>=0;i--){
			rightSum[i]=sum;
			sum+=nums[i];
		}

		for(int i=0;i<nums.length;i++)
			nums[i]=Math.abs(leftSum[i]-rightSum[i]);

		return nums;
	}
}

class Main{
	public static void main(String[] args){
		Solution ob=new Solution();

		int[] nums={10,4,8,3};
		System.out.println(Arrays.toString(ob.leftRigthDifference(nums)));
	}
}
