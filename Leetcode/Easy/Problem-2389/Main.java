import java.util.*;

class Solution{
	
	public int[] answerQueries(int[] nums, int[] queries){
		int[] result= new int[queries.length];
		Arrays.sort(nums);

		for(int i=0;i<queries.length;i++){
			result[i]=maxTwoSum(queries[i],nums);
		}

		return result;
	}

	public int maxTwoSum(int query,int[] nums){
		int count=0;
		for(int num:nums){
			if(query>=num){
				count++;
				query-=num;
			}
			else
				break;	
		}
		return count;
		//return (maxCount>count)?maxCount:count;
	}
}

class Main{
	public static void main(String[] args){
		Solution ob=new Solution();

		int[] nums={4,5,2,1};
		int[] queries={3,10,21};

		int[] result=ob.answerQueries(nums,queries);

		for(int i=0;i<result.length;i++){
			System.out.println(result[i]);
		}
	}
}
