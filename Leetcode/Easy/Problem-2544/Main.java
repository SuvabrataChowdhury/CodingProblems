import java.util.*;

class Solution{
	public int alternateDigitSum(int n){
		int sign=1;
		int sum=0,count=0;

		while(n>0){
			sum=sum+sign*(n%10);
			n=n/10;
			sign=sign*(-1);
			count++;
		}

		return (count%2==0)?-sum:sum;
	}
}

class Main{
	public static void main(String[] args){
		Solution ob=new Solution();

		System.out.println(ob.alternateDigitSum(Integer.parseInt(args[0])));
	}
}
