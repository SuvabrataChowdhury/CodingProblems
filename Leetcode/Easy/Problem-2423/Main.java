import java.util.*;

class Solution{
	public boolean equalFrequency(String word){
		Map <Character,Integer> freq=new HashMap<Character,Integer>();
		char[] wordArray=word.toCharArray();

		for(char c:wordArray){
			if(freq.containsKey(c))
				freq.put(c,freq.get(c)+1);
			else
				freq.put(c,1);
		}

		Integer[] freqArr=freq.values().toArray(new Integer[0]);
		Arrays.sort(freqArr);
		
		System.out.println(Arrays.toString(freqArr));

		boolean deleted=false;
		int ptr=1;

		if(freqArr[ptr-1]==1 && freqArr[ptr]!=freqArr[ptr-1]){
			deleted=true;
			ptr++;
		}

		for(;ptr<freqArr.length;ptr++){
			if(freqArr[ptr]!=freqArr[ptr-1]){
				if(freqArr[ptr]-freqArr[ptr-1]==1){
					if(deleted)
						return false;
					else{
						freqArr[ptr]--;
						deleted=true;
					}
				}
				else
					return false;
			}
		}

		return (!deleted && freqArr[0]==1)?(!deleted):deleted;
	}
}

//Driver Class
class Main{
	public static void main(String[] args){
		Solution ob=new Solution();

		System.out.println(ob.equalFrequency(args[0]));
	}
}
