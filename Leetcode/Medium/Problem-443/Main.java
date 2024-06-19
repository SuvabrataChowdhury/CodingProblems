import java.util.*;

class Solution{
	public int compress(char[] chars){
		int ptr1=0,ptr2=1;
		int len=0;
		String numRepeat;
		int len1=0;

		while(ptr2<chars.length){
			if(chars[ptr1]!=chars[ptr2]){	
				chars[len++]=chars[ptr1];

				numRepeat=Integer.toString((ptr2-ptr1));
				len1=numRepeat.length();

				if(ptr2-ptr1>1){
					for(int j=0;j<len1;j++){
						chars[len++]=numRepeat.charAt(j);
					}
				}

				ptr1=ptr2;
			}

			ptr2++;
		}

		chars[len++]=chars[ptr1];

		numRepeat=Integer.toString((chars.length-ptr1));
		len1=numRepeat.length();

		if(chars.length-ptr1>1){
			for(int j=0;j<len1;j++){
				chars[len++]=numRepeat.charAt(j);
			}
		}
		
		//System.out.println(chars);

		return len;
	}
}

class Main{
	public static void main(String[] args){
		Solution ob=new Solution();

		System.out.println(ob.compress(args[0].toCharArray()));
	}
}
