import java.util.*;

class Solution{
	public int maximumBags(int[] capacity, int[] rocks, int additionalRocks){
		int fullBags=0;
		int[] need=new int[capacity.length];

		for(int i=0;i<capacity.length;i++){
			need[i]=capacity[i]-rocks[i];
		}

		Arrays.sort(need);

		for(int i=0;i<capacity.length;i++){
			if(additionalRocks<need[i])
				break;

			additionalRocks-=need[i];
			fullBags++;
		}

		return fullBags;
	}
}

class Main{
	public static void main(String[] args){
		int[] capacity={2,3,4,5};
		int[] rocks={1,2,4,4};
		int additionalRocks=2;

		Solution ob=new Solution();

		System.out.println(ob.maximumBags(capacity,rocks,additionalRocks));
	}
}
