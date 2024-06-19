import java.util.*;

class Solution{
	public String makeGood(String s){
		int len=s.length();
		char[] result=new char[len];
		
		int end=-1;

		for(int i=0;i<len;i++){
			if(end<0){
				result[++end]=s.charAt(i);
				continue;
			}

			if((result[end]!=s.charAt(i))&&(Character.toLowerCase(result[end])==s.charAt(i)||Character.toUpperCase(result[end])==s.charAt(i)))
				end--;
			else
				result[++end]=s.charAt(i);
		}

		return new String(Arrays.copyOfRange(result,0,end+1));
	}
}

class Main{
	public static void main(String[] args){
		Solution ob=new Solution();

		System.out.println(ob.makeGood(args[0]));
	}
}
