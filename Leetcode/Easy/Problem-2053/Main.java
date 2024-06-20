import java.util.*;

class Solution{
	public String kthDistinct(String[] arr, int k){
		Map<String,Integer> map = new HashMap<String,Integer>();

		//Storing the frequencies
		for(String s : arr){
			map.put(s,map.getOrDefault(s,0)+1);
		}

		for(String s : arr){
			if(map.get(s)==1)
				k--;

			if(k==0)
				return s;
		}

		return "";
	}
}

class Main{
	public static void main(String[] args){
		Solution ob = new Solution();

		String[] arr = {"d","b","c","b","c","a"};
		int k = 1;

		System.out.println(ob.kthDistinct(arr,k));
	}
}
