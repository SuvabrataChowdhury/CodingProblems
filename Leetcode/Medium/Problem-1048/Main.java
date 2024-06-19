import java.util.*;

class Solution{
	public int longestStrChain(String[] words){
		Arrays.sort(words);
		
		int n=words.length();
		Set<String> table=new HashSet<String>();
		for(int i=0;i<n;i++){
			table.add(words[i]);
		}
		
		for(int i=n-1;i>=0;i--){
			count=longCount(words[i],table);
		}
	}
	
	int longCount(String word,Set<String> table){
		int n=word.length();
		
		for(int i=0;i<n;i++){
			String temp=word.subString(0,i)+word.subString(i,n);
			
			if(table.contains(temp))
				longCount(temp,table);
		}
	}
}
