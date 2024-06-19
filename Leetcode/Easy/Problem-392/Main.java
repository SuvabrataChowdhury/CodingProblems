import java.util.*;

class Solution{
	public boolean isSubsequence(String s, String t){
		int length1=s.length();
		int length2=t.length();
		char[] temp=t.toCharArray();
		
		int matchCnt=0;
		int ptr1=0,ptr2=0;
		while(ptr1<length1&&ptr2<length2){
			if(s.charAt(ptr1)==t.charAt(ptr2)){
				ptr1++;
				matchCnt++;
			}
			
			ptr2++;
		}

		return (matchCnt==length1)?true:false;
	}
}

class Main{
	public static void main(String[] args){
		Solution ob=new Solution();

		System.out.println(ob.isSubsequence(args[0],args[1]));
	}
}
