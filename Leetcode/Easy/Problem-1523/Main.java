import java.util.*;

class Solution{
	public int countOdds(int low, int high){
		if(low%2==1||high%2==1)
			return ((high-low)/2)+1;
		else
			return (high-low)/2;
	}
}

class Main{
	public static void main(String[] args){
		Solution ob=new Solution();

		System.out.println(ob.countOdds(Integer.parseInt(args[0]),Integer.parseInt(args[1])));
	}
}
