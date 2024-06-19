import java.util.*;

class Solution{
	public boolean isPrefixString(String s, String[] words){
		String str1="";

		for(String str:words){
			str1=str1+str;

			if(s.equals(str1))
				return true;
		}

		return false;
	}
}

class Main1{
	public static void main(String[] args){
		Solution ob=new Solution();

		String str="iloveleetcode";
		
		System.out.println(ob.isPrefixString(str,args));
	}
}
