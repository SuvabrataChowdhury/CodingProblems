import java.util.*;

class Solution{
	public int findCenter(int[][] edges){
		Set<Integer> table = new HashSet<Integer>();

		table.add(edges[0][0]);
		table.add(edges[0][1]);

		if(table.contains(edges[1][0]))
			return edges[1][0];
		else
			return edges[1][1];
	}
}

class Main{
	public static void main(String[] args){
		Solution ob = new Solution();

		int[][] edges = {
				{1,3},
				{2,3},
				{4,3}
				};

		System.out.println(ob.findCenter(edges));
	}
}
