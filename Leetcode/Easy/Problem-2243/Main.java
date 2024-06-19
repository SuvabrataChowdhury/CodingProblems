import java.util.*;

class Solution{
	public String digitSum(String s, int k){
		int len=s.length();
		//int num=0;
		String temp="";

		while(len>k){
			for(int i=0,num=0;i<len;i++){
				num=num+(s.charAt(i)-'0');

				if((i+1)%k==0||i==len-1){ //group has been formed
					temp=temp+Integer.toString(num);
					num=0;
				}
			}

			s=temp;
			temp="";
			len=s.length();

			//System.out.println(s);
		}

		return s;
	}
}

class Main{
	public static void main(String[] args){
		Solution ob=new Solution();

		System.out.println(ob.digitSum(args[0],Integer.parseInt(args[1])));
	}
}
