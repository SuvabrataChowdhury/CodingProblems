import java.util.*;

class Solution{
	public int minTimeToType(String word){
		int time=0;
		int point=(int)'a';

		int len=word.length();

		for(int i=0;i<len;i++){
			char c=word.charAt(i);
			int clkDis=(int)Math.abs(point-(int)c);
			int antiClkDis=26-clkDis;

			time+=(clkDis<antiClkDis)?clkDis:antiClkDis;

			point=(int) c;

			time++;
		}

		return time;
	}
}

class Main{
	public static void main(String[] args){
		Solution ob=new Solution();

		System.out.println(ob.minTimeToType(args[0]));
	}
}
