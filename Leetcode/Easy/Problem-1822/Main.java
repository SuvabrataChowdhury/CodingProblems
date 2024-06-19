import java.util.*;

class Solution{
	public int arraySign(int[] nums){
		int sign=(nums[0]<0)?-1:1;

		if(nums[0]!=0){
			for(int i=1;i<nums.length;i++){
				if(nums[i]==0)
					return 0;
				if(nums[i]<0)
					sign*=(-1);
			}

			return sign;
		}
		else
			return 0;
	}
}

class Main{
	public static void main(String[] args){
		int[] nums={-1,1,-1,1,-1};

		Solution ob=new Solution();
		System.out.println(ob.arraySign(nums));
	}
}
