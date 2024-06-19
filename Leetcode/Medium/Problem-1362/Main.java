/*
	Question:

		Given an integer num, find the closest two integers in absolute 
		difference whose product equals num + 1 or num + 2.

		Return the two integers in any order.

		Example 1:

			Input: num = 8
			Output: [3,3]
			Explanation: For num + 1 = 9, the closest divisors are 3 & 3,
			for num + 2 = 10, the closest divisors are 2 & 5, hence 3 & 3 is chosen.

		Example 2:

			Input: num = 123
			Output: [5,25]

		Example 3:

			Input: num = 999
			Output: [40,25]

		Constraints:

		    1 <= num <= 10^9
*/

import java.util.*;

class Solution{
	public int[] closestDivisors(int num){
		int[] result1=exactDivisor(num+1);
		int[] result2=exactDivisor(num+2);

		return (Math.abs(result1[0]-result1[1])<Math.abs(result2[0]-result2[1]))?result1:result2;
	}

	int[] exactDivisor(int num){
		int[] result=new int[2];
		for(int i=(int)Math.sqrt(num);i>=1;i--){
			if(num%i==0){
				result[0]=i;
				result[1]=num/i;

				break;
			}
		}

		return result;
	}
}

class Main{
	public static void main(String[] args){
		Solution ob=new Solution();

		int num=999;

		System.out.println(Arrays.toString(ob.closestDivisors(num)));
	}
}
