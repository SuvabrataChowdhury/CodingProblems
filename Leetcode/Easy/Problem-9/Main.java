import java.util.*;

class Solution{
	public boolean isPalindrome(int x){
		if(x<0)
			return false;
		else{
			int temp=x;
			int revNum=0;

			while(temp!=0){
				revNum=revNum*10+temp%10;
				temp/=10;
			}

			return (revNum==x)?true:false;
		}
	}
}

class Main{
	public static void main(String[] args){
		Solution ob=new Solution();

		System.out.println(ob.isPalindrome(Integer.parseInt(args[0])));
	}
}
