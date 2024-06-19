import java.util.*;

class Solution{
	public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3){
		int[] hash1=new int[101];
		int[] hash2=new int[101];
		int[] hash3=new int[101];

		for(int num:nums1)
			hash1[num]++;
		for(int num:nums2)
			hash2[num]++;
		for(int num:nums3)
			hash3[num]++;

		List<Integer> result=new ArrayList<Integer>();

		for(int i=1;i<=100;i++){
			if((hash1[i]>0&&hash2[i]>0)||(hash2[i]>0&&hash3[i]>0)||(hash1[i]>0&&hash3[i]>0))
				result.add(i);
		}

		return result;
	}
}

class Main1{
	public static void main(String[] args){
		Solution ob=new Solution();

		int[] nums1={3,1};
		int[] nums2={2,3};
		int[] nums3={1,2};

		System.out.println(ob.twoOutOfThree(nums1,nums2,nums3));
	}
}
