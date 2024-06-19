import java.util.*;

class Solution{
	public int lastStoneWeight(int[] stones){
		Arrays.sort(stones);

		int result = stones[0];

		for(int i=stones.length-2;i>=0;i--){
			result = Math.abs(stones[i]-stones[i+1]);
			
			stones[i] = result;
			
			for(int j=i+1;j>0;j--){
				if(stones[j]<stones[j-1]){
					int temp = stones[j];
					stones[j] = stones[j-1];
					stones[j-1] = temp;
				}
			}
		}

		return result;
	}
}

class Main{
	public static void main(String[] args){
		Solution ob = new Solution();

		int[] stones = {7,6,7,6,9};
		System.out.println(ob.lastStoneWeight(stones));
	}
}
