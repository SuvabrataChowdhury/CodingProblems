import java.util.*;

class Solution{
	public int countAsterisks(String s){
		String[] words = s.split("\\|");

		int result = 0;
		for(int i=0;i<words.length;i+=2){
			result += words[i].chars().filter(ch -> ch=='*').count();
		}

		return result;
	}
}

class Main{
	public static void main(String[] args){
		Solution ob = new Solution();

		System.out.println(ob.countAsterisks(args[0]));
	}
}
