import java.util.*;

/*
	The Idea is to use a sliding window.
	Whenever the difference between max and min items within the window exceeds the limit slide the window.
	To track max and min elements within the window use two deques (one for tracking maximums and another for tracking minimums).
	If window moves then pop the first element.
	If window size increases then append the new element into the deques maintaining its orders.

	Keep track of difference between max and min items within the window.
	If the differenc is within limit then update the maxlength.
*/

class Solution{
	public int longestSubarray(int[] nums, int limit){
		Deque<Integer> increase = new ArrayDeque<Integer>();
		Deque<Integer> decrease = new ArrayDeque<Integer>();

		int ptr1 = 0;
		int ptr2 = 0;

		int maxLength = 1;
		while(ptr2<nums.length){
			while(increase.size()>0 && increase.getLast()>nums[ptr2])
				increase.removeLast();

			while(decrease.size()>0 && decrease.getLast()<nums[ptr2])
				decrease.removeLast();

			increase.addLast(nums[ptr2]);
			decrease.addLast(nums[ptr2]);
			
			if(decrease.getFirst()-increase.getFirst() <= limit){
				maxLength = Math.max(maxLength,ptr2-ptr1+1);
			}
			else{
				if(nums[ptr1]==increase.getFirst())
					increase.removeFirst();

				if(nums[ptr1]==decrease.getFirst())
					decrease.removeFirst();

				ptr1++;
			}

			ptr2++;
		}

		return maxLength;
	}
}

class Main{
	public static void main(String[] args){
		Solution ob = new Solution();

		int[] nums = {10,1,2,4,7,2};
		int limit = 5;

		System.out.println(ob.longestSubarray(nums,limit));
	}
}
