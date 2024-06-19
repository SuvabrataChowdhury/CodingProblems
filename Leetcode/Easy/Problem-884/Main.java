/*
	Problem:
		A sentence is a string of single-space separated words where each word consists only of lowercase letters.

		A word is uncommon if it appears exactly once in one of the sentences, and does not appear in the other sentence.

		Given two sentences s1 and s2, return a list of all the uncommon words. You may return the answer in any order.

		Example 1:

			Input: s1 = "this apple is sweet", s2 = "this apple is sour"
			Output: ["sweet","sour"]
		Example 2:

			Input: s1 = "apple apple", s2 = "banana"
			Output: ["banana"]

		Constraints:

		1 <= s1.length, s2.length <= 200
		s1 and s2 consist of lowercase English letters and spaces.
		s1 and s2 do not have leading or trailing spaces.
		All the words in s1 and s2 are separated by a single space.
*/

import java.util.*;

class Solution{
	public String[] uncommonFromSentences(String s1, String s2){
		String[] s1Arr = s1.split(" ");
		String[] s2Arr = s2.split(" ");

		Map<String,Integer> firstSentence = new HashMap<>();
		Map<String,Integer> secondSentence = new HashMap<>();

		for(String word:s1Arr){
			if(firstSentence.containsKey(word))
				firstSentence.put(word,firstSentence.get(word)+1);
			else
				firstSentence.put(word,1);
		}

		for(String word:s2Arr){
			if(secondSentence.containsKey(word))
				secondSentence.put(word,secondSentence.get(word)+1);
			else
				secondSentence.put(word,1);
		}

		List<String> result=new ArrayList<>();
		for(String word:s2Arr){
			if(secondSentence.get(word)==1 && !firstSentence.containsKey(word)){
				result.add(word);
			}

		}

		for(String word:s1Arr){
			if(firstSentence.get(word)==1 && !secondSentence.containsKey(word)){
				result.add(word);
			}
		}

		String[] resultArr=new String[result.size()];
		resultArr=result.toArray(resultArr);
		
		System.out.println(result);

		return resultArr;
	}
}

class Main{
	public static void main(String[] args){
		Solution ob=new Solution();
		
		String s1="apple apple";
		String s2="banana";

		System.out.println(ob.uncommonFromSentences(s1,s2));
	}
}
