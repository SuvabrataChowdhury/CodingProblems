import java.util.*;

class Solution{
	public int myAtoi(String s){
		int num=0,sign=1;
		int f=0,index=0;
		int numDigits=0;
		int len=s.length();

		for(index=0;index<len;index++){
			if(s.charAt(index)=='-'||s.charAt(index)=='+'){
				if(index+1<len&&Character.isDigit(s.charAt(index+1))){
					sign=(s.charAt(index)==-1)?-1:1;
					index++;
					break;
				}

				else
					return 0;
			}
			if(Character.isLetter(s.charAt(index)))
				return 0;
			if(Character.isDigit(s.charAt(index)))
				break;
		}

		for(int i=index;i<len;i++){
			if(Character.isDigit(s.charAt(i))){
				num=num*10+(s.charAt(i)-'0');
				numDigits++;
				//System.out.println(num);

				if(numDigits>10){ //Overflow Condition
					f=1;
					break;
				}
			}
			else
				break;
		}

		if(f==1)
			return (sign==1)?Integer.MAX_VALUE:Integer.MIN_VALUE;
			
		return sign*num;
	}
}

class Main{
	public static void main(String[] args){
		Solution ob=new Solution();
		
		String s="+23232323askdhfhf";

		System.out.println(ob.myAtoi(s));
	}
}
