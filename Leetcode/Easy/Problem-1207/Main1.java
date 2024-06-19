import java.util.*;

class Solution{
	public boolean uniqueOccurrences(int[] arr){
		int[] freq=new int[2000];

		for(int i=0;i<arr.length;i++){
			if(arr[i]<0)
				freq[1000+Math.abs(arr[i])]++;
			else
				freq[arr[i]]++;
		}

		Set<Integer> table=new HashSet<Integer>(2000);

		for(int i=0;i<freq.length;i++){
			if(freq[i]!=0){
				if(table.contains(freq[i]))
					return false;
				table.add(freq[i]);
			}
		}

		return true;
	}
}

class Main1{
	public static void main(String[] args){
		Solution ob=new Solution();

		int[] arr={1,2,2,3,3};
		System.out.println(ob.uniqueOccurrences(arr));
	}
}
