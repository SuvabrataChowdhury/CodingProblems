import java.util.*;

class Solution{
	public boolean kLengthApart(int[] nums, int k){
		boolean flag=false;
		int dis=0;

		for(int num:nums){
			if(num==1){
				if(!flag)
					flag=true;
				else{
					if(dis<k)
						return false;
					else
						dis=0;
				}
			}
			else
				dis++;
		}

		return true;
	}
}

class Main{
	public static void main(String[] args){
		Solution ob=new Solution();

		int[] nums={1,0,0,1,0,0,1};
		int k=2;

		System.out.println(ob.kLengthApart(nums,k));
	}
}
