import java.util.*;

class Solution{
	public List<Integer> findDisappearedNumbers(int[] nums){
		Set<Integer> table=new HashSet<>();

		for(int i=1;i<=nums.length;i++){
			table.add(i);
		}

		for(int num:nums){
			table.remove(num);
		}

		return new ArrayList<Integer>(table);
	}
}

class Main{
	public static void main(String[] args){
		Solution ob=new Solution();

		int[] nums={1};

		System.out.println(ob.findDisappearedNumbers(nums));
	}
}
