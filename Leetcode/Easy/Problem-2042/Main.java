import java.util.*;

class Solution{
	public boolean areNumbersAscending(String s){
		int len=s.length();
		int num1=0,num2=-1;
		int f=0;

		for(int i=0;i<len;i++){
			if(Character.isDigit(s.charAt(i))){
				num1=num1*10+(s.charAt(i)-'0');
				f=1;
				continue;
			}
			
			if(s.charAt(i)==' '&&f==1){
				if(num1<=num2)
					return false;
				else{
					num2=num1;
					num1=0;
				}

				f=0;
			}
		}

		return (num1!=0&&num1<=num2)?false:true;
	}
}

class Main{
	public static void main(String[] args){
		Solution ob=new Solution();
		String s="sunset is at 7 51 pm overnight lows will be in the low 55 and 60 s";

		System.out.println(ob.areNumbersAscending(s));
	}
}
