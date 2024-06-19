import java.util.*;

class Solution{
	public boolean uniqueOccurrences(int[] arr){
		Arrays.sort(arr);

		Set<Integer> table=new HashSet<Integer>();
		
		int freq=1;
		for(int i=1;i<arr.length;i++){
			if(arr[i]!=arr[i-1]){
				if(table.contains(freq))
					return false;
				else{
					table.add(freq);
					freq=0;
				}
			}

			freq++;
		}

		return (table.contains(freq))?false:true;
	}
}

class Main{
	public static void main(String[] args){
		Solution ob=new Solution();

		int[] arr={1,2,2,3,3};
		System.out.println(ob.uniqueOccurrences(arr));
	}
}
