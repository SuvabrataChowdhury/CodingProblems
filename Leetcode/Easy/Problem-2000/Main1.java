import java.util.*;

class Solution{
	public String reversePrefix(String word, char ch){
		StringBuilder temp=new StringBuilder(word);

		int end=temp.indexOf(Character.toString(ch));
		int start=0;

		while(start<=end){
			char t=temp.charAt(start);
			temp.setCharAt(start,temp.charAt(end));
			temp.setCharAt(end,t);

			start++;
			end--;
		}

		return temp.toString();
	}
}

class Main1{
	public static void main(String[] args){
		Solution ob=new Solution();

		System.out.println(ob.reversePrefix(args[0],args[1].charAt(0)));
	}
}
