import java.util.*;

class Solution{
	public boolean check(int[] nums){
		boolean breakFound=false;
		int breakIndex=-1;

		for(int i=1;i<nums.length;i++){
			if(nums[i]<nums[i-1]){
				if(breakFound)
					return false;

				breakFound=true;
				breakIndex=i-1;
			}
		}

		if(breakIndex!=-1){
			for(int i=0;i<=breakIndex;i++){
				for(int j=breakIndex+1;j<nums.length;j++){
					if(nums[i]<=nums[j])
						return false;
				}
			}
		}

		return true;
	}
}

class Main{
	public static void main(String[] args){
		Solution ob=new Solution();

		int[] nums={1,2,3,4};

		System.out.println(ob.check(nums));
	}
}
