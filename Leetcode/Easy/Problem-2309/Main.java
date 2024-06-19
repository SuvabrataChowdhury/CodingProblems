import java.util.*;
/*
	Scan s from left to right and store the letters which appears both in upper case and lower case.

	Out of the collected letters find the maximum one and return it.
	
*/
class Solution{
	public String greatestLetter(String s){
		boolean[] upper=new boolean[26];
		boolean[] lower=new boolean[26];

		for(char chr:s.toCharArray()){
			if(Character.isUpperCase(chr))
				upper[chr-'A']=true;
			else
				lower[chr-'a']=true;
		}
		
		for(int i=25;i>=0;i--){
			if(upper[i]&&lower[i])
				return Character.toString((char)(i+'A'));
		}

		return "";
	}
}

class Main{
	public static void main(String[] args){
		Solution ob=new Solution();

		System.out.println(ob.greatestLetter(args[0]));
	}
}
