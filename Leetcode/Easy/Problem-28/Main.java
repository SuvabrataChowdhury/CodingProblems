/*
	Problem:
		Given two strings needle and haystack, return the index of the first occurrence
		of needle in haystack, or -1 if needle is not part of haystack.

		Example 1:

			Input: haystack = "sadbutsad", needle = "sad"
			Output: 0
			Explanation: "sad" occurs at index 0 and 6.
			The first occurrence is at index 0, so we return 0.
		Example 2:

			Input: haystack = "leetcode", needle = "leeto"
			Output: -1
			Explanation: "leeto" did not occur in "leetcode", so we return -1.

		Constraints:

		1 <= haystack.length, needle.length <= 104
		haystack and needle consist of only lowercase English characters.
*/

import java.util.*;

class Solution{
	public int strStr(String haystack, String needle){
		boolean flag=true;
		
		int length1=haystack.length();
		int length2=needle.length();

		for(int i=0;i<length1-length2+1;i++){
			flag=true;

			for(int j=0;j<length2;j++){
				if(haystack.charAt(i+j)!=needle.charAt(j)){
					flag=false;
					break;
				}
			}

			if(flag)
				return i;
		}

		return -1;
	}
}

class Main{
	public static void main(String[] args){
		Solution ob=new Solution();

		System.out.println(ob.strStr(args[0],args[1]));
	}
}
