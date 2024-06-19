import java.util.*;

class Solution{
	public int minimumSum(int num){
		int[] nums=new int[4];

		for(int i=0;num!=0;i++){
			nums[i]=num%10;
			num/=10;
		}

		Arrays.sort(nums);

		return (nums[0]+nums[1])*10+nums[2]+nums[3];
	}
}

class Main{
	public static void main(String[] args){
		Solution ob=new Solution();

		System.out.println(ob.minimumSum(Integer.parseInt(args[0])));
	}
}
