import java.util.*;

class Solution{
	public String reverseStr(String s, int k){
		char[] str=s.toCharArray();

		int ptr=0;

		while(ptr<str.length){
			if(ptr+k>str.length)
				str=reverse(str,ptr,str.length-1);
			else
				str=reverse(str,ptr,ptr+k-1);

			ptr+=2*k;
		}

		return new String(str);
	}

	char[] reverse(char[] str,int start,int end){
		while(start<=end){
			char temp=str[start];
			str[start]=str[end];
			str[end]=temp;

			start++;
			end--;
		}

		return str;
	}
}

class Main{
	public static void main(String[] args){
		Solution ob=new Solution();

		System.out.println(ob.reverseStr(args[0],Integer.parseInt(args[1])));
	}
}
