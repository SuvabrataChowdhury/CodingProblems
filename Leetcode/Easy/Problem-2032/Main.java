import java.util.*;

class Solution{
	public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3){
		Set<Integer> t1=new HashSet<Integer>();
		Set<Integer> t2=new HashSet<Integer>();
		Set<Integer> t3=new HashSet<Integer>();

		for(int num:nums1)
			t1.add(num);
		for(int num:nums2)
			t2.add(num);
		for(int num:nums3)
			t3.add(num);

		List<Integer> result=new ArrayList<Integer>();
		
		for(int num:nums1){
			if(t2.contains(num)||t3.contains(num)){
				result.add(num);
				
				t1.remove(num);
				t2.remove(num);
				t3.remove(num);
			}
		}

		for(int num:nums2){
			if(t1.contains(num)||t3.contains(num)){
				result.add(num);
				
				t1.remove(num);
				t2.remove(num);
				t3.remove(num);
			}
		}

		for(int num:nums3){
			if(t2.contains(num)||t1.contains(num)){
				result.add(num);
				
				t1.remove(num);
				t2.remove(num);
				t3.remove(num);
			}
		}

		return result;
	}
}

class Main{
	public static void main(String[] args){
		Solution ob=new Solution();

		int[] nums1={3,1};
		int[] nums2={2,3};
		int[] nums3={1,2};

		System.out.println(ob.twoOutOfThree(nums1,nums2,nums3));
	}
}
