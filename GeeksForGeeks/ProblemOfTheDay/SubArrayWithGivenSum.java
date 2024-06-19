/*
	Question:

		Given an unsorted array A of size N that contains only positive integers,
		find a continuous sub-array that adds to a given number S and return the left
		and right index(1-based indexing) of that subarray.

		In case of multiple subarrays, return the subarray indexes which come first on
		moving from left to right.

		Note:- You have to return an ArrayList consisting of two elements left and right.
		In case no such subarray exists return an array consisting of element -1.

		Example 1:

			Input:
			N = 5, S = 12
			A[] = {1,2,3,7,5}
			Output: 2 4
			Explanation: The sum of elements 
			from 2nd position to 4th position 
			is 12.

		Example 2:

			Input:
			N = 10, S = 15
			A[] = {1,2,3,4,5,6,7,8,9,10}
			Output: 1 5
			Explanation: The sum of elements 
			from 1st position to 5th position
			is 15.

		Your Task:
			You don't need to read input or print anything. The task is to complete
			the function subarraySum() which takes arr, N, and S as input parameters
			and returns an ArrayList containing the starting and ending positions of
			the first such occurring subarray from the left where sum equals to S. The
			two indexes in the array should be according to 1-based indexing. If no such
			subarray is found, return an array consisting of only one element that is -1.

		Expected Time Complexity: O(N)
		Expected Auxiliary Space: O(1)

		Constraints:
		1 <= N <= 105
		1 <= Ai <= 109
		0<= S <= 109

*/

/*
	Algorithm subArraySum(Arr,length,targetSum){
		ptr1:=0;
		ptr2:=0;

		sum:=0;

		while ptr1<length && ptr2<length do{
			sum:=sum+Arr[ptr2];

			if sum<targetSum then{
				ptr2++;
			}
			else if sum=targetSum then{
				return [ptr1,ptr2];
			}
			else{
				if ptr1=ptr2 then{
					ptr1++;
					ptr2++;

					sum=0;
				}
				else{
					sum:=sum-Arr[ptr1];
					ptr1++;

					sum:=sum-Arr[ptr2];
				}
			}
		}

		return [-1];
	}

*/

import java.util.*;

class Solution{
	static ArrayList<Integer> subarraySum(int[] arr, int n, int s){
		ArrayList<Integer> result=new ArrayList<Integer>();

		int ptr1=0;
		int ptr2=0;

		int sum=0;

		while(ptr2<n && ptr1<=ptr2){
			sum+=arr[ptr2];

			if(sum<s){
				ptr2++;
			}
			else if(sum==s){
				result.add(ptr1+1);
				result.add(ptr2+1);

				return result;
			}
			else{
				if(ptr1==ptr2){
					ptr1++;
					ptr2++;

					sum=0;
				}
				else{
					sum-=arr[ptr1++];
					sum-=arr[ptr2];
				}
			}
		}

		result.add(-1);
		return result;
	}
}

class SubArrayWithGivenSum{
	public static void main(String[] args){
		Solution ob=new Solution();

		int[] arr={1,20,3,4,5,6,7,8,9,10};
		int sum=3;

		System.out.println(ob.subarraySum(arr,arr.length,sum));
	}
}
