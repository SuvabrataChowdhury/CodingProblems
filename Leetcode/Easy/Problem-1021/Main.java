import java.util.*;

class Solution{
	public String removeOuterParentheses(String s){
		String result="";
		int count=0;
		int len=s.length();

		for(int i=0;i<len;i++){
			if(s.charAt(i)=='('){
				count++;

				if(count==1)
					continue;
			}
			else{
				count--;
			}

			if(count!=0)
				result=result+s.charAt(i);
		}

		return result;
	}
}

class Main{
	public static void main(String[] args){
		Solution ob=new Solution();

		String s="(()(()))";

		System.out.println(ob.removeOuterParentheses(s));
	}
}
