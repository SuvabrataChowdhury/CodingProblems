/*
	Question:
		
		You are given a string s formed by digits and '#'. We want to map s to English lowercase characters as follows:

		    Characters ('a' to 'i') are represented by ('1' to '9') respectively.
		    Characters ('j' to 'z') are represented by ('10#' to '26#') respectively.

		Return the string formed after mapping.

		The test cases are generated so that a unique mapping will always exist.

		Example 1:

		Input: s = "10#11#12"
		Output: "jkab"
		Explanation: "j" -> "10#" , "k" -> "11#" , "a" -> "1" , "b" -> "2".

		Example 2:

		Input: s = "1326#"
		Output: "acz"

		Constraints:

		    1 <= s.length <= 1000
		    s consists of digits and the '#' letter.
		    s will be a valid string such that mapping is always possible.
*/
import java.util.*;

class Solution{
	public String freqAlphabets(String s){
		StringBuilder result=new StringBuilder("");

		int len=s.length();
		boolean isCounting=false;

		for(int i=len-1;i>=0;i--){
			if(s.charAt(i)=='#'){
				isCounting=true;
				continue;
			}

			if(isCounting){
				result.append((char)('a'+(s.charAt(i-1)-'0')*10+(s.charAt(i)-'0')-1));
				i--;
				isCounting=false;
			}
			else
				result.append((char)('a'+(s.charAt(i)-'0')-1));
		}

		return result.reverse().toString();
	}
}

class Main{
	public static void main(String[] args){
		Solution ob=new Solution();
		
		String s="1326#";

		System.out.println(ob.freqAlphabets(s));
	}
}
