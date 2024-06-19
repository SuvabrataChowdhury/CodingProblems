/*
	Question:

		Given two positive integers left and right, find the two integers num1 and num2 such that:

		    left <= nums1 < nums2 <= right .
		    nums1 and nums2 are both prime numbers.
		    nums2 - nums1 is the minimum amongst all other pairs satisfying the above conditions.

		Return the positive integer array ans = [nums1, nums2].
		If there are multiple pairs satisfying these conditions,
		return the one with the minimum nums1 value or [-1, -1] if such numbers do not exist.

		A number greater than 1 is called prime if it is only divisible by 1 and itself.

		Example 1:

			Input: left = 10, right = 19
			Output: [11,13]
			Explanation: The prime numbers between 10 and 19 are 11, 13, 17, and 19.
			The closest gap between any pair is 2, which can be achieved by [11,13] or [17,19].
			Since 11 is smaller than 17, we return the first pair.

		Example 2:

			Input: left = 4, right = 6
			Output: [-1,-1]
			Explanation: There exists only one prime number in the given range, so the conditions cannot be satisfied.

		Constraints:
		    1 <= left <= right <= 10^6
*/

/*
	Algorithm closestPrimes(left,right){
		prime:=genPrime(left,right);

		minIndex:=INFINITY;
		for i:=1 to prime.length-1 do{
			if prime[i]-prime[i-1] < prime[minIndex]-prime[minIndex-1] then{
				minIndex:=i;
			}
		}

		if minIndex=INFINITY then
			return [-1,-1];
		else
			return [prime[minIndex-1],prime[minIndex]];
	}
*/

import java.util.*;

class Solution{
	public int[] closestPrimes(int left, int right){
		ArrayList<Integer> primes=new ArrayList<>();

		for(int i=left;i<=right;i++){
			if(isPrime(i))
				primes.add(i);
		}

		int minIndex=1;

		for(int i=1;i<primes.size();i++){
			if(primes.get(i)-primes.get(i-1)<primes.get(minIndex)-primes.get(minIndex-1))
				minIndex=i;
		}

		if(primes.size()<2)
			return new int[]{-1,-1};
		else
			return new int[]{primes.get(minIndex-1),primes.get(minIndex)};
	}

	public boolean isPrime(int num){
		if(num<=1)
			return false;

		int lim=(int) Math.sqrt(num);

		for(int i=2;i<=lim;i++){
			if(num%i==0)
				return false;
		}

		return true;
	}
}

class Main{
	public static void main(String[] args){
		Solution ob=new Solution();
		
		System.out.println(Arrays.toString(ob.closestPrimes(Integer.parseInt(args[0]),Integer.parseInt(args[1]))));
	}
}
