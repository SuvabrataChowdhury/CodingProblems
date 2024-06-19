import java.util.*;

class Solution{
	public int findJudge(int n, int[][] trust){
		int[] count=new int[n];

		for(int i=0;i<trust.length;i++){
			count[trust[i][0]-1]--;
			count[trust[i][1]-1]++;
		}

		for(int i=0;i<n;i++){
			if(count[i]==n-1)
				return i+1;
		}

		return -1;
	}
}

class Main{
	public static void main(String[] args){
		Solution ob=new Solution();

		int[][] trust={{1,3},{2,3}};
		int n=3;
		System.out.println(ob.findJudge(n,trust));
	}
}
