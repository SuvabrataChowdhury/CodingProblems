import java.util.*;

class Solution{
	public String thousandSeparator(int n){
		StringBuilder result=new StringBuilder("");
		int count=0;

		if(n==0)
			return "0";
		else{

			while(n!=0){
				count++;

				if(count>3){
					result.append('.');
					count=0;
				}
				else{
					result.append(n%10);
					n/=10;
				}
			}

			return result.reverse().toString();
		}
	}
}

class Main{
	public static void main(String[] args){
		Solution ob=new Solution();

		System.out.println(ob.thousandSeparator(Integer.parseInt(args[0])));
	}
}
