import java.util.*;

class Solution{
	public int minSteps(String s, String t){
		char[] str1=s.toCharArray();
		char[] str2=t.toCharArray();

		Arrays.sort(str1);
		Arrays.sort(str2);

		int count=0;
		int ptr1=0,ptr2=0;

		while(ptr1<str1.length && ptr2<str2.length){
			if(str1[ptr1]==str2[ptr2]){
				count++;
				ptr1++;
				ptr2++;
			}
			else if(str1[ptr1]<str2[ptr2])
				ptr1++;
			else
				ptr2++;
		}

		return str1.length+str2.length-2*count;
	}
}

class Main{
	public static void main(String[] args){
		Solution ob=new Solution();

		System.out.println(ob.minSteps(args[0],args[1]));
	}
}
