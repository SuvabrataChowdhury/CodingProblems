/*
Question:
	Given a pattern and a string s, find if s follows the same pattern.

	Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in s.

	Example 1:

		Input: pattern = "abba", s = "dog cat cat dog"
		Output: true

	Example 2:

		Input: pattern = "abba", s = "dog cat cat fish"
		Output: false

	Example 3:

		Input: pattern = "aaaa", s = "dog cat cat dog"
		Output: false

	Constraints:

		1 <= pattern.length <= 300
		pattern contains only lower-case English letters.
		1 <= s.length <= 3000
		s contains only lowercase English letters and spaces ' '.
		s does not contain any leading or trailing spaces.
		All the words in s are separated by a single space.
*/

import java.util.*;

class Solution{
	public boolean wordPattern(String pattern, String s){
		String[] words=s.split(" ");

		if(pattern.length()!=words.length)
			return false;

		HashMap<String,Character> table = new HashMap<>();
		HashSet<Character> hasOccured = new HashSet<>();
		int i=0;
		for(char p:pattern.toCharArray()){
			if(table.containsKey(words[i])){
				if(table.get(words[i])!=p)
					return false;
			}
			else{
				if(!hasOccured.contains(p)){
					table.put(words[i],p);
					hasOccured.add(p);
				}
				else
					return false;
			}
			i++;
		}

		return true;
	}
}

class Main{
	public static void main(String[] args){
		Solution ob=new Solution();

		String pattern="abba";
		String s="dog cat cat dog";

		System.out.println(ob.wordPattern(pattern,s));
	}
}
