import java.util.*;

class Solution{
	public List<Integer> addToArrayForm(int[] num, int k){
		LinkedList<Integer> result=new LinkedList<Integer>();

		int i=num.length-1;
		while(i>=0||k!=0){
			if(i>=0){
				k=k+num[i];
				i--;
			}

			result.addFirst(k%10);
			k/=10;
		}

		return result;
	}
}

class Main{
	public static void main(String[] args){
		Solution ob=new Solution();

		int[] num={9,9,8};
		int k=111;

		System.out.println(ob.addToArrayForm(num,k));
	}
}
