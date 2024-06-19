import java.util.*;

class Solution{
	public String reversePrefix(String word, char ch){
		int i,f=0;
		int n=word.length();
		String temp="";

		for(i=0;i<n;i++){
			temp=temp+word.charAt(i);
			if(word.charAt(i)==ch){
				f=1;
				break;
			}
		}

		StringBuilder rev=new StringBuilder(temp);
		
		if(f==1){
			rev.reverse();

			return rev.toString()+word.substring(i+1,n);
		}
		else
			return temp;

	}
}

class Main{
	public static void main(String[] args){
		Solution ob=new Solution();

		System.out.println(ob.reversePrefix(args[0],args[1].charAt(0)));
	}
}

