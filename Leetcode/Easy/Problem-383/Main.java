import java.util.*;

class Solution{
	public boolean canConstruct(String ransomNote, String magazine){
		int[] freq = new int[26];

		for(char c : ransomNote.toCharArray()){
			freq[c-'a']++;
		}

		for(char c : magazine.toCharArray()){
			freq[c-'a']--;
		}

		for(int i : freq){
			if(i>0)
				return false;
		}

		return true;
	}
}

class Main{
	public static void main(String[] args){
		Solution ob = new Solution();

		System.out.println(ob.canConstruct(args[0],args[1]));
	}
}
