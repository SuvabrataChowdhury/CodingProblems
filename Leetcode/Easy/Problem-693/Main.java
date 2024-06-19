import java.util.*;

class Solution{
	public boolean hasAlternatingBits(int n){
		int bit;
		int preBit=n%2;
		
		n/=2;

		while(n!=0){
			bit=n%2;

			if(bit==preBit)
				return false;

			n/=2;
			preBit=bit;
		}

		return true;
	}
}

class Main{
	public static void main(String[] args){
		Solution ob=new Solution();

		System.out.println(ob.hasAlternatingBits(Integer.parseInt(args[0])));
	}
}
