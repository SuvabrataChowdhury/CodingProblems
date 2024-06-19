import java.util.*;

class Solution{
	public int fib(int n){
		int t1=0;
		int t2=1;

		if(n==0)
			return 0;
		else if(n==1)
			return 1;
		else{
			int sum=0;

			for(int i=2;i<=n;i++){
				sum=t1+t2;
				t1=t2;
				t2=sum;
			}

			return sum;
		}
	}
}

class Main{
	public static void main(String[] args){
		Solution ob=new Solution();

		System.out.println(ob.fib(Integer.parseInt(args[0])));
	}
}
